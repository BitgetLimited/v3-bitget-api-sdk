package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface MixAccountApi {

    @GET("/api/v2/mix/account/account")
    Call<ResponseResult> account(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/account/accounts")
    Call<ResponseResult> accounts(@QueryMap Map<String, String> paramMap);

    @POST("/api/v2/mix/account/set-leverage")
    Call<ResponseResult> setLeverage(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/account/set-margin")
    Call<ResponseResult> setMargin(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/account/set-margin-mode")
    Call<ResponseResult> setMarginMode(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/account/set-position-mode")
    Call<ResponseResult> setPositionMode(@Body Map<String, String> paramMap);


    // position
    @GET("/api/v2/mix/position/single-position")
    Call<ResponseResult> singlePosition(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/position/all-position")
    Call<ResponseResult> allPosition(@QueryMap Map<String, String> paramMap);
}
