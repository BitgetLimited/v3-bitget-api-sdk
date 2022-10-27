package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot order api
 */
public interface SpotOrderApi {

    /**
     * place an order
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/orders")
    Call<ResponseResult> orders(@Body SpotOrderReq body);

    /**
     * Place orders in batches
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/batch-orders")
    Call<ResponseResult> batchOrders(@Body SpotBatchOrdersReq body);

    /**
     * cancel the order
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body SpotCancelOrderReq body);

    /**
     * Batch cancellation
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/cancel-batch-orders")
    Call<ResponseResult> cancelBatchOrder(@Body SpotCancelBatchOrderReq body);

    /**
     * Get order details
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/orderInfo")
    Call<ResponseResult> orderInfo(@Body SpotOrderInfoReq body);

    /**
     * Obtain orders that have not been closed or partially closed but not cancelled
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/open-orders")
    Call<ResponseResult> openOrders(@Body SpotOpenOrderReq body);

    /**
     * Get historical delegation list
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/history")
    Call<ResponseResult> history(@Body SpotHistoryOrderReq body);

    /**
     * Obtain transaction details
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/trade/fills")
    Call<ResponseResult> fills(@Body SpotFillsOrderReq body);
}
