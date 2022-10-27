package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.enums.mix.MixOrderTypeEnum;
import com.bitget.openapi.enums.mix.MixSideEnum;
import com.bitget.openapi.enums.spot.ForceEnum;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MixOrderTest extends BaseTest {

    private static String symbol = "ETHUSD_DMCBL";
    private static String marginCoin = "ETH";
    private static String startTime = "1629113823000";
    private static String endTime = "1629513368000";
    private static String lastEndId = "0";
    private static int pageSize = 20;

    // passed
    @Test
    public void placeOrder() throws IOException {
        MixPlaceOrderReq req = MixPlaceOrderReq.builder()
                .clientOid("RFIut#"+System.currentTimeMillis())
                .symbol(symbol)
                .price(new BigDecimal("2"))
                .size(new BigDecimal("10"))
                .marginCoin(marginCoin)
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().order().placeOrder(req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void proportionOrder() throws IOException {
        MixPlaceOrderReq req = MixPlaceOrderReq.builder()
                .clientOid("RFIut#"+System.currentTimeMillis())
                .symbol(symbol)
                .price(new BigDecimal("5999.7"))
                .size(new BigDecimal("0.01"))
                .marginCoin(marginCoin)
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.MARKET.getCode())
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().order().proportionOrder(req);
        System.out.println(JSON.toJSONString(result,true));
        JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(result));
        JSONObject jsonObject1 = (JSONObject)jsonObject.get("data");
        ResponseResult resulta = bitgetRestClient.mix().bitget().order().detail(symbol, jsonObject1.get("orderId").toString());
        System.out.println(JSONObject.toJSONString(resulta,true));
    }
    // passed
    @Test
    public void batchOrders() throws IOException {
        List<PlaceOrderBaseReq> orderDataList = new ArrayList<>();

        PlaceOrderBaseReq order_one = PlaceOrderBaseReq.builder()
                .clientOid("RFIut#15914567782335")
                .price(new BigDecimal("23789.3"))
                .size(new BigDecimal("1"))
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .build();

        PlaceOrderBaseReq order_two = PlaceOrderBaseReq.builder()
                .clientOid("RFIut#1592567335")
                .price(new BigDecimal("23888.3"))
                .size(new BigDecimal("1"))
                .side(MixSideEnum.OPEN_LONG.getSide())
                .timeInForceValue(ForceEnum.NORMAL.getCode())
                .orderType(MixOrderTypeEnum.LIMIT.getCode())
                .build();

        orderDataList.add(order_one);
        orderDataList.add(order_two);
        PlaceBatchOrderReq req = PlaceBatchOrderReq.builder()
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
        MixCancelOrderReq req = MixCancelOrderReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .orderId("811489712408248322")
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().order().cancelOrder(req);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void cancelBatchOrder() throws IOException {
        List<String> stringList = new ArrayList<>();
        stringList.add("802382049422487552");
        MixCancelBatchOrdersReq req = MixCancelBatchOrdersReq.builder()
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
        ResponseResult result = bitgetRestClient.mix().bitget().order().detail(symbol, "842945946638233600");
        System.out.println(JSON.toJSONString(result,true));
    }
    // passed
    @Test
    public void fills() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().order().fills(symbol, "842893887893286912");
        System.out.println(JSONObject.toJSONString(result));
    }
}
