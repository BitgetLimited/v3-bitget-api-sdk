package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixMarketService;
import java.io.IOException;
import java.util.List;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract quotation serviceImpl
 */
public class MixMarketServiceImpl implements MixMarketService {

    private final MixMarketApi mixMarketApi;

    public MixMarketServiceImpl(ApiClient client) {
        mixMarketApi = client.create(MixMarketApi.class);
    }

    /**
     * Contract information
     * @param productType
     * @return ResponseResult
     */
    @Override
    public ResponseResult contracts(String productType) throws IOException {
        return mixMarketApi.contracts(productType).execute().body();
    }

    /**
     * Deep market
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    @Override
    public ResponseResult depth(String symbol, int limit) throws IOException {
        return mixMarketApi.depth(symbol,limit).execute().body();
    }

    /**
     * Deep market
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult ticker(String symbol) throws IOException {
        return mixMarketApi.ticker(symbol).execute().body();
    }

    /**
     * Acquisition of single ticker market
     * @param productType
     * @return ResponseResult
     */
    @Override
    public ResponseResult tickers(String productType) throws IOException {
        return mixMarketApi.tickers(productType).execute().body();
    }

    /**
     * Obtain transaction details
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    @Override
    public ResponseResult fills(String symbol, int limit) throws IOException {
        return mixMarketApi.fills(symbol,limit).execute().body();
    }

    /**
     * Obtain K line data
     * @param symbol
     * @param granularity (Category of k line)
     * @param startTime
     * @param endTime
     * @return ResponseResult
     */
    @Override
    public List<Object[]> candles(String symbol, String granularity, String startTime, String endTime) throws IOException {
        return mixMarketApi.candles(symbol,granularity,startTime,endTime).execute().body();
    }

    /**
     * Get currency index
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult index(String symbol) throws IOException {
        return mixMarketApi.index(symbol).execute().body();
    }

    /**
     * Get the next settlement time of the contract
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult fundingTime(String symbol) throws IOException {
        return mixMarketApi.fundingTime(symbol).execute().body();
    }

    /**
     * Get historical fund rate
     * @param symbol
     * @param pageSize
     * @param pageNo
     * @param nextPage
     * @return ResponseResult
     */
    @Override
    public ResponseResult historyFundRate(String symbol, int pageSize, int pageNo, boolean nextPage) throws IOException {
        return mixMarketApi.historyFundRate(symbol,pageSize , pageNo, nextPage).execute().body();
    }

    /**
     * Get the current fund rate
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult currentFundRate(String symbol) throws IOException {
        return mixMarketApi.currentFundRate(symbol).execute().body();
    }

    /**
     * Obtain the total position of the platform
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult openInterest(String symbol) throws IOException {
        return mixMarketApi.openInterest(symbol).execute().body();
    }

    /**
     * Get contract tag price
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult markPrice(String symbol) throws IOException {
        return mixMarketApi.markPrice(symbol).execute().body();
    }

}
