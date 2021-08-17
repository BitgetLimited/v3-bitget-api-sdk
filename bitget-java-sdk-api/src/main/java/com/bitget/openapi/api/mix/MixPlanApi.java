package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MixPlanApi {

    @POST("/api/mix/v1/plan/placePlan")
    Call<ResponseResult> placePlan(@Body MixPlanOrderRequest mixPlanOrderRequest);

    @POST("/api/mix/v1/plan/modifyPlan")
    Call<ResponseResult> modifyPlan(@Body MixModifyPlanRequest mixModifyPlanRequest);

    @POST("/api/mix/v1/plan/modifyPlanPreset")
    Call<ResponseResult> modifyPlanPreset(@Body MixModifyPresetRequest mixModifyPresetRequest);

    @POST("/api/mix/v1/plan/modifyTPSLPlan")
    Call<ResponseResult> modifyTPSLPlan(@Body MixModifyTPSLRequest mixModifyTPSLRequest);

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
