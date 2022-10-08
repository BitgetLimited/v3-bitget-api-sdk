package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract position api
 */
public interface MixPositionApi {

    /**
     * Obtain single contract position information
     * @param symbol
     * @param marginCoin
     * @return ResponseResult
     */
    @GET("/api/mix/v1/position/singlePosition")
    Call<ResponseResult> singlePosition(@Query("symbol") String symbol,
                                        @Query("marginCoin") String marginCoin);

    /**
     * Obtain all contract position information
     * @param productType
     * @param marginCoin
     * @return ResponseResult
     */
    @GET("/api/mix/v1/position/allPosition")
    Call<ResponseResult> allPosition(@Query("productType") String productType,
                                     @Query("marginCoin") String marginCoin);
}
