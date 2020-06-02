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


    private static final String instrumentId = "cmt_btcusdt";

    @Test
    public void time() throws IOException {
        for (int i = 0; i < 100; i++) {
            ServerTime result = bitgetRestClient.contract().bitget().market().getTime();
            System.out.println(JSON.toJSONString(result));
        }

    }

    @Test
    public void getContractsApi() throws IOException {
        List<ContractInfo> result = bitgetRestClient.contract().bitget().market().getContractsApi();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getDepthApi() throws IOException {
        Depth result = bitgetRestClient.contract().bitget().market().getDepthApi(instrumentId, "1000");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getTickersApi() throws IOException {
        List<Ticker> result = bitgetRestClient.contract().bitget().market().getTickersApi();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getInstrumentTicker() throws IOException {
        Ticker result = bitgetRestClient.contract().bitget().market().getInstrumentTicker(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getInstrumentTrades() throws IOException {
        List<Trades> result = bitgetRestClient.contract().bitget().market().getInstrumentTrades(instrumentId, "200");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getInstrumentCandles() throws IOException {
        List<Object[]> result = bitgetRestClient.contract().bitget().market().getInstrumentCandles(instrumentId, "0", "100", "200");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getInstrumentIndex() throws IOException {
        Index result = bitgetRestClient.contract().bitget().market().getInstrumentIndex(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getOpenInterestApi() throws IOException {
        OpenInterest result = bitgetRestClient.contract().bitget().market().getOpenInterestApi(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getPriceLimitApi() throws IOException {
        PriceLimit result = bitgetRestClient.contract().bitget().market().getPriceLimitApi(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getFundingTimeApi() throws IOException {
        FundingTime result = bitgetRestClient.contract().bitget().market().getFundingTimeApi(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getHistoricalFundingRateApi() throws IOException {
        HistoricalFundingRate result = bitgetRestClient.contract().bitget().market().getHistoricalFundingRateApi(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getMarkPriceApi() throws IOException {
        MarkPrice result = bitgetRestClient.contract().bitget().market().getMarkPriceApi(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void calOpenCount() throws IOException {
        String result = bitgetRestClient.contract().bitget().market().calOpenCount(instrumentId, "10000", "10", "9000");
        System.out.println(result);
    }

}
