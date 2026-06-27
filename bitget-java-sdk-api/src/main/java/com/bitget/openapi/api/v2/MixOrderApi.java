package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface MixOrderApi {

    // normal order
    @POST("/api/v2/mix/order/place-order")
    Call<ResponseResult> placeOrder(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/order/batch-place-order")
    Call<ResponseResult> batchPlaceOrder(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/order/cancel-order")
    Call<ResponseResult> cancelOrder(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/order/batch-cancel-orders")
    Call<ResponseResult> batchCancelOrders(@Body Map<String, String> paramMap);

    @GET("/api/v2/mix/order/orders-history")
    Call<ResponseResult> ordersHistory(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/order/orders-pending")
    Call<ResponseResult> ordersPending(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/order/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);


    // plan
    @POST("/api/v2/mix/order/place-plan-order")
    Call<ResponseResult> placePlanOrder(@Body Map<String, String> paramMap);

    @POST("/api/v2/mix/order/cancel-plan-order")
    Call<ResponseResult> cancelPlanOrder(@Body Map<String, String> paramMap);

    @GET("/api/v2/mix/order/orders-plan-pending")
    Call<ResponseResult> ordersPlanPending(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/order/orders-plan-history")
    Call<ResponseResult> ordersPlanHistory(@QueryMap Map<String, String> paramMap);


    // trader
    @POST("/api/v2/copy/mix-trader/order-close-positions")
    Call<ResponseResult> traderOrderClosePositions(@Body Map<String, String> paramMap);

    @GET("/api/v2/copy/mix-trader/order-current-track")
    Call<ResponseResult> traderOrderCurrentTrack(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/copy/mix-trader/order-history-track")
    Call<ResponseResult> traderOrderHistoryTrack(@QueryMap Map<String, String> paramMap);

    @POST("/api/v2/copy/mix-follower/close-positions")
    Call<ResponseResult> followerClosePositions(@Body Map<String, String> paramMap);

    @GET("/api/v2/copy/mix-follower/query-current-orders")
    Call<ResponseResult> followerQueryCurrentOrders(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/copy/mix-follower/query-history-orders")
    Call<ResponseResult> followerQueryHistoryOrders(@QueryMap Map<String, String> paramMap);
}
