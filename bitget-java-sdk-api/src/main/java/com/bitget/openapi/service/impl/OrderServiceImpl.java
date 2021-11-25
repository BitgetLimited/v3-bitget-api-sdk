package com.bitget.openapi.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.api.OrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;
import com.bitget.openapi.service.OrderService;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class OrderServiceImpl implements OrderService {

    private final OrderApi orderApi;

    public OrderServiceImpl(ApiClient client) {
        orderApi = client.create(OrderApi.class);
    }

    @Override
    public JSONObject placeOrder(OrderReq orderRequest) throws IOException {
        return orderApi.placeOrder(orderRequest).execute().body();
    }


    @Override
    public JSONObject batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException {
        return orderApi.batchOrders(placeBatchOrderReq).execute().body();
    }

    @Override
    public JSONObject cancelOrder(CancelOrderParam cancelOrderParam) throws IOException {
        return orderApi.cancelOrder(cancelOrderParam).execute().body();
    }

    @Override
    public JSONObject cancelBathOrders(CancelBatchOrdersReq param) throws IOException {
        return orderApi.cancelBathOrders(param).execute().body();
    }

    @Override
    public JSONObject getOrderDetail(String symbol, String orderId) throws IOException {
        return orderApi.getOrderDetail(symbol, orderId).execute().body();
    }

    @Override
    public JSONObject getOrdersHistory(String symbol, String pageIndex, String pageSize, Integer createDate) throws IOException {
        return orderApi.getOrdersHistory(symbol,pageIndex,pageSize,createDate).execute().body();
    }

    @Override
    public JSONObject getOrdersCurrent(String symbol) throws IOException {
        return orderApi.getOrdersCurrent(symbol).execute().body();
    }

    @Override
    public JSONObject getFills(String symbol, String orderId) throws IOException {
        return orderApi.getFills(symbol, orderId).execute().body();
    }

    @Override
    public JSONObject planOrder(PlanPlaceOrderReq planPlaceOrderReq) throws IOException {
        return orderApi.planOrder(planPlaceOrderReq).execute().body();
    }

    @Override
    public JSONObject cancelPlan(CancelPlanParamReq cancelPlanParamReq) throws IOException {
        return orderApi.cancelPlan(cancelPlanParamReq).execute().body();
    }

    @Override
    public JSONObject currentPlan(String symbol, PlanOrderReq planOrderReq) throws IOException {
        return orderApi.currentPlan(symbol, planOrderReq.getSide(),planOrderReq.getDelegateType(),planOrderReq.getPage_index(),planOrderReq.getPage_size(),planOrderReq.getStart_time(),planOrderReq.getEnd_time()).execute().body();
    }

    @Override
    public JSONObject historyPlan(String symbol, PlanOrderReq planOrderReq) throws IOException {
        return orderApi.historyPlan(symbol, planOrderReq.getSide(),planOrderReq.getDelegateType(),planOrderReq.getPage_index(),planOrderReq.getPage_size(),planOrderReq.getStart_time(),planOrderReq.getEnd_time()).execute().body();
    }
}
