package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersRequest;
import com.bitget.openapi.dto.request.mix.MixCancelOrderRequest;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderRequest;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.mix.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MixOrderApi {

    @POST("/api/mix/v1/order/placeOrder")
    Call<ResponseResult> placeOrder(@Body MixPlaceOrderRequest mixPlaceOrderRequest);

    @POST("/api/mix/v1/order/batch-orders")
    Call<ResponseResult> batchOrders(@Body PlaceBatchOrderRequest placeBatchOrderRequest);

    @POST("/api/mix/v1/order/cancel-order")
    Call<ResponseResult> cancelOrder(@Body MixCancelOrderRequest mixCancelOrderRequest);

    @POST("/api/mix/v1/order/cancel-batch-orders")
    Call<ResponseResult> cancelBatchOrder(@Body MixCancelBatchOrdersRequest mixCancelBatchOrdersRequest);


    @GET("/api/mix/v1/order/history")
    Call<ResponseResult> history(@Query("symbol")String symbol,
                                             @Query("startTime")String startTime,
                                             @Query("endTime")String endTime,
                                             @Query("pageSize") int pageSize,
                                             @Query("lastEndId")String lastEndId,
                                             @Query("isPre") boolean isPre);


    @GET("/api/mix/v1/order/current")
    Call<ResponseResult> current(@Query("symbol")String symbol);

    @GET("/api/mix/v1/order/detail")
    Call<ResponseResult> detail(@Query("symbol")String symbol,
                                @Query("orderId")String orderId);

    @GET("/api/mix/v1/order/fills")
    Call<ResponseResult> fills(@Query("symbol")String symbol,
                               @Query("orderId")String orderId);
}
