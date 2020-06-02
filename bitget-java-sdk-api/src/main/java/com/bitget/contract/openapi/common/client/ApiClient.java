package com.bitget.contract.openapi.common.client;

import com.bitget.contract.openapi.common.constant.HttpHeader;
import com.bitget.contract.openapi.common.domain.ClientParameter;
import com.bitget.contract.openapi.common.utils.SignatureUtils;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class ApiClient {
    private final Retrofit retrofit;
    /**
     * 超时时间
     */
    private final ClientParameter parameter;

    ApiClient(ClientParameter parameter) {
        this.parameter = parameter;
        retrofit = new Retrofit.Builder()
                .baseUrl(parameter.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient())
                .build();
    }

    public <T> T create(Class<T> clazz) {
        return retrofit.create(clazz);
    }

    private OkHttpClient httpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new SignInterceptor(parameter))
                .addInterceptor(new HttpStatusInterceptor())
                .connectTimeout(parameter.getTimeout(), TimeUnit.SECONDS)
                .readTimeout(parameter.getTimeout(), TimeUnit.SECONDS)
                .build();
    }

    /**
     * 签名过滤器
     */
    private class SignInterceptor implements Interceptor {

        private final ClientParameter clientParameter;

        SignInterceptor(ClientParameter clientParameter) {
            this.clientParameter = clientParameter;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request original = chain.request();
            String timestamp = String.valueOf(System.currentTimeMillis());
            String contentType = "application/json";
            try {
                String sign = SignatureUtils.generate(timestamp,
                        original.method().toUpperCase(),
                        original.url().url().getPath(),
                        original.url().encodedQuery(),
                        original.body() == null ? "" : bodyToString(original),
                        clientParameter.getSecretKey());

                String localFormat = "locale=%s";
                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader(HttpHeader.ACCESS_KEY, clientParameter.getApiKey())
                        .addHeader(HttpHeader.ACCESS_PASSPHRASE, clientParameter.getPassphrase())
                        .addHeader(HttpHeader.ACCESS_SIGN, sign)
                        .addHeader(HttpHeader.CONTENT_TYPE, contentType)
                        .addHeader(HttpHeader.COOKIE, String.format(localFormat, clientParameter.getLocale()))
                        .addHeader(HttpHeader.X_LOCALE, clientParameter.getLocale())
                        .addHeader(HttpHeader.ACCESS_TIMESTAMP, timestamp);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private String bodyToString(Request request) {
            try {
                Request copy = request.newBuilder().build();
                Buffer buffer = new Buffer();
                copy.body().writeTo(buffer);
                return buffer.readUtf8();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * http 请求返回状态过滤器
     */
    private class HttpStatusInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Response response = chain.proceed(chain.request());
            if (response.isSuccessful()) {
                return response;
            }

            throw new RuntimeException(" call " + chain.request().url().url().getPath()
                    + " failed, status : " + response.code() + ", body : " + response.body().string());
        }
    }
}
