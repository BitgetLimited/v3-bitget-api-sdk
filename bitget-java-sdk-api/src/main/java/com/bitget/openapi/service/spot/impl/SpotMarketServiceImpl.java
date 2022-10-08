package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotMarketService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot market serviceImpl
 */
public class SpotMarketServiceImpl implements SpotMarketService {

    private final SpotMarketApi spotMarketApi;

    public SpotMarketServiceImpl(ApiClient client){
        spotMarketApi = client.create(SpotMarketApi.class);
    }

    /**
     * Obtain transaction data
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    @Override
    public ResponseResult fills(String symbol,Integer limit) throws IOException {
        return spotMarketApi.fills(symbol,limit).execute().body();
    }

    /**
     * Get depth data
     * @param symbol
     * @param limit
     * @param type
     * @return ResponseResult
     */
    @Override
    public ResponseResult depth(String symbol, Integer limit, String type) throws IOException {
        return spotMarketApi.depth(symbol,limit,type).execute().body();
    }

    /**
     * Get a Ticker Information
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult ticker(String symbol) throws IOException {
        return spotMarketApi.ticker(symbol).execute().body();
    }

    /**
     * Get all Ticker information
     * @return ResponseResult
     */
    @Override
    public ResponseResult tickers() throws IOException {
        return spotMarketApi.tickers().execute().body();
    }

    /**
     * Obtain K line data
     * @param symbol
     * @param period (Time unit and granularity of K line (refer to the following list for values))
     * @param after
     * @param before
     * @param limit
     * @return ResponseResult
     */
    @Override
    public ResponseResult candles(String symbol,String period,String after,String before,Integer limit) throws IOException{
        return spotMarketApi.candles(symbol,period,after,before,limit).execute().body();
    }
}
