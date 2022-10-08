package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;
import java.util.List;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract quotation service
 */
public interface MixMarketService {

    /**
     * Contract information
     * @param productType
     * @return ResponseResult
     */
    ResponseResult contracts(String productType) throws IOException;

    /**
     * Deep market
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    ResponseResult depth(String symbol,int limit) throws IOException;

    /**
     * Deep market
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult ticker(String symbol) throws IOException;

    /**
     * Acquisition of single ticker market
     * @param productType
     * @return ResponseResult
     */
    ResponseResult tickers(String productType) throws IOException;

    /**
     * Obtain transaction details
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    ResponseResult fills(String symbol,int limit) throws IOException;

    /**
     * Obtain K line data
     * @param symbol
     * @param granularity (Category of k line)
     * @param startTime
     * @param endTime
     * @return ResponseResult
     */
    List<Object[]> candles(String symbol, String granularity, String startTime, String endTime) throws IOException;

    /**
     * Get currency index
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult index(String symbol) throws IOException;

    /**
     * Get the next settlement time of the contract
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult fundingTime(String symbol) throws IOException;

    /**
     * Get historical fund rate
     * @param symbol
     * @param pageSize
     * @param pageNo
     * @param nextPage
     * @return ResponseResult
     */
    ResponseResult historyFundRate(String symbol, int pageSize, int pageNo, boolean nextPage) throws IOException;

    /**
     * Get the current fund rate
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult currentFundRate(String symbol) throws IOException;

    /**
     * Obtain the total position of the platform
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult openInterest(String symbol) throws IOException;

    /**
     * Get contract tag price
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult markPrice(String symbol) throws IOException;


}
