package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class MarketServiceTest extends BaseTest {

    private static final String symbol = "cmt_btcusdt";

    @Test
    public void time() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getTime();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getContractsApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getContractsApi();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getDepthApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getDepthApi(symbol, "100");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTickersApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getTickersApi();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTicker() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getTicker("");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTrades() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getTrades(symbol, "200");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getCandles() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getCandles(symbol,
                null, null, 1604213104000L, 1604290900000L,"60");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getIndex() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getIndex(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getOpenInterestApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getOpenInterestApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getPriceLimitApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getPriceLimitApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getFundingTimeApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getFundingTimeApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getNewHistoricalFundingRateApi() throws IOException {

        JSONObject result = bitgetRestClient.contract().bitget().market().getNewHistoricalFundingRateApi(symbol, "1", "50");
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getMarkPriceApi() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().getMarkPriceApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void calOpenCount() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().market().calOpenCount(symbol, "9999.9393", "20", "9000");
        System.out.println(result);
    }

}
