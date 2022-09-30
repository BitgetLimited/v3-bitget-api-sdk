package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import java.util.List;


/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract quotation interface
 */
public interface MixMarketApi {

    /**
     * Contract information
     * @param productType
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/contracts")
    Call<ResponseResult> contracts(@Query("productType") String productType);

    /**
     * Deep market
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/depth")
    Call<ResponseResult> depth(@Query("symbol") String symbol,
                               @Query("limit") int limit);

    /**
     * Deep market
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/ticker")
    Call<ResponseResult> ticker(@Query("symbol") String symbol);

    /**
     * Acquisition of single ticker market
     * @param productType
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/tickers")
    Call<ResponseResult> tickers(@Query("productType") String productType);

    /**
     * Obtain transaction details
     * @param symbol
     * @param limit
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/fills")
    Call<ResponseResult> fills(@Query("symbol") String symbol,
                               @Query("limit") int limit);

    /**
     * Obtain K line data
     * @param symbol
     * @param granularity (Category of k line)
     * @param startTime
     * @param endTime
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/candles")
    Call<List<Object[]>> candles(@Query("symbol") String symbol,
                                 @Query("granularity") String granularity,
                                 @Query("startTime") String startTime,
                                 @Query("endTime") String endTime);

    /**
     * Get currency index
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/index")
    Call<ResponseResult> index(@Query("symbol") String symbol);

    /**
     * Get the next settlement time of the contract
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/funding-time")
    Call<ResponseResult> fundingTime(@Query("symbol") String symbol);

    /**
     * Get historical fund rate
     * @param symbol
     * @param pageSize
     * @param pageNo
     * @param nextPage
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/history-fundRate")
    Call<ResponseResult> historyFundRate(@Query("symbol") String symbol,
                                         @Query("pageSize") int pageSize,
                                         @Query("pageNo") int pageNo,
                                         @Query("nextPage") boolean nextPage);

    /**
     * Get the current fund rate
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/current-fundRate")
    Call<ResponseResult> currentFundRate(@Query("symbol") String symbol);

    /**
     * Obtain the total position of the platform
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/open-interest")
    Call<ResponseResult> openInterest(@Query("symbol") String symbol);

    /**
     * Get contract tag price
     * @param symbol
     * @return ResponseResult
     */
    @GET("/api/mix/v1/market/mark-price")
    Call<ResponseResult> markPrice(@Query("symbol") String symbol);


}

