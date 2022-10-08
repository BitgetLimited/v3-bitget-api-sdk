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
     * @param mixChangeLeverageReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setLeverage")
    Call<ResponseResult> leverage(@Body MixChangeLeverageReq mixChangeLeverageReq);

    /**
     * Adjustment margin
     * @param mixAdjustMarginFixReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setMargin")
    Call<ResponseResult> margin(@Body MixAdjustMarginFixReq mixAdjustMarginFixReq);

    /**
     * Adjust margin mode
     * @param adjustMarginModeReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setMarginMode")
    Call<ResponseResult> marginMode(@Body AdjustMarginModeReq adjustMarginModeReq);

    /**
     * Adjust hold mode
     * @param adjustHoldModeReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/setPositionMode")
    Call<ResponseResult> positionMode(@Body AdjustHoldModeReq adjustHoldModeReq);

    /**
     * Get the openable quantity
     * @param mixOpenCountReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/account/open-count")
    Call<ResponseResult> openCount(@Body MixOpenCountReq mixOpenCountReq);
}
