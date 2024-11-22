package com.bitget.openapi.api;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface BitgetApi {

    @GET
    Call<ResponseResult> sendGetRequest(@Url String url, @QueryMap Map<String, String> paramMap);

    @POST
    Call<ResponseResult> sendPostRequest(@Url String url, @Body Map<String, String> paramMap);
}
