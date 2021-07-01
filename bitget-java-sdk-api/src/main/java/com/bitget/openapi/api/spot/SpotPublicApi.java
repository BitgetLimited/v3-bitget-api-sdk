package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface SpotPublicApi {

    @GET("/api/spot/v1/public/time")
    Call<ResponseResult> time();

    @GET("/api/spot/v1/public/currencies")
    Call<ResponseResult> currencies();

    @GET("/api/spot/v1/public/products")
    Call<ResponseResult> products();

    @GET("/api/spot/v1/public/product")
    Call<ResponseResult> product(@Query("symbol") String symbol);

}
