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
 * @DES: Contract plan api
 */
public interface MixPlanApi {

    /**
     * Plan Entrusted Order
     * @param mixPlanOrderReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/placePlan")
    Call<ResponseResult> placePlan(@Body MixPlanOrderReq mixPlanOrderReq);

    /**
     * Modify Plan Delegation
     * @param mixModifyPlanReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/modifyPlan")
    Call<ResponseResult> modifyPlan(@Body MixModifyPlanReq mixModifyPlanReq);

    /**
     * Modify the preset profit and loss stop of plan entrustment
     * @param mixModifyPresetReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/modifyPlanPreset")
    Call<ResponseResult> modifyPlanPreset(@Body MixModifyPresetReq mixModifyPresetReq);

    /**
     * Modify profit and loss stop
     * @param mixModifyTPSLReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/modifyTPSLPlan")
    Call<ResponseResult> modifyTPSLPlan(@Body MixModifyTPSLReq mixModifyTPSLReq);

    /**
     * Stop profit and stop loss Order
     * @param mixTPSLOrderReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/placeTPSL")
    Call<ResponseResult> placeTPSL(@Body MixTPSLOrderReq mixTPSLOrderReq);

    /**
     * trail order
     * @param mixTrailOrderReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/placeTrailStop")
    Call<ResponseResult> placeTrailStop(@Body MixTrailOrderReq mixTrailOrderReq);


    /**
     * position tpsl order
     * @param mixTPSLPositionsReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/placePositionsTPSL")
    Call<ResponseResult> placePositionsTPSL(@Body MixTPSLPositionsReq mixTPSLPositionsReq);

    /**
     * Planned entrustment (profit and loss stop) cancellation
     * @param mixCancelPlanReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/cancelPlan")
    Call<ResponseResult> cancelPlan(@Body MixCancelPlanReq mixCancelPlanReq);

    /**
     * cancel all trigger order
     * @param mixCancelAllPlanReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/plan/cancelAllPlan")
    Call<ResponseResult> cancelAllPlan(@Body MixCancelAllPlanReq mixCancelAllPlanReq);

    /**
     * Get the current plan commission (profit stop and loss stop) list
     * @param symbol
     * @param isPlan
     * @return ResponseResult
     */
    @GET("/api/mix/v1/plan/currentPlan")
    Call<ResponseResult> currentPlan(@Query("symbol") String symbol,
                                     @Query("isPlan") String isPlan);

    /**
     * Obtain the list of historical plan commissions (profit and loss stop)
     * @param symbol
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param isPre
     * @param isPlan
     * @return ResponseResult
     */
    @GET("/api/mix/v1/plan/historyPlan")
    Call<ResponseResult> historyPlan(@Query("symbol") String symbol,
                                     @Query("startTime") String startTime,
                                     @Query("endTime") String endTime,
                                     @Query("pageSize") int pageSize,
                                     @Query("isPre") boolean isPre,
                                     @Query("isPlan") String isPlan);
}
