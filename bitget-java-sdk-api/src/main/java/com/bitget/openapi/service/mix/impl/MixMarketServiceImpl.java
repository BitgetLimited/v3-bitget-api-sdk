package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixMarketService;

import java.io.IOException;
import java.util.List;

public class MixMarketServiceImpl implements MixMarketService {

    private final MixMarketApi mixMarketApi;

    public MixMarketServiceImpl(ApiClient client) {
        mixMarketApi = client.create(MixMarketApi.class);
    }

    @Override
    public ResponseResult contracts() throws IOException {
        return mixMarketApi.contracts().execute().body();
    }

    @Override
    public ResponseResult depth(String symbol, int limit) throws IOException {
        return mixMarketApi.depth(symbol,limit).execute().body();
    }

    @Override
    public ResponseResult ticker(String symbol) throws IOException {
        return mixMarketApi.ticker(symbol).execute().body();
    }

    @Override
    public ResponseResult tickers() throws IOException {
        return mixMarketApi.tickers().execute().body();
    }

    @Override
    public ResponseResult fills(String symbol, int limit) throws IOException {
        return mixMarketApi.fills(symbol,limit).execute().body();
    }

    @Override
    public List<Object[]> candles(String symbol, String granularity, String startTime, String endTime) throws IOException {
        return mixMarketApi.candles(symbol,granularity,startTime,endTime).execute().body();
    }

    @Override
    public ResponseResult index(String symbol) throws IOException {
        return mixMarketApi.index(symbol).execute().body();
    }

    @Override
    public ResponseResult fundingTime(String symbol) throws IOException {
        return mixMarketApi.fundingTime(symbol).execute().body();
    }

    @Override
    public ResponseResult historyFundRate(String symbol, int pageSize, int pageNo, boolean nextPage) throws IOException {
        return mixMarketApi.historyFundRate(symbol,pageSize , pageNo, nextPage).execute().body();
    }

    @Override
    public ResponseResult currentFundRate(String symbol) throws IOException {
        return mixMarketApi.currentFundRate(symbol).execute().body();
    }

    @Override
    public ResponseResult openInterest(String symbol) throws IOException {
        return mixMarketApi.openInterest(symbol).execute().body();
    }

    @Override
    public ResponseResult markPrice(String symbol) throws IOException {
        return mixMarketApi.markPrice(symbol).execute().body();
    }

}
