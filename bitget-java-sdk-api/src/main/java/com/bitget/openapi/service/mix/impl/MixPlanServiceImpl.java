package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixPlanApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixPlanService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract plan serviceImpl
 */
public class MixPlanServiceImpl implements MixPlanService {

    private final MixPlanApi mixPlanApi;

    public MixPlanServiceImpl(ApiClient apiClient){
        this.mixPlanApi = apiClient.create(MixPlanApi.class);
    }

    /**
     * Plan Entrusted Order
     * @param mixPlanOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult placePlan(MixPlanOrderReq mixPlanOrderReq) throws IOException {
        return mixPlanApi.placePlan(mixPlanOrderReq).execute().body();
    }

    /**
     * Modify Plan Delegation
     * @param mixModifyPlanReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult modifyPlan(MixModifyPlanReq mixModifyPlanReq) throws IOException {
        return mixPlanApi.modifyPlan(mixModifyPlanReq).execute().body();
    }

    /**
     * Modify the preset profit and loss stop of plan entrustment
     * @param mixModifyPresetReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult modifyPlanPreset(MixModifyPresetReq mixModifyPresetReq) throws IOException {
        return mixPlanApi.modifyPlanPreset(mixModifyPresetReq).execute().body();
    }

    /**
     * Modify profit and loss stop
     * @param mixModifyTPSLReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult modifyTPSLPlan(MixModifyTPSLReq mixModifyTPSLReq) throws IOException {
        return mixPlanApi.modifyTPSLPlan(mixModifyTPSLReq).execute().body();
    }

    /**
     * Stop profit and stop loss Order
     * @param mixTPSLOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult placeTPSL(MixTPSLOrderReq mixTPSLOrderReq) throws IOException {
        return mixPlanApi.placeTPSL(mixTPSLOrderReq).execute().body();
    }

    /**
     * Planned entrustment (profit and loss stop) cancellation
     * @param mixCancelPlanReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult cancelPlan(MixCancelPlanReq mixCancelPlanReq) throws IOException {
        return mixPlanApi.cancelPlan(mixCancelPlanReq).execute().body();
    }

    /**
     * Get the current plan commission (profit stop and loss stop) list
     * @param symbol
     * @param isPlan
     * @return ResponseResult
     */
    @Override
    public ResponseResult currentPlan(String symbol,String isPlan) throws IOException {
        return mixPlanApi.currentPlan(symbol, isPlan).execute().body();
    }

    /**
     * Obtain the list of historical plan commissions (profit and loss stop)
     * @param symbol
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param isPre
     * @param isPlan
     * @return ResponseResult
     */
    @Override
    public ResponseResult historyPlan(String symbol, String startTime, String endTime, int pageSize, boolean isPre, String isPlan) throws IOException {
        return mixPlanApi.historyPlan(symbol,startTime,endTime,pageSize,isPre,isPlan).execute().body();
    }
}
