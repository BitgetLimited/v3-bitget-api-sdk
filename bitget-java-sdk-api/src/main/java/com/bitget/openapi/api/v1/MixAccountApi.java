package com.bitget.openapi.api.v1;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface MixAccountApi {

    @GET("/api/mix/v1/account/account")
    Call<ResponseResult> account(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/account/accounts")
    Call<ResponseResult> accounts(@QueryMap Map<String, String> paramMap);

    @POST("/api/mix/v1/account/setLeverage")
    Call<ResponseResult> setLeverage(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/account/setMargin")
    Call<ResponseResult> setMargin(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/account/setMarginMode")
    Call<ResponseResult> setMarginMode(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/account/setPositionMode")
    Call<ResponseResult> setPositionMode(@Body Map<String, String> paramMap);


    // position
    @GET("/api/mix/v1/position/singlePosition")
    Call<ResponseResult> singlePosition(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/position/allPosition")
    Call<ResponseResult> allPosition(@QueryMap Map<String, String> paramMap);
}
