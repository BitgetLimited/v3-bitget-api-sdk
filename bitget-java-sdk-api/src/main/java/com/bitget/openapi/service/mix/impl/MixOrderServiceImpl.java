package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersRequest;
import com.bitget.openapi.dto.request.mix.MixCancelOrderRequest;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderRequest;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixOrderService;

import java.io.IOException;

public class MixOrderServiceImpl implements MixOrderService {

    private final MixOrderApi mixOrderApi;

    public MixOrderServiceImpl(ApiClient client) {
        mixOrderApi = client.create(MixOrderApi.class);
    }


    @Override
    public ResponseResult placeOrder(MixPlaceOrderRequest mixPlaceOrderRequest) throws IOException {
        return mixOrderApi.placeOrder(mixPlaceOrderRequest).execute().body();
    }

    @Override
    public ResponseResult batchOrders(PlaceBatchOrderRequest placeBatchOrderRequest) throws IOException {
        return mixOrderApi.batchOrders(placeBatchOrderRequest).execute().body();
    }

    @Override
    public ResponseResult cancelOrder(MixCancelOrderRequest mixCancelOrderRequest) throws IOException {
        return mixOrderApi.cancelOrder(mixCancelOrderRequest).execute().body();
    }

    @Override
    public ResponseResult cancelBatchOrder(MixCancelBatchOrdersRequest mixCancelBatchOrdersRequest) throws IOException {
        return mixOrderApi.cancelBatchOrder(mixCancelBatchOrdersRequest).execute().body();
    }

    @Override
    public ResponseResult history(String symbol, String startTime, String endTime, int pageSize, String lastEndId, boolean isPre) throws IOException {
        return mixOrderApi.history(symbol,startTime,endTime,pageSize,lastEndId, isPre).execute().body();
    }

    @Override
    public ResponseResult current(String symbol) throws IOException {
        return mixOrderApi.current(symbol).execute().body();
    }

    @Override
    public ResponseResult detail(String symbol, String orderId) throws IOException {
        return mixOrderApi.detail(symbol,orderId).execute().body();
    }

    @Override
    public ResponseResult fills(String symbol, String orderId) throws IOException {
        return mixOrderApi.fills(symbol,orderId).execute().body();
    }
}
