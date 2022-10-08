package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface MixPlanService {

    ResponseResult placePlan(MixPlanOrderReq mixPlanOrderReq) throws IOException;

    ResponseResult modifyPlan(MixModifyPlanReq mixModifyPlanReq) throws IOException;

    ResponseResult modifyPlanPreset(MixModifyPresetReq mixModifyPresetReq) throws IOException;

    ResponseResult modifyTPSLPlan(MixModifyTPSLReq mixModifyTPSLReq) throws IOException;

    ResponseResult placeTPSL(MixTPSLOrderReq mixTPSLOrderReq) throws IOException;

    ResponseResult cancelPlan(MixCancelPlanReq mixCancelPlanReq) throws IOException;

    ResponseResult currentPlan(String symbol, String isPlan) throws IOException;

    ResponseResult historyPlan(String symbol,String startTime,String endTime,int pageSize,boolean isPre,String isPlan) throws IOException;
}
