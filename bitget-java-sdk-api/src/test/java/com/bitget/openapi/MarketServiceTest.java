package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
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
        ServerTime result = bitgetRestClient.contract().bitget().market().getTime();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getContractsApi() throws IOException {
        List<ContractInfo> result = bitgetRestClient.contract().bitget().market().getContractsApi();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getDepthApi() throws IOException {
        Depth result = bitgetRestClient.contract().bitget().market().getDepthApi(symbol, "100");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTickersApi() throws IOException {
        List<Ticker> result = bitgetRestClient.contract().bitget().market().getTickersApi();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTicker() throws IOException {
        Ticker result = bitgetRestClient.contract().bitget().market().getTicker("");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTrades() throws IOException {
        List<Trades> result = bitgetRestClient.contract().bitget().market().getTrades(symbol, "200");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getCandles() throws IOException {
        List<Object[]> result = bitgetRestClient.contract().bitget().market().getCandles(symbol,
                "2020-06-28T10:00:12.000Z", "2020-06-28T16:00:12.000Z", null,null,"60");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getIndex() throws IOException {
        Index result = bitgetRestClient.contract().bitget().market().getIndex(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getOpenInterestApi() throws IOException {
        OpenInterest result = bitgetRestClient.contract().bitget().market().getOpenInterestApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getPriceLimitApi() throws IOException {
        PriceLimit result = bitgetRestClient.contract().bitget().market().getPriceLimitApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getFundingTimeApi() throws IOException {
        FundingTime result = bitgetRestClient.contract().bitget().market().getFundingTimeApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getNewHistoricalFundingRateApi() throws IOException {

        List<HistoricalFundingRate> result = bitgetRestClient.contract().bitget().market().getNewHistoricalFundingRateApi(symbol, "1", "50");
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getMarkPriceApi() throws IOException {
        MarkPrice result = bitgetRestClient.contract().bitget().market().getMarkPriceApi(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void calOpenCount() throws IOException {
        String result = bitgetRestClient.contract().bitget().market().calOpenCount(symbol, "9999.9393", "20", "9000");
        System.out.println(result);
    }

}
