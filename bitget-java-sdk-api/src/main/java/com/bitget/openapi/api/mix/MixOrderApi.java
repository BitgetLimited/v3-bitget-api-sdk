package com.bitget.openapi.api.mix;


import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersRequest;
import com.bitget.openapi.dto.request.mix.MixCancelOrderRequest;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderRequest;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract quotation api
 */
public interface MixOrderApi {

    /**
     * place an order
     * @param mixPlaceOrderRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/order/placeOrder")
    Call<ResponseResult> placeOrder(@Body MixPlaceOrderRequest mixPlaceOrderRequest);

    /**
     * place an order
     * @param mixPlaceOrderRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/order/proportionOrder")
    Call<ResponseResult> proportionOrder(@Body MixPlaceOrderRequest mixPlaceOrderRequest);

    /**
     * Place orders in batches
     * @param placeBatchOrderRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/order/batch-orders")
    Call<ResponseResult> batchOrders(@Body PlaceBatchOrderRequest placeBatchOrderRequest);

    /**
     * cancel the order
     * @param mixCancelOrderRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/order/cancel-order")
    Call<ResponseResult> cancelOrder(@Body MixCancelOrderRequest mixCancelOrderRequest);

    /**
     * Batch cancellation
     * @param mixCancelBatchOrdersRequest
     * @return ResponseResult
     */
    @POST("/api/mix/v1/order/cancel-batch-orders")
    Call<ResponseResult> cancelBatchOrder(@Body MixCancelBatchOrdersRequest mixCancelBatchOrdersRequest);

    /**
     * Get Historical Delegation
     * @param symbol
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param lastEndId
     * @param isPre
     * @return ResponseResult
     */
    @GET("/api/mix/v1/order/history")
    Call<ResponseResult> history(@Query("symbol")String symbol,
                                             @Query("startTime")String startTime,
                                             @Query("endTime")String endTime,
                                             @Query("pageSize") int pageSize,
                                             @Query("lastEndId")String lastEndId,
                                             @Query("isPre") boolean isPre);

    /**
     * Get the current delegate
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/order/current")
    Call<ResponseResult> current(@Query("symbol")String symbol);

    /**
     * Get order details
     * @param symbol
     * @param orderId
     * @return ResponseResult
     */
    @GET("/api/mix/v1/order/detail")
    Call<ResponseResult> detail(@Query("symbol")String symbol,
                                @Query("orderId")String orderId);

    /**
     * Query transaction details
     * @param symbol
     * @param orderId
     * @return ResponseResult
     */
    @GET("/api/mix/v1/order/fills")
    Call<ResponseResult> fills(@Query("symbol")String symbol,
                               @Query("orderId")String orderId);
}
