package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.common.enums.mix.MixOrderTypeEnum;
import com.bitget.openapi.common.enums.mix.MixSideEnum;
import com.bitget.openapi.common.enums.spot.ForceEnum;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MixOrderTest extends BaseTest {

    private static String symbol = "BTCUSDT_UMCBL";
    private static String marginCoin = "USDT";
    private static String startTime = "1626859582000";
    private static String endTime = "1627032382000";
    private static String lastEndId = "0";
    private static int pageSize = 20;

    // passed
    @Test
    public void placeOrder() throws IOException {
        MixPlaceOrderRequest req = MixPlaceOrderRequest.builder()
                .clientOid("RFIut#"+System.currentTimeMillis())
                .symbol(symbol)
                .price(new BigDecimal("22999.3"))
                .size(new BigDecimal("1"))
                .marginCoin("USDT")
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().order().placeOrder(req);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void batchOrders() throws IOException {
        List<PlaceOrderBaseParam> orderDataList = new ArrayList<>();

        PlaceOrderBaseParam order_one = PlaceOrderBaseParam.builder()
                .clientOid("RFIut#15914567782335")
                .price(new BigDecimal("23789.3"))
                .size(new BigDecimal("1"))
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .build();

        PlaceOrderBaseParam order_two = PlaceOrderBaseParam.builder()
                .clientOid("RFIut#1592567335")
                .price(new BigDecimal("23888.3"))
                .size(new BigDecimal("1"))
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .build();

        orderDataList.add(order_one);
        orderDataList.add(order_two);
        PlaceBatchOrderRequest req = PlaceBatchOrderRequest.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderDataList(orderDataList)
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().order().batchOrders(req);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void cancelOrder() throws IOException {
        MixCancelOrderRequest req = MixCancelOrderRequest.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderId("802382049422487552")
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().order().cancelOrder(req);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void cancelBatchOrder() throws IOException {
        List<String> stringList = new ArrayList<>();
        stringList.add("802382049422487552");
        MixCancelBatchOrdersRequest req = MixCancelBatchOrdersRequest.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderIds(stringList)
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().order().cancelBatchOrder(req);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void history() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().order().history(symbol, startTime, endTime, pageSize, null, false);
        System.out.println(JSON.toJSONString(result));
    }

    // passed
    @Test
    public void current() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().order().current(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void detail() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().order().detail(symbol, "802377533381816325");
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void fills() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().order().fills(symbol, "802377533381816325");
        System.out.println(JSONObject.toJSONString(result));
    }
}
