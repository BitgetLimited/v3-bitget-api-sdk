package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface SpotOrderApi {

    // order
    @POST("/api/v2/spot/trade/place-order")
    Call<ResponseResult> placeOrder(@Body Map<String, String> body);

    @POST("/api/v2/spot/trade/batch-orders")
    Call<ResponseResult> batchOrders(@Body Map<String, String> body);

    @POST("/api/v2/spot/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body Map<String, String> body);

    @POST("/api/v2/spot/trade/batch-cancel-order")
    Call<ResponseResult> batchCancelOrder(@Body Map<String, String> body);

    @GET("/api/v2/spot/trade/unfilled-orders")
    Call<ResponseResult> unfilledOrders(@QueryMap Map<String, String> body);

    @GET("/api/v2/spot/trade/history-orders")
    Call<ResponseResult> historyOrders(@QueryMap Map<String, String> body);

    @GET("/api/v2/spot/trade/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> body);


    // plan
    @POST("/api/v2/spot/trade/place-plan-order")
    Call<ResponseResult> placePlanOrder(@Body Map<String, String> body);

    @POST("/api/v2/spot/trade/cancel-plan-order")
    Call<ResponseResult> cancelPlanOrder(@Body Map<String, String> body);

    @GET("/api/v2/spot/trade/current-plan-order")
    Call<ResponseResult> currentPlanOrder(@QueryMap Map<String, String> body);

    @GET("/api/v2/spot/trade/history-plan-order")
    Call<ResponseResult> historyPlanOrder(@QueryMap Map<String, String> body);


    // trace
    @POST("/api/v2/copy/spot-trader/order-close-tracking")
    Call<ResponseResult> traderOrderCloseTracking(@Body Map<String, String> body);

    @GET("/api/v2/copy/spot-trader/order-current-track")
    Call<ResponseResult> traderOrderCurrentTrack(@QueryMap Map<String, String> body);

    @GET("/api/v2/copy/spot-trader/order-history-track")
    Call<ResponseResult> traderOrderHistoryTrack(@QueryMap Map<String, String> body);
}
