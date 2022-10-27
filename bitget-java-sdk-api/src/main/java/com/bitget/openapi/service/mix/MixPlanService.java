package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract plan service
 */
public interface MixPlanService {

    /**
     * Plan Entrusted Order
     * @param mixPlanOrderReq
     * @return ResponseResult
     */
    ResponseResult placePlan(MixPlanOrderReq mixPlanOrderReq) throws IOException;

    /**
     * Modify Plan Delegation
     * @param mixModifyPlanReq
     * @return ResponseResult
     */
    ResponseResult modifyPlan(MixModifyPlanReq mixModifyPlanReq) throws IOException;

    /**
     * Modify the preset profit and loss stop of plan entrustment
     * @param mixModifyPresetReq
     * @return ResponseResult
     */
    ResponseResult modifyPlanPreset(MixModifyPresetReq mixModifyPresetReq) throws IOException;

    /**
     * Modify profit and loss stop
     * @param mixModifyTPSLReq
     * @return ResponseResult
     */
    ResponseResult modifyTPSLPlan(MixModifyTPSLReq mixModifyTPSLReq) throws IOException;

    /**
     * Stop profit and stop loss Order
     * @param mixTPSLOrderReq
     * @return ResponseResult
     */
    ResponseResult placeTPSL(MixTPSLOrderReq mixTPSLOrderReq) throws IOException;

    /**
     * Planned entrustment (profit and loss stop) cancellation
     * @param mixCancelPlanReq
     * @return ResponseResult
     */
    ResponseResult cancelPlan(MixCancelPlanReq mixCancelPlanReq) throws IOException;

    /**
     * Get the current plan commission (profit stop and loss stop) list
     * @param symbol
     * @param isPlan
     * @return ResponseResult
     */
    ResponseResult currentPlan(String symbol, String isPlan) throws IOException;

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
    ResponseResult historyPlan(String symbol,String startTime,String endTime,int pageSize,boolean isPre,String isPlan) throws IOException;
}
