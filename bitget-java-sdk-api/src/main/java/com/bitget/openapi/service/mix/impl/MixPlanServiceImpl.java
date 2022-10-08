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
    public ResponseResult placePlan(MixPlanOrderReq mixPlanOrderReq) throws IOException {
        return mixPlanApi.placePlan(mixPlanOrderReq).execute().body();
    }

    @Override
    public ResponseResult modifyPlan(MixModifyPlanReq mixModifyPlanReq) throws IOException {
        return mixPlanApi.modifyPlan(mixModifyPlanReq).execute().body();
    }

    @Override
    public ResponseResult modifyPlanPreset(MixModifyPresetReq mixModifyPresetReq) throws IOException {
        return mixPlanApi.modifyPlanPreset(mixModifyPresetReq).execute().body();
    }

    @Override
    public ResponseResult modifyTPSLPlan(MixModifyTPSLReq mixModifyTPSLReq) throws IOException {
        return mixPlanApi.modifyTPSLPlan(mixModifyTPSLReq).execute().body();
    }

    @Override
    public ResponseResult placeTPSL(MixTPSLOrderReq mixTPSLOrderReq) throws IOException {
        return mixPlanApi.placeTPSL(mixTPSLOrderReq).execute().body();
    }

    @Override
    public ResponseResult cancelPlan(MixCancelPlanReq mixCancelPlanReq) throws IOException {
        return mixPlanApi.cancelPlan(mixCancelPlanReq).execute().body();
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
