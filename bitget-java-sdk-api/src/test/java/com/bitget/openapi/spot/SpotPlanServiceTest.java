package com.bitget.openapi.spot;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.common.enums.spot.OrderSideEnum;
import com.bitget.openapi.dto.request.spot.SpotCancelPlanOrderReq;
import com.bitget.openapi.dto.request.spot.SpotModifyPlanReq;
import com.bitget.openapi.dto.request.spot.SpotPlanOpenOrderReq;
import com.bitget.openapi.dto.request.spot.SpotPlanOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;

import java.io.IOException;

public class SpotPlanServiceTest extends BaseTest {

    static String symbol = "BTCUSDT_SPBL";

    @Test
    public void placePlan() throws IOException {
        SpotPlanOrderReq req = SpotPlanOrderReq.builder()
                .symbol(symbol)
                .side(OrderSideEnum.BUY.getCode())
                .triggerPrice(String.valueOf(22031))
                .executePrice(String.valueOf(22031))
                .size("50")
                .triggerType("market_price")
                .orderType("market")
                .timeInForceValue("normal")
                .build();
        ResponseResult result = bitgetRestClient.spot().bitget().plan().placePlan(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void modifyPlan() throws IOException {
        SpotModifyPlanReq req = SpotModifyPlanReq.builder()
                .orderId("987136018723487744")
                .triggerPrice(String.valueOf(22031))
                .executePrice(String.valueOf(22031))
                .size("50")
                .orderType("market")
                .build();
        ResponseResult result = bitgetRestClient.spot().bitget().plan().modifyPlan(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void cancelPlan() throws IOException {
        SpotCancelPlanOrderReq req = SpotCancelPlanOrderReq.builder()
                .orderId("987136018723487744")
                .build();
        ResponseResult result = bitgetRestClient.spot().bitget().plan().cancelPlan(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void historyPlan() throws IOException {
        SpotPlanOpenOrderReq req = SpotPlanOpenOrderReq.builder()
                .symbol(symbol)
                .pageSize(10)
                .startTime("1671005531000")
                .endTime("1671085652000")
                .build();
        ResponseResult result = bitgetRestClient.spot().bitget().plan().historyPlan(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void currentPlan() throws IOException {
        SpotPlanOpenOrderReq req = SpotPlanOpenOrderReq.builder()
                .symbol(symbol)
                .pageSize(10)
                .build();
        ResponseResult result = bitgetRestClient.spot().bitget().plan().currentPlan(req);
        System.out.println(JSON.toJSONString(result));
    }
}
