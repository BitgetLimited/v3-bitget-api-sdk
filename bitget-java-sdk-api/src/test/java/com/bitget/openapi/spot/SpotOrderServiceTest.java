package com.bitget.openapi.spot;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.enums.spot.ForceEnum;
import com.bitget.openapi.enums.spot.OrderSideEnum;
import com.bitget.openapi.enums.spot.SpotOrderTypeEnum;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpotOrderServiceTest extends BaseTest {

    static String symbol = "bgbusdt_spbl";

    @Test
    public void orders() throws IOException {
        SpotOrderReq spotOrderReq = SpotOrderReq.builder().symbol(symbol).price("0.31").quantity("100")
                .side(OrderSideEnum.BUY.getCode()).orderType(SpotOrderTypeEnum.LIMIT.getCode())
                .force(ForceEnum.NORMAL.getCode()).build();

        ResponseResult orders = bitgetRestClient.spot().bitget().order().orders(spotOrderReq);
        System.out.println(JSON.toJSONString(orders));
    }

    @Test
    public void batchOrders() throws IOException {
        List<SpotOrdersReq> list = new ArrayList<>();
        SpotOrdersReq one = SpotOrdersReq.builder()
                .price("2.60222")
                .quantity("1")
                .side(OrderSideEnum.BUY.getCode())
                .orderType(SpotOrderTypeEnum.LIMIT.getCode())
                .force(ForceEnum.NORMAL.getCode())
                .clientOrderId("spot#1625039618000")
                .build();
        SpotOrdersReq two = SpotOrdersReq.builder()
                .price("2.60111")
                .quantity("1")
                .side(OrderSideEnum.BUY.getCode())
                .orderType(SpotOrderTypeEnum.LIMIT.getCode())
                .force(ForceEnum.NORMAL.getCode())
                .clientOrderId("spot#1625039618122")
                .build();

        list.add(one);
        list.add(two);
        SpotBatchOrdersReq build = SpotBatchOrdersReq.builder()
                .symbol(symbol)
                .orderList(list)
                .build();

        ResponseResult orders = bitgetRestClient.spot().bitget().order().batchOrders(build);
        System.out.println(JSON.toJSONString(orders));
    }


    @Test
    public void cancelOrder() throws IOException {
        SpotCancelOrderReq cancelOrderReq = SpotCancelOrderReq.builder().orderId("").symbol(symbol).build();

        ResponseResult result = bitgetRestClient.spot().bitget().order().cancelOrder(cancelOrderReq);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void cancelBatchOrder() throws IOException {
        SpotCancelBatchOrderReq batchOrderReq = SpotCancelBatchOrderReq.builder().symbol(symbol).orderIds(Arrays.asList("793726305732825088", "793726305804128256")).build();

        ResponseResult result = bitgetRestClient.spot().bitget().order().cancelBatchOrder(batchOrderReq);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void orderInfo() throws IOException {
        SpotOrderInfoReq orderInfoReq = SpotOrderInfoReq.builder().build();

        ResponseResult result = bitgetRestClient.spot().bitget().order().orderInfo(orderInfoReq);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void openOrders() throws IOException {
        SpotOpenOrderReq openOrderReq = SpotOpenOrderReq.builder().symbol(symbol).build();

        ResponseResult result = bitgetRestClient.spot().bitget().order().openOrders(openOrderReq);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void history() throws IOException {
        SpotHistoryOrderReq historyOrderReq = SpotHistoryOrderReq.builder().symbol(symbol).build();

        ResponseResult result = bitgetRestClient.spot().bitget().order().history(historyOrderReq);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void fills() throws IOException {
        SpotFillsOrderReq fillsOrderReq = SpotFillsOrderReq.builder().symbol(symbol)
                .orderId("791113184589549568")
                .build();

        ResponseResult result = bitgetRestClient.spot().bitget().order().fills(fillsOrderReq);
        System.out.println(JSON.toJSONString(result));
    }


}
