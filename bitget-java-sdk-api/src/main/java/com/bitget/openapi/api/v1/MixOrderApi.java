package com.bitget.openapi.api.v1;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface MixOrderApi {

    // normal order
    @POST("/api/mix/v1/order/placeOrder")
    Call<ResponseResult> placeOrder(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/order/batch-orders")
    Call<ResponseResult> batchOrders(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/order/cancel-order")
    Call<ResponseResult> cancelOrder(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/order/cancel-batch-orders")
    Call<ResponseResult> cancelBatchOrder(@Body Map<String, String> paramMap);

    @GET("/api/mix/v1/order/history")
    Call<ResponseResult> history(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/order/current")
    Call<ResponseResult> current(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/order/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);


    // plan
    @POST("/api/mix/v1/plan/placePlan")
    Call<ResponseResult> placePlan(@Body Map<String, String> paramMap);

    @POST("/api/mix/v1/plan/cancelPlan")
    Call<ResponseResult> cancelPlan(@Body Map<String, String> paramMap);

    @GET("/api/mix/v1/plan/currentPlan")
    Call<ResponseResult> currentPlan(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/plan/historyPlan")
    Call<ResponseResult> historyPlan(@QueryMap Map<String, String> paramMap);


    // trader
    @POST("/api/mix/v1/trace/closeTrackOrder")
    Call<ResponseResult> traderCloseOrder(@Body Map<String, String> paramMap);

    @GET("/api/mix/v1/trace/currentTrack")
    Call<ResponseResult> traderCurrentOrders(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/trace/historyTrack")
    Call<ResponseResult> traderHistoryTrack(@QueryMap Map<String, String> paramMap);

    @POST("/api/mix/v1/trace/followerCloseByTrackingNo")
    Call<ResponseResult> followerCloseByTrackingNo(@Body Map<String, String> paramMap);

    @GET("/api/mix/v1/trace/followerOrder")
    Call<ResponseResult> followerOrder(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/trace/followerHistoryOrders")
    Call<ResponseResult> followerHistoryOrders(@QueryMap Map<String, String> paramMap);
}
