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
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class OrderServiceTest extends BaseTest {


    private static final String symbol = "cmt_btcusdt";

    @Test
    public void postOrder() throws IOException {
        OrderReq req = OrderReq.builder().client_oid("bitget#123456")
                .symbol(symbol)
                .match_price(MatchTypeEnum.MARKET.getCode())
                .order_type(OrderTypeEnum.LIMIT.getCode().toString())
                .size("1000")
                .trace_no("1111")
                .type("1").build();
        PlaceOrderResult result = bitgetRestClient.contract().bitget().order().placeOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void batchOrders() throws IOException {
        PlaceBatchOrderReq req = PlaceBatchOrderReq.builder().symbol(symbol)
                .order_data("")
                .build();
        PlaceBatchOrderResult result = bitgetRestClient.contract().bitget().order().batchOrders(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void cancelOrder() throws IOException {
        CancelOrderResult result = bitgetRestClient.contract().bitget().order().cancelOrder(symbol, "568247114714");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void cancelBathOrders() throws IOException {
        CancelBatchOrdersReq req = CancelBatchOrdersReq.builder()
                .ids(Arrays.asList(new String[]{"1", "2"}))
                .build();
        CancelBatchOrderResult result = bitgetRestClient.contract().bitget().order().cancelBathOrders(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getOrderDetail() throws IOException {
        Order result = bitgetRestClient.contract().bitget().order().getOrderDetail(symbol, "568247114714");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getOrders() throws IOException {
        OrderListReq req = OrderListReq.builder()
                .from("1")
                .to("2")
                .limit("50")
                .build();
        List<Order> result = bitgetRestClient.contract().bitget().order().getOrders(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getFills() throws IOException {
        List<Fill> result = bitgetRestClient.contract().bitget().order().getFills(symbol, "568247114714");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void planOrder() throws IOException {
        PlanPlaceOrderReq req = PlanPlaceOrderReq.builder()
                .client_oid("bitget#123456")
                .symbol(symbol)
                .execute_price("1000")
                .match_type(MatchTypeEnum.MARKET.getCode())
                .side("1")
                .size("100")
                .trigger_price("125")
                .type("1")
                .build();
        PlanPlaceOrderResult result = bitgetRestClient.contract().bitget().order().planOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void cancelPlan() throws IOException {
        CancelPlanResult result = bitgetRestClient.contract().bitget().order().cancelPlan(symbol, "568247114714");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void currentPlan() throws IOException {
        PlanOrderReq req = PlanOrderReq.builder()
                .page_index("1")
                .page_size("50")
                .side("1")
                .end_time(LocalDateTime.now().toString())
                .start_time(LocalDateTime.now().toString())
                .build();
        PlansOrderResult result = bitgetRestClient.contract().bitget().order().currentPlan(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void historyPlan() throws IOException {
        PlanOrderReq req = PlanOrderReq.builder()
                .page_index("1")
                .page_size("50")
                .side("1")
                .end_time(LocalDateTime.now().toString())
                .start_time(LocalDateTime.now().toString())
                .build();
        PlansOrderResult result = bitgetRestClient.contract().bitget().order().historyPlan(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }
}
