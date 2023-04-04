package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.request.spot.SpotCancelPlanOrderReq;
import com.bitget.openapi.dto.request.spot.SpotModifyPlanReq;
import com.bitget.openapi.dto.request.spot.SpotPlanOpenOrderReq;
import com.bitget.openapi.dto.request.spot.SpotPlanOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface SpotPlanService {

    ResponseResult placePlan(SpotPlanOrderReq req) throws IOException;

    ResponseResult modifyPlan(SpotModifyPlanReq req) throws IOException;

    ResponseResult cancelPlan(SpotCancelPlanOrderReq req) throws IOException;

    ResponseResult currentPlan(SpotPlanOpenOrderReq req) throws IOException;

    ResponseResult historyPlan(SpotPlanOpenOrderReq req) throws IOException;
}
