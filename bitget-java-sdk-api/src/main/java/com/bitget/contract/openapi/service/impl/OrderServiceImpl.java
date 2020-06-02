package com.bitget.contract.openapi.service.impl;


import com.bitget.contract.openapi.api.OrderApi;
import com.bitget.contract.openapi.common.client.ApiClient;
import com.bitget.contract.openapi.dto.request.*;
import com.bitget.contract.openapi.dto.response.*;
import com.bitget.contract.openapi.service.OrderService;

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
    public PlaceOrderResult postOrder(OrderReq orderRequest) throws IOException {
        return orderApi.postOrder(orderRequest).execute().body();
    }


    @Override
    public PlaceBatchOrderResult batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException {
        return orderApi.batchOrders(placeBatchOrderReq).execute().body();
    }

    @Override
    public CancelOrderResult cancelOrder(String instrumentId, String orderId) throws IOException {
        return orderApi.cancelOrder(instrumentId, orderId).execute().body();
    }

    @Override
    public CancelBatchOrderResult cancelBathOrders(String instrumentId, CancelBatchOrdersReq param) throws IOException {
        return orderApi.cancelBathOrders(instrumentId, param).execute().body();
    }

    @Override
    public Order getOrderDetail(String instrumentId, String orderId) throws IOException {
        return orderApi.getOrderDetail(instrumentId, orderId).execute().body();
    }

    @Override
    public List<Order> getOrders(String instrumentId, OrderListReq orderListReq) throws IOException {
        return orderApi.getOrders(instrumentId, orderListReq).execute().body();
    }

    @Override
    public List<Fill> getFills(String instrumentId, String orderId) throws IOException {
        return orderApi.getFills(instrumentId, orderId).execute().body();
    }

    @Override
    public PlanPlaceOrderResult planOrder(PlanPlaceOrderReq planPlaceOrderReq) throws IOException {
        return orderApi.planOrder(planPlaceOrderReq).execute().body();
    }

    @Override
    public CancelPlanResult cancelPlan(String instrumentId, String orderId) throws IOException {
        return orderApi.cancelPlan(instrumentId, orderId).execute().body();
    }

    @Override
    public PlansOrderResult currentPlan(String instrumentId, PlanOrderReq planOrderReq) throws IOException {
        return orderApi.currentPlan(instrumentId, planOrderReq).execute().body();
    }

    @Override
    public PlansOrderResult historyPlan(String instrumentId, PlanOrderReq planOrderReq) throws IOException {
        return orderApi.historyPlan(instrumentId, planOrderReq).execute().body();
    }
}
