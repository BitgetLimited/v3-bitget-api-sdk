package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot account api
 */
public interface SpotAccountApi {

    /**
     * Obtain account assets
     * @return ResponseResult
     */
    @GET("/api/spot/v1/account/assets")
    Call<ResponseResult> assets();

    /**
     * Get the bill flow
     * @param spotBillQueryReq
     * @return ResponseResult
     */
    @POST("/api/spot/v1/account/bills")
    Call<ResponseResult> bills(@Body SpotBillQueryReq spotBillQueryReq);

    /**
     * Obtain transfer records
     * @param coinId
     * @param fromType
     * @param limit
     * @param after
     * @param before
     * @return ResponseResult
     */
    @GET("/api/spot/v1/account/transferRecords")
    Call<ResponseResult> transferRecords(@Query("coinId") String coinId,
                                         @Query("fromType") String fromType,
                                         @Query("limit") String limit,
                                         @Query("after") String after,
                                         @Query("before") String before);
}
