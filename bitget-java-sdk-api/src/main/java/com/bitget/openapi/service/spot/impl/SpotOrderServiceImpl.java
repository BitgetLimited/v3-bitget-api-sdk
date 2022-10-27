package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotOrderService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot order serviceImpl
 */
public class SpotOrderServiceImpl implements SpotOrderService {

    private final SpotOrderApi spotOrderApi;

    public SpotOrderServiceImpl (ApiClient client){
        spotOrderApi = client.create(SpotOrderApi.class);
    }

    /**
     * place an order
     * @param spotOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult orders(SpotOrderReq spotOrderReq) throws IOException {
        return spotOrderApi.orders(spotOrderReq).execute().body();
    }

    /**
     * Place orders in batches
     * @param spotBatchOrdersReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult batchOrders(SpotBatchOrdersReq spotBatchOrdersReq) throws IOException {
        return spotOrderApi.batchOrders(spotBatchOrdersReq).execute().body();
    }

    /**
     * cancel the order
     * @param spotCancelOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult cancelOrder(SpotCancelOrderReq spotCancelOrderReq) throws IOException {
        return spotOrderApi.cancelOrder(spotCancelOrderReq).execute().body();
    }

    /**
     * Batch cancellation
     * @param spotCancelBatchOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult cancelBatchOrder(SpotCancelBatchOrderReq spotCancelBatchOrderReq) throws IOException {
        return spotOrderApi.cancelBatchOrder(spotCancelBatchOrderReq).execute().body();
    }

    /**
     * Get order details
     * @param spotOrderInfoReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult orderInfo(SpotOrderInfoReq spotOrderInfoReq) throws IOException {
        return spotOrderApi.orderInfo(spotOrderInfoReq).execute().body();
    }

    /**
     * Obtain orders that have not been closed or partially closed but not cancelled
     * @param spotOpenOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult openOrders(SpotOpenOrderReq spotOpenOrderReq) throws IOException {
        return spotOrderApi.openOrders(spotOpenOrderReq).execute().body();
    }

    /**
     * Get historical delegation list
     * @param spotHistoryOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult history(SpotHistoryOrderReq spotHistoryOrderReq) throws IOException {
        return spotOrderApi.history(spotHistoryOrderReq).execute().body();
    }

    /**
     * Obtain transaction details
     * @param spotFillsOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult fills(SpotFillsOrderReq spotFillsOrderReq) throws IOException {
        return spotOrderApi.fills(spotFillsOrderReq).execute().body();
    }
}
