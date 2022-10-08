package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.common.enums.mix.*;
import com.bitget.openapi.common.enums.spot.SpotOrderTypeEnum;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class MixPlanServiceTest extends BaseTest {

    private static String symbol = "BTCUSDT_UMCBL";
    private static String marginCoin = "USDT";
    private static String startTime = "1627210955000";
    private static String endTime = "1627383755000";
    private static int pageSize = 100;
    private static boolean isPre = false;
    private static String isPlan = MixQueryPlanEnum.PLAN.getValue();

    //passed
    @Test
    public void planPlace() throws IOException {
        MixPlanOrderReq build = MixPlanOrderReq.builder()
                .clientOid("RFIut#" + System.currentTimeMillis())
                .symbol(symbol)
                .triggerPrice(new BigDecimal("45000.3"))
                .executePrice(new BigDecimal("38923.1"))
                .size(new BigDecimal("1"))
                .marginCoin(marginCoin)
                .side(MixSideEnum.OPEN_LONG.getSide())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .triggerType(MixTriggerTypeEnum.FILL_PRICE.getValue())
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().plan().placePlan(build);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void modifyPlan() throws IOException {
        MixModifyPlanReq build = MixModifyPlanReq.builder()
                .orderId("803521986049314816")
                .symbol(symbol)
                .triggerPrice(new BigDecimal("45012.1"))
                .executePrice(new BigDecimal("39423.1"))
                .marginCoin(marginCoin)
                .triggerType(MixTriggerTypeEnum.FILL_PRICE.getValue())
                .orderType(SpotOrderTypeEnum.LIMIT.getCode())
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().plan().modifyPlan(build);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void modifyPlanPreset() throws IOException {
        MixModifyPresetReq build = MixModifyPresetReq.builder()
                .orderId("803521986049314816")
                .symbol(symbol)
                .marginCoin(marginCoin)
                .presetTakeProfitPrice("55012.1")
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().plan().modifyPlanPreset(build);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void placeTPSL() throws IOException {
        MixTPSLOrderReq build = MixTPSLOrderReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .planType(MixPlanTypeEnum.PROFIT_PLAN.getValue())
                .triggerPrice(new BigDecimal("36888"))
                .holdSide(MixHoldSideEnum.SHORT.getCode())
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().plan().placeTPSL(build);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void modifyTPSLPlan() throws IOException {
        MixModifyTPSLReq build = MixModifyTPSLReq.builder()
                .orderId("803521986049314816")
                .symbol(symbol)
                .marginCoin(marginCoin)
                .triggerPrice("55012.1")
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().plan().modifyTPSLPlan(build);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void cancelPlan() throws IOException {
        MixCancelPlanReq build = MixCancelPlanReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderId("803521986049314816")
                .planType(MixPlanTypeEnum.NORMAL_PLAN.getValue())
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().plan().cancelPlan(build);
        System.out.println(JSON.toJSONString(result));
    }


    //passed
    @Test
    public void currentPlan() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().plan().currentPlan(symbol, isPlan);
        System.out.println(JSON.toJSONString(result));
    }
    //passed
    @Test
    public void historyPlan() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().plan().historyPlan(symbol, startTime, endTime, pageSize, isPre, isPlan);
        System.out.println(JSON.toJSONString(result));
    }
}
