package com.bitget.openapi.service.impl;


import com.bitget.openapi.api.MarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.*;
import com.bitget.openapi.service.MarketService;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class MarketServiceImpl implements MarketService {

    private final MarketApi marketApi;

    public MarketServiceImpl(ApiClient client) {
        marketApi = client.create(MarketApi.class);
    }

    @Override
    public ServerTime getTime() throws IOException {
        Call<ServerTime> call = marketApi.getTime();
        return call.execute().body();
    }

    @Override
    public List<ContractInfo> getContractsApi() throws IOException {
        Call<List<ContractInfo>> call = marketApi.getContractsApi();
        return call.execute().body();
    }

    @Override
    public List<Ticker> getTickersApi() throws IOException {
        Call<List<Ticker>> call = marketApi.getTickersApi();
        return call.execute().body();
    }

    @Override
    public Ticker getInstrumentTicker(String instrumentId) throws IOException {
        Call<Ticker> call = marketApi.getInstrumentTicker(instrumentId);
        return call.execute().body();
    }

    @Override
    public List<Trades> getInstrumentTrades(String instrumentId, String limit) throws IOException {
        Call<List<Trades>> call = marketApi.getInstrumentTrades(instrumentId, limit);
        return call.execute().body();
    }

    @Override
    public Depth getDepthApi(String instrumentId, String size) throws IOException {
        Call<Depth> call = marketApi.getDepthApi(instrumentId, size);
        return call.execute().body();
    }

    @Override
    public List<Object[]> getInstrumentCandles(String instrumentId, String start, String end, String granularity) throws IOException {
        Call<List<Object[]>> call = marketApi.getInstrumentCandles(instrumentId, start, end, granularity);
        return call.execute().body();
    }

    @Override
    public Index getInstrumentIndex(String instrumentId) throws IOException {
        Call<Index> call = marketApi.getInstrumentIndex(instrumentId);
        return call.execute().body();
    }

    @Override
    public OpenInterest getOpenInterestApi(String instrumentId) throws IOException {
        Call<OpenInterest> call = marketApi.getOpenInterestApi(instrumentId);
        return call.execute().body();
    }

    @Override
    public PriceLimit getPriceLimitApi(String instrumentId) throws IOException {
        Call<PriceLimit> call = marketApi.getPriceLimitApi(instrumentId);
        return call.execute().body();
    }

    @Override
    public FundingTime getFundingTimeApi(String instrumentId) throws IOException {
        Call<FundingTime> call = marketApi.getFundingTimeApi(instrumentId);
        return call.execute().body();
    }

    @Override
    public HistoricalFundingRate getHistoricalFundingRateApi(String instrumentId) throws IOException {
        Call<HistoricalFundingRate> call = marketApi.getHistoricalFundingRateApi(instrumentId);
        return call.execute().body();
    }

    @Override
    public MarkPrice getMarkPriceApi(String instrumentId) throws IOException {
        Call<MarkPrice> call = marketApi.getMarkPriceApi(instrumentId);
        return call.execute().body();
    }


    @Override
    public String calOpenCount(String instrumentId, String amount, String leverage, String openPrice) throws IOException {
        Call<String> call = marketApi.calOpenCount(instrumentId, amount, leverage, openPrice);
        return call.execute().body();
    }

}
