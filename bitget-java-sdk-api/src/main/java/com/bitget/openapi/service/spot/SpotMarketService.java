package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot market service
 */
public interface SpotMarketService {

    /**
     * Obtain transaction data
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    ResponseResult fills(String symbol,Integer limit) throws IOException;

    /**
     * Get depth data
     * @param symbol
     * @param limit
     * @param type
     * @return ResponseResult
     */
    ResponseResult depth(String symbol,Integer limit,String type) throws IOException;

    /**
     * Get a Ticker Information
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult ticker(String symbol) throws IOException;

    /**
     * Get all Ticker information
     * @return ResponseResult
     */
    ResponseResult tickers() throws IOException;

    /**
     * Obtain K line data
     * @param symbol
     * @param period (Time unit and granularity of K line (refer to the following list for values))
     * @param after
     * @param before
     * @param limit
     * @return ResponseResult
     */
    ResponseResult candles(String symbol,String period,String after,String before,Integer limit) throws IOException;
}
