package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotOrderService;

import java.io.IOException;

public class SpotOrderServiceImpl implements SpotOrderService {

    private final SpotOrderApi spotOrderApi;

    public SpotOrderServiceImpl (ApiClient client){
        spotOrderApi = client.create(SpotOrderApi.class);
    }

    @Override
    public ResponseResult orders(SpotOrderReq spotOrderReq) throws IOException {
        return spotOrderApi.orders(spotOrderReq).execute().body();
    }

    @Override
    public ResponseResult batchOrders(SpotBatchOrdersReq spotBatchOrdersReq) throws IOException {
        return spotOrderApi.batchOrders(spotBatchOrdersReq).execute().body();
    }

    @Override
    public ResponseResult cancelOrder(SpotCancelOrderReq spotCancelOrderReq) throws IOException {
        return spotOrderApi.cancelOrder(spotCancelOrderReq).execute().body();
    }

    @Override
    public ResponseResult cancelBatchOrder(SpotCancelBatchOrderReq spotCancelBatchOrderReq) throws IOException {
        return spotOrderApi.cancelBatchOrder(spotCancelBatchOrderReq).execute().body();
    }

    @Override
    public ResponseResult orderInfo(SpotOrderInfoReq spotOrderInfoReq) throws IOException {
        return spotOrderApi.orderInfo(spotOrderInfoReq).execute().body();
    }

    @Override
    public ResponseResult openOrders(SpotOpenOrderReq spotOpenOrderReq) throws IOException {
        return spotOrderApi.openOrders(spotOpenOrderReq).execute().body();
    }

    @Override
    public ResponseResult history(SpotHistoryOrderReq spotHistoryOrderReq) throws IOException {
        return spotOrderApi.history(spotHistoryOrderReq).execute().body();
    }

    @Override
    public ResponseResult fills(SpotFillsOrderReq spotFillsOrderReq) throws IOException {
        return spotOrderApi.fills(spotFillsOrderReq).execute().body();
    }
}
