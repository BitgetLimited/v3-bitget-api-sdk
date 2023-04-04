package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SpotPlanApi {

    @POST("/api/spot/v1/plan/placePlan")
    Call<ResponseResult> placePlan(@Body SpotPlanOrderReq body);

    @POST("/api/spot/v1/plan/modifyPlan")
    Call<ResponseResult> modifyPlan(@Body SpotModifyPlanReq body);

    @POST("/api/spot/v1/plan/cancelPlan")
    Call<ResponseResult> cancelPlan(@Body SpotCancelPlanOrderReq body);

    @POST("/api/spot/v1/plan/currentPlan")
    Call<ResponseResult> currentPlan(@Body SpotPlanOpenOrderReq body);

    @POST("/api/spot/v1/plan/historyPlan")
    Call<ResponseResult> historyPlan(@Body SpotPlanOpenOrderReq body);
}