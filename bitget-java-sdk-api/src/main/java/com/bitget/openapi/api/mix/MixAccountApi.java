package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract account api
 */
public interface MixAccountApi {

    /**
     * Get account  information
     * @param symbol
     * @param marginCoin
     * @return ResponseResult
     */
    @GET("/api/mix/v1/account/account")
    Call<ResponseResult> account(@Query("symbol") String symbol,
                                 @Query("marginCoin") String marginCoin);
    /**
     * Get account  information list
     * @param productType
     * @return ResponseResult
     */
    @GET("/api/mix/v1/account/accounts")
    Call<ResponseResult> accounts(@Query("productType") String productType);

    /**
     * set lever
     * @param mixChangeLeverageRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setLeverage")
    Call<ResponseResult> leverage(@Body MixChangeLeverageRequest mixChangeLeverageRequest);

    /**
     * Adjustment margin
     * @param mixAdjustMarginFixRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setMargin")
    Call<ResponseResult> margin(@Body MixAdjustMarginFixRequest mixAdjustMarginFixRequest);

    /**
     * Adjust margin mode
     * @param adjustMarginModeRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setMarginMode")
    Call<ResponseResult> marginMode(@Body AdjustMarginModeRequest adjustMarginModeRequest);

    /**
     * Adjust hold mode
     * @param adjustHoldModeRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setPositionMode")
    Call<ResponseResult> positionMode(@Body AdjustHoldModeRequest adjustHoldModeRequest);

    /**
     * Get the openable quantity
     * @param mixOpenCountRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/open-count")
    Call<ResponseResult> openCount(@Body MixOpenCountRequest mixOpenCountRequest);
}
