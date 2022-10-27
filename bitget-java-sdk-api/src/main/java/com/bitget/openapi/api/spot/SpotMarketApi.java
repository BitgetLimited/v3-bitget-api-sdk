package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot market api
 */
public interface SpotMarketApi {

    /**
     * Obtain transaction data
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    @GET("/api/spot/v1/market/fills")
    Call<ResponseResult> fills(@Query("symbol") String symbol,@Query("limit") Integer limit);

    /**
     * Get depth data
     * @param symbol
     * @param limit
     * @param type
     * @return ResponseResult
     */
    @GET("/api/spot/v1/market/depth")
    Call<ResponseResult> depth(@Query("symbol") String symbol,
                               @Query("limit") Integer limit,
                               @Query("type") String type);

    /**
     * Get a Ticker Information
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/spot/v1/market/ticker")
    Call<ResponseResult> ticker(@Query("symbol") String symbol);

    /**
     * Get all Ticker information
     * @return ResponseResult
     */
    @GET("/api/spot/v1/market/tickers")
    Call<ResponseResult> tickers();

    /**
     * Obtain K line data
     * @param symbol
     * @param period (Time unit and granularity of K line (refer to the following list for values))
     * @param after
     * @param before
     * @param limit
     * @return ResponseResult
     */
    @GET("/api/spot/v1/market/candles")
    Call<ResponseResult> candles(@Query("symbol") String symbol,
                                 @Query("period") String period,
                                 @Query("after") String after,
                                 @Query("before") String before,
                                 @Query("limit") Integer limit);
}
