package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixPlanApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixPlanService;

import java.io.IOException;

public class MixPlanServiceImpl implements MixPlanService {

    private final MixPlanApi mixPlanApi;

    public MixPlanServiceImpl(ApiClient apiClient){
        this.mixPlanApi = apiClient.create(MixPlanApi.class);
    }

    @Override
    public ResponseResult placePlan(MixPlanOrderRequest mixPlanOrderRequest) throws IOException {
        return mixPlanApi.placePlan(mixPlanOrderRequest).execute().body();
    }

    @Override
    public ResponseResult modifyPlan(MixModifyPlanRequest mixModifyPlanRequest) throws IOException {
        return mixPlanApi.modifyPlan(mixModifyPlanRequest).execute().body();
    }

    @Override
    public ResponseResult modifyPlanPreset(MixModifyPresetRequest mixModifyPresetRequest) throws IOException {
        return mixPlanApi.modifyPlanPreset(mixModifyPresetRequest).execute().body();
    }

    @Override
    public ResponseResult modifyTPSLPlan(MixModifyTPSLRequest mixModifyTPSLRequest) throws IOException {
        return mixPlanApi.modifyTPSLPlan(mixModifyTPSLRequest).execute().body();
    }

    @Override
    public ResponseResult placeTPSL(MixTPSLOrderRequest mixTPSLOrderRequest) throws IOException {
        return mixPlanApi.placeTPSL(mixTPSLOrderRequest).execute().body();
    }

    @Override
    public ResponseResult cancelPlan(MixCancelPlanRequest mixCancelPlanRequest) throws IOException {
        return mixPlanApi.cancelPlan(mixCancelPlanRequest).execute().body();
    }

    @Override
    public ResponseResult currentPlan(String symbol,String isPlan) throws IOException {
        return mixPlanApi.currentPlan(symbol, isPlan).execute().body();
    }

    @Override
    public ResponseResult historyPlan(String symbol, String startTime, String endTime, int pageSize, boolean isPre, String isPlan) throws IOException {
        return mixPlanApi.historyPlan(symbol,startTime,endTime,pageSize,isPre,isPlan).execute().body();
    }
}
