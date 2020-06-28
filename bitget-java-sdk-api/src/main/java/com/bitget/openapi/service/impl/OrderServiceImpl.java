package com.bitget.openapi.service.impl;


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
    public PlaceOrderResult placeOrder(OrderReq orderRequest) throws IOException {
        return orderApi.placeOrder(orderRequest).execute().body();
    }


    @Override
    public PlaceBatchOrderResult batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException {
        return orderApi.batchOrders(placeBatchOrderReq).execute().body();
    }

    @Override
    public CancelOrderResult cancelOrder(String symbol, String orderId) throws IOException {
        return orderApi.cancelOrder(symbol, orderId).execute().body();
    }

    @Override
    public CancelBatchOrderResult cancelBathOrders(String symbol, CancelBatchOrdersReq param) throws IOException {
        return orderApi.cancelBathOrders(symbol, param).execute().body();
    }

    @Override
    public Order getOrderDetail(String symbol, String orderId) throws IOException {
        return orderApi.getOrderDetail(symbol, orderId).execute().body();
    }

    @Override
    public List<Order> getOrders(String symbol, Integer status,
                                 String from,
                                  String to,
                                 String limit) throws IOException {
        return orderApi.getOrders(symbol,status,
                 from,
                 to,
                 limit).execute().body();
    }

    @Override
    public List<Fill> getFills(String symbol, String orderId) throws IOException {
        return orderApi.getFills(symbol, orderId).execute().body();
    }

    @Override
    public PlanPlaceOrderResult planOrder(PlanPlaceOrderReq planPlaceOrderReq) throws IOException {
        return orderApi.planOrder(planPlaceOrderReq).execute().body();
    }

    @Override
    public CancelPlanResult cancelPlan(String symbol, String orderId) throws IOException {
        return orderApi.cancelPlan(symbol, orderId).execute().body();
    }

    @Override
    public PlansOrderResult currentPlan(String symbol, PlanOrderReq planOrderReq) throws IOException {
        return orderApi.currentPlan(symbol, planOrderReq.getSide(),planOrderReq.getPage_index(),planOrderReq.getPage_size(),planOrderReq.getStart_time(),planOrderReq.getEnd_time()).execute().body();
    }

    @Override
    public PlansOrderResult historyPlan(String symbol, PlanOrderReq planOrderReq) throws IOException {
        return orderApi.historyPlan(symbol, planOrderReq.getSide(),planOrderReq.getPage_index(),planOrderReq.getPage_size(),planOrderReq.getStart_time(),planOrderReq.getEnd_time()).execute().body();
    }
}
