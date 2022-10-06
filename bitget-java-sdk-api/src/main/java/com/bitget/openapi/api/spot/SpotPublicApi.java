package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot order api
 */
public interface SpotPublicApi {

    /**
     * Get server time
     * @return ResponseResult
     */
    @GET("/api/spot/v1/public/time")
    Call<ResponseResult> time();

    /**
     * Basic information of currency
     * @return ResponseResult
     */
    @GET("/api/spot/v1/public/currencies")
    Call<ResponseResult> currencies();

    /**
     * Get all product information
     * @return ResponseResult
     */
    @GET("/api/spot/v1/public/products")
    Call<ResponseResult> products();

    /**
     * Get single product information
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/spot/v1/public/product")
    Call<ResponseResult> product(@Query("symbol") String symbol);

}
