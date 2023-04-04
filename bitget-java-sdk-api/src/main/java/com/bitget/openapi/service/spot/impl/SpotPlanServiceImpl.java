package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotPlanApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.spot.SpotCancelPlanOrderReq;
import com.bitget.openapi.dto.request.spot.SpotModifyPlanReq;
import com.bitget.openapi.dto.request.spot.SpotPlanOpenOrderReq;
import com.bitget.openapi.dto.request.spot.SpotPlanOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotPlanService;

import java.io.IOException;

public class SpotPlanServiceImpl implements SpotPlanService {

    private final SpotPlanApi spotPlanApi;

    public SpotPlanServiceImpl(ApiClient client){
        spotPlanApi = client.create(SpotPlanApi.class);
    }

    @Override
    public ResponseResult placePlan(SpotPlanOrderReq req) throws IOException {
        return spotPlanApi.placePlan(req).execute().body();
    }

    @Override
    public ResponseResult modifyPlan(SpotModifyPlanReq req) throws IOException {
        return spotPlanApi.modifyPlan(req).execute().body();
    }

    @Override
    public ResponseResult cancelPlan(SpotCancelPlanOrderReq req) throws IOException {
        return spotPlanApi.cancelPlan(req).execute().body();
    }

    @Override
    public ResponseResult currentPlan(SpotPlanOpenOrderReq req) throws IOException {
        return spotPlanApi.currentPlan(req).execute().body();
    }

    @Override
    public ResponseResult historyPlan(SpotPlanOpenOrderReq req) throws IOException {
        return spotPlanApi.historyPlan(req).execute().body();
    }
}
