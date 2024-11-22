package com.bitget.openapi.api.v1;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface SpotWalletApi {

    @POST("/api/spot/v1/wallet/transfer")
    Call<ResponseResult> transfer(@Body Map<String, String> paramMap);

    @GET("/api/spot/v1/wallet/deposit-address")
    Call<ResponseResult> depositAddress(@QueryMap Map<String, String> paramMap);

    @POST("/api/spot/v1/wallet/withdrawal")
    Call<ResponseResult> withdrawal(@Body Map<String, String> paramMap);

    @GET("/api/spot/v1/wallet/withdrawal-list")
    Call<ResponseResult> withdrawalList(@QueryMap Map<String, String> paramMap);

    @GET("/api/spot/v1/wallet/deposit-list")
    Call<ResponseResult> depositList(@QueryMap Map<String, String> paramMap);
}
