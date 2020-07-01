package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.common.enums.MatchTypeEnum;
import com.bitget.openapi.common.enums.OrderTypeEnum;
import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class OrderServiceTest extends BaseTest {

    private static final String symbol = "cmt_btcusdt";

    @Test
    public void postOrder() throws IOException {
        OrderReq req = OrderReq.builder().client_oid("abc").symbol(symbol).match_price(MatchTypeEnum.LIMIT.getCode())
                .order_type(OrderTypeEnum.LIMIT.getCode().toString()).size("2").type("4").price("9009.5").build();
        PlaceOrderResult result = bitgetRestClient.contract().bitget().order().placeOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void batchOrders() throws IOException {

        PlaceBatchOrderReq req = PlaceBatchOrderReq.builder().symbol(symbol).order_data(
                "[{\"client_oid\":\"E213\",\"order_type\":\"1\",\"price\":\"5\",\"size\":\"2\",\"type\":\"1\",\"match_price\":\"0\"}]")
                .build();
        PlaceBatchOrderResult result = bitgetRestClient.contract().bitget().order().batchOrders(req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void cancelOrder() throws IOException {
        CancelOrderParam param = CancelOrderParam.builder().symbol(symbol).orderId("662048828534292413").build();
        CancelOrderResult result = bitgetRestClient.contract().bitget().order().cancelOrder(param);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void cancelBathOrders() throws IOException {
        CancelBatchOrdersReq req = CancelBatchOrdersReq.builder()
                .ids(Arrays.asList(new String[] { "662049979816214513", "662050232694996913" })).symbol(symbol).build();
        CancelBatchOrderResult result = bitgetRestClient.contract().bitget().order().cancelBathOrders(req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void getOrderDetail() throws IOException {
        Order result = bitgetRestClient.contract().bitget().order().getOrderDetail(symbol, "662052689865080815");
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void getOrders() throws IOException {
        OrderListReq req = OrderListReq.builder().from("1").to("2").limit("50").status(0).build();
        List<Order> result = bitgetRestClient.contract().bitget().order().getOrders(symbol, req.getStatus(),
                req.getFrom(), req.getTo(), req.getLimit());
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void getFills() throws IOException {
        List<Fill> result = bitgetRestClient.contract().bitget().order().getFills(symbol, "662062239896829913");
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void planOrder() throws IOException {
        PlanPlaceOrderReq req = PlanPlaceOrderReq.builder().client_oid("abc").symbol(symbol).execute_price("1000")
                .match_type(MatchTypeEnum.MARKET.getCode()).side("1").size("100").trigger_price("125").type("1")
                .build();
        PlanPlaceOrderResult result = bitgetRestClient.contract().bitget().order().planOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void cancelPlan() throws IOException {
        CancelPlanParamReq planParamReq = CancelPlanParamReq.builder().symbol(symbol).orderId("649008575284248513")
                .build();
        CancelPlanResult result = bitgetRestClient.contract().bitget().order().cancelPlan(planParamReq);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void currentPlan() throws IOException {
        PlanOrderReq req = PlanOrderReq.builder().page_index("1").page_size("50").side("2").end_time("1593584346687")
                .start_time("1593066788000").build();
        PlansOrderResult result = bitgetRestClient.contract().bitget().order().currentPlan(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void historyPlan() throws IOException {
        PlanOrderReq req = PlanOrderReq.builder().page_index("1").page_size("50").side("1").end_time("1593584346687")
                .start_time("1593066788000").build();
        PlansOrderResult result = bitgetRestClient.contract().bitget().order().historyPlan(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }
}
