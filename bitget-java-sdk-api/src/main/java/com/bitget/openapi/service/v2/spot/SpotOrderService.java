package com.bitget.openapi.service.v2.spot;

import com.bitget.openapi.api.v2.SpotOrderApi;
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

    public ResponseResult placeOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.placeOrder(paramMap).execute().body());
    }

    public ResponseResult batchOrders(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.batchOrders(paramMap).execute().body());
    }

    public ResponseResult cancelOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.cancelOrder(paramMap).execute().body());
    }

    public ResponseResult batchCancelOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.batchCancelOrder(paramMap).execute().body());
    }

    public ResponseResult unfilledOrders(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.unfilledOrders(paramMap).execute().body());
    }

    public ResponseResult historyOrders(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.historyOrders(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.fills(paramMap).execute().body());
    }



    public ResponseResult placePlanOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.placePlanOrder(paramMap).execute().body());
    }

    public ResponseResult cancelPlanOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.cancelPlanOrder(paramMap).execute().body());
    }

    public ResponseResult currentPlanOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.currentPlanOrder(paramMap).execute().body());
    }

    public ResponseResult historyPlanOrder(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.historyPlanOrder(paramMap).execute().body());
    }



    public ResponseResult traderOrderCloseTracking(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.traderOrderCloseTracking(paramMap).execute().body());
    }

    public ResponseResult traderOrderCurrentTrack(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.traderOrderCurrentTrack(paramMap).execute().body());
    }

    public ResponseResult traderOrderHistoryTrack(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotOrderApi.traderOrderHistoryTrack(paramMap).execute().body());
    }

}
