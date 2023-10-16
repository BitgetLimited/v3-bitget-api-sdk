package com.bitget.openapi.service.v1.mix;

import com.bitget.openapi.api.v1.MixOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class MixOrderService {

    private final MixOrderApi mixOrderApi;

    public MixOrderService(ApiClient client) {
        mixOrderApi = client.create(MixOrderApi.class);
    }

    public ResponseResult placeOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.placeOrder(paramMap).execute().body());
    }

    public ResponseResult batchOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.batchOrders(paramMap).execute().body());
    }

    public ResponseResult cancelOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.cancelOrder(paramMap).execute().body());
    }

    public ResponseResult cancelBatchOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.cancelBatchOrder(paramMap).execute().body());
    }

    public ResponseResult history(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.history(paramMap).execute().body());
    }

    public ResponseResult current(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.current(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.fills(paramMap).execute().body());
    }

    public ResponseResult placePlan(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.placePlan(paramMap).execute().body());
    }

    public ResponseResult cancelPlan(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.cancelPlan(paramMap).execute().body());
    }

    public ResponseResult currentPlan(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.currentPlan(paramMap).execute().body());
    }

    public ResponseResult historyPlan(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.historyPlan(paramMap).execute().body());
    }

    public ResponseResult traderCloseOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.traderCloseOrder(paramMap).execute().body());
    }

    public ResponseResult traderCurrentOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.traderCurrentOrders(paramMap).execute().body());
    }

    public ResponseResult traderHistoryTrack(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.traderHistoryTrack(paramMap).execute().body());
    }

    public ResponseResult followerCloseByTrackingNo(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.followerCloseByTrackingNo(paramMap).execute().body());
    }

    public ResponseResult followerOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.followerOrder(paramMap).execute().body());
    }

    public ResponseResult followerHistoryOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixOrderApi.followerHistoryOrders(paramMap).execute().body());
    }

}
