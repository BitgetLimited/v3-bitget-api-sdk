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
 * @DES: Contract quotation interface
 */
public interface MixPlanApi {

    /**
     * Plan Entrusted Order
     * @param mixPlanOrderRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/placePlan")
    Call<ResponseResult> placePlan(@Body MixPlanOrderRequest mixPlanOrderRequest);

    /**
     * Modify Plan Delegation
     * @param mixModifyPlanRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/modifyPlan")
    Call<ResponseResult> modifyPlan(@Body MixModifyPlanRequest mixModifyPlanRequest);

    /**
     * Modify the preset profit and loss stop of plan entrustment
     * @param mixModifyPresetRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/modifyPlanPreset")
    Call<ResponseResult> modifyPlanPreset(@Body MixModifyPresetRequest mixModifyPresetRequest);

    /**
     * Modify profit and loss stop
     * @param mixModifyTPSLRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/modifyTPSLPlan")
    Call<ResponseResult> modifyTPSLPlan(@Body MixModifyTPSLRequest mixModifyTPSLRequest);

    /**
     * Stop profit and stop loss Order
     * @param mixTPSLOrderRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/placeTPSL")
    Call<ResponseResult> placeTPSL(@Body MixTPSLOrderRequest mixTPSLOrderRequest);

    @POST("/api/mix/v1/plan/cancelPlan")
    Call<ResponseResult> cancelPlan(@Body MixCancelPlanRequest mixCancelPlanRequest);

    @GET("/api/mix/v1/plan/currentPlan")
    Call<ResponseResult> currentPlan(@Query("symbol") String symbol,
                                     @Query("isPlan") String isPlan);

    @GET("/api/mix/v1/plan/historyPlan")
    Call<ResponseResult> historyPlan(@Query("symbol") String symbol,
                                     @Query("startTime") String startTime,
                                     @Query("endTime") String endTime,
                                     @Query("pageSize") int pageSize,
                                     @Query("isPre") boolean isPre,
                                     @Query("isPlan") String isPlan);
}
