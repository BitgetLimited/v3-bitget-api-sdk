package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersReq;
import com.bitget.openapi.dto.request.mix.MixCancelOrderReq;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderReq;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixOrderService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract order serviceImpl
 */
public class MixOrderServiceImpl implements MixOrderService {

    private final MixOrderApi mixOrderApi;

    public MixOrderServiceImpl(ApiClient client) {
        mixOrderApi = client.create(MixOrderApi.class);
    }

    /**
     * place an order
     * @param mixPlaceOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult placeOrder(MixPlaceOrderReq mixPlaceOrderReq) throws IOException {
        return mixOrderApi.placeOrder(mixPlaceOrderReq).execute().body();
    }

    /**
     * place an order
     * @param mixPlaceOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult proportionOrder(MixPlaceOrderReq mixPlaceOrderReq) throws IOException {
        return mixOrderApi.proportionOrder(mixPlaceOrderReq).execute().body();
    }

    /**
     * Place orders in batches
     * @param placeBatchOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException {
        return mixOrderApi.batchOrders(placeBatchOrderReq).execute().body();
    }

    /**
     * cancel the order
     * @param mixCancelOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult cancelOrder(MixCancelOrderReq mixCancelOrderReq) throws IOException {
        return mixOrderApi.cancelOrder(mixCancelOrderReq).execute().body();
    }

    /**
     * Batch cancellation
     * @param mixCancelBatchOrdersReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult cancelBatchOrder(MixCancelBatchOrdersReq mixCancelBatchOrdersReq) throws IOException {
        return mixOrderApi.cancelBatchOrder(mixCancelBatchOrdersReq).execute().body();
    }

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
    @Override
    public ResponseResult history(String symbol, String startTime, String endTime, int pageSize, String lastEndId, boolean isPre) throws IOException {
        return mixOrderApi.history(symbol,startTime,endTime,pageSize,lastEndId, isPre).execute().body();
    }

    /**
     * Get the current delegate
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult current(String symbol) throws IOException {
        return mixOrderApi.current(symbol).execute().body();
    }

    /**
     * Get order details
     * @param symbol
     * @param orderId
     * @return ResponseResult
     */
    @Override
    public ResponseResult detail(String symbol, String orderId) throws IOException {
        return mixOrderApi.detail(symbol,orderId).execute().body();
    }

    /**
     * Query transaction details
     * @param symbol
     * @param orderId
     * @return ResponseResult
     */
    @Override
    public ResponseResult fills(String symbol, String orderId) throws IOException {
        return mixOrderApi.fills(symbol,orderId).execute().body();
    }
}
