package com.bitget.openapi.service.v1.spot;

import com.bitget.openapi.api.v1.SpotOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class SpotOrderService {

    private final SpotOrderApi spotOrderApi;

    public SpotOrderService(ApiClient client){
        spotOrderApi = client.create(SpotOrderApi.class);
    }

    public ResponseResult orders(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.orders(paramMap).execute().body());
    }

    public ResponseResult batchOrders(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.batchOrders(paramMap).execute().body());
    }

    public ResponseResult cancelOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.cancelOrder(paramMap).execute().body());
    }

    public ResponseResult cancelBatchOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.cancelBatchOrder(paramMap).execute().body());
    }

    public ResponseResult openOrders(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.openOrders(paramMap).execute().body());
    }

    public ResponseResult history(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.history(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.fills(paramMap).execute().body());
    }


    public ResponseResult placePlan(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.placePlan(paramMap).execute().body());
    }

    public ResponseResult cancelPlan(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.cancelPlan(paramMap).execute().body());
    }

    public ResponseResult currentPlan(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.currentPlan(paramMap).execute().body());
    }

    public ResponseResult historyPlan(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.historyPlan(paramMap).execute().body());
    }

    public ResponseResult closeTrackingOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.traderCloseTrackingOrder(paramMap).execute().body());
    }

    public ResponseResult orderCurrentList(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.traderOrderCurrentList(paramMap).execute().body());
    }

    public ResponseResult orderHistoryList(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.traderOrderHistoryList(paramMap).execute().body());
    }

}
