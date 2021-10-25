package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.http.Query;

import java.io.IOException;

public interface MixPlanService {

    ResponseResult placePlan(MixPlanOrderRequest mixPlanOrderRequest) throws IOException;

    ResponseResult modifyPlan(MixModifyPlanRequest mixModifyPlanRequest) throws IOException;

    ResponseResult modifyPlanPreset(MixModifyPresetRequest mixModifyPresetRequest) throws IOException;

    ResponseResult modifyTPSLPlan(MixModifyTPSLRequest mixModifyTPSLRequest) throws IOException;

    ResponseResult placeTPSL(MixTPSLOrderRequest mixTPSLOrderRequest) throws IOException;

    ResponseResult cancelPlan(MixCancelPlanRequest mixCancelPlanRequest) throws IOException;

    ResponseResult currentPlan(String symbol, String isPlan) throws IOException;

    ResponseResult historyPlan(String symbol,String startTime,String endTime,int pageSize,boolean isPre,String isPlan) throws IOException;
}
