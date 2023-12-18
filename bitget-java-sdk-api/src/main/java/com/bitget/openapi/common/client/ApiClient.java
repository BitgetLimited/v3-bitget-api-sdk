package com.bitget.openapi.common.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.common.constant.HttpHeader;
import com.bitget.openapi.common.domain.ClientParameter;
import com.bitget.openapi.common.enums.SignTypeEnum;
import com.bitget.openapi.common.utils.SignatureUtils;
import com.bitget.openapi.dto.response.ResponseResult;
import okhttp3.*;
import okio.Buffer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Set;
import java.util.TreeMap;
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
        public Response intercept(Chain chain) {
            Request original = chain.request();
            String timestamp = String.valueOf(System.currentTimeMillis());
            String contentType = "application/json";
            String sortedQuery = getSortedQuery(original); // original.url().encodedQuery();
            String url = parseToString(original.url().scheme())
                    + "://"
                    + parseToString(original.url().host())
                    + parseToString(original.url().url().getPath());
            if (StringUtils.isNotBlank(sortedQuery)) {
                url = url + "?" + sortedQuery;
            }
            try {
                String sign = SignatureUtils.generate(timestamp,
                        original.method(),
                        original.url().url().getPath(),
                        sortedQuery, // original.url().encodedQuery(),
                        original.body() == null ? "" : bodyToString(original),
                        clientParameter.getSecretKey());
                if (SignTypeEnum.RSA == clientParameter.getSignType()) {
                    sign = SignatureUtils.restGenerateRsaSignature(timestamp,
                            original.method(),
                            original.url().url().getPath(),
                            sortedQuery, // original.url().encodedQuery(),
                            original.body() == null ? "" : bodyToString(original),
                            clientParameter.getSecretKey());
                }

                String localFormat = "locale=%s";
                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader(HttpHeader.ACCESS_KEY, clientParameter.getApiKey())
                        .addHeader(HttpHeader.ACCESS_PASSPHRASE, clientParameter.getPassphrase())
                        .addHeader(HttpHeader.ACCESS_SIGN, sign)
                        .addHeader(HttpHeader.CONTENT_TYPE, contentType)
                        .addHeader(HttpHeader.COOKIE, String.format(localFormat, clientParameter.getLocale()))
                        .addHeader(HttpHeader.LOCALE, clientParameter.getLocale())
                        .addHeader(HttpHeader.ACCESS_TIMESTAMP, timestamp)
                        .url(url);

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

        private String parseToString(String value) {
            if (StringUtils.isBlank(value)) {
                return "";
            }
            return value;
        }

        private String getSortedQuery(Request original) {
            if (CollectionUtils.isEmpty(original.url().queryParameterNames())) {
                return "";
            }

            Set<String> keys = original.url().queryParameterNames();
            TreeMap<String, Object> params = new TreeMap<>();
            for (String key : keys) {
                if (StringUtils.isBlank(key)) {
                    continue;
                }

                params.put(key, original.url().queryParameter(key));
            }
            if (params.size() == 0) {
                return "";
            }

            return composeParams(params);
        }

        private String composeParams(TreeMap<String, Object> params) {
            StringBuffer sb = new StringBuffer();
            params.forEach((s, o) -> {
                try {
                    sb.append(s).append("=").append(URLEncoder.encode(String.valueOf(o), "UTF-8")).append("&");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            });
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
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

            if (response.body() == null) {
                throw new RuntimeException("empty response body httpCode:" + response.code());
            }

            try {
                ResponseResult bizResponse = JSONObject.parseObject(response.body().string(), ResponseResult.class);
                bizResponse.setHttpCode(String.valueOf(response.code()));
                MediaType contentType = response.body().contentType();
                ResponseBody body = ResponseBody.create(contentType, JSON.toJSONString(bizResponse));
                return response.newBuilder().code(200).body(body).build();
            } catch (Exception e) {
                throw new RuntimeException("parse response error:" + e.getMessage());
            }
        }
    }
}
