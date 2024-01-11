package com.bitget.openapi.api;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class MixOrderTest extends BaseTest {

    @Test
    public void placeOrder() throws IOException {
        try {
            Map<String, String> paramMap = Maps.newHashMap();
            paramMap.put("symbol", "BTCUSDT_UMCBL");
            paramMap.put("marginCoin", "USDT");
            paramMap.put("side", "open_long");
            paramMap.put("orderType", "limit");
            paramMap.put("price", "27012.1");
            paramMap.put("size", "0.01");
            paramMap.put("timInForceValue", "normal");
            ResponseResult result = bitgetRestClient.bitget().v1().mixOrder().placeOrder(paramMap);
            System.out.println(JSON.toJSONString(result));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

    @Test
    public void post() throws IOException {
        Map<String, String> paramMap = Maps.newHashMap();
        paramMap.put("symbol", "BTCUSDT_UMCBL");
        paramMap.put("marginCoin", "USDT");
        paramMap.put("side", "open_long");
        paramMap.put("orderType", "limit");
        paramMap.put("price", "27012.1");
        paramMap.put("size", "0.01");
        paramMap.put("timInForceValue", "normal");
        ResponseResult result = bitgetRestClient.bitget().v1().request().post("/api/mix/v1/order/placeOrder", paramMap);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void get() throws IOException {
        Map<String, String> paramMap = Maps.newHashMap();
        paramMap.put("symbol", "BTCUSDT_UMCBL");
        paramMap.put("startTime", "1695632659703");
        paramMap.put("endTime", "1695635659703");
        ResponseResult result = bitgetRestClient.bitget().v1().request().get("/api/mix/v1/order/history", paramMap);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void get_comm() throws IOException {
        Map<String, String> paramMap = Maps.newHashMap();
        paramMap.put("symbol", "$AIUSDT");
        paramMap.put("businessType", "spot");
        ResponseResult result = bitgetRestClient.bitget().v1().request().get("/api/v2/common/trade-rate", paramMap);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getWithEmptyParams() throws IOException {
        ResponseResult result = bitgetRestClient.bitget().v1().request().get("/api/mix/v1/market/contract-vip-level", Maps.newHashMap());
        System.out.println(JSON.toJSONString(result));

        result = bitgetRestClient.bitget().v1().request().get("/api/mix/v1/market/contract-vip-level");
        System.out.println(JSON.toJSONString(result));
    }
}
