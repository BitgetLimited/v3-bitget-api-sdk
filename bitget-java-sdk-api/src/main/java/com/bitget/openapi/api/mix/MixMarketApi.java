package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface MixMarketApi {

    @GET("/api/mix/v1/market/contracts")
    Call<ResponseResult> contracts();


    @GET("/api/mix/v1/market/depth")
    Call<ResponseResult> depth(@Query("symbol") String symbol,
                               @Query("limit") int limit);

    @GET("/api/mix/v1/market/ticker")
    Call<ResponseResult> ticker(@Query("symbol") String symbol);

    @GET("/api/mix/v1/market/tickers")
    Call<ResponseResult> tickers();

    @GET("/api/mix/v1/market/fills")
    Call<ResponseResult> fills(@Query("symbol") String symbol,
                               @Query("limit") int limit);

    @GET("/api/mix/v1/market/candles")
    Call<List<Object[]>> candles(@Query("symbol") String symbol,
                                 @Query("granularity") String granularity,
                                 @Query("startTime") String startTime,
                                 @Query("endTime") String endTime);

    @GET("/api/mix/v1/market/index")
    Call<ResponseResult> index(@Query("symbol") String symbol);

    @GET("/api/mix/v1/market/funding-time")
    Call<ResponseResult> fundingTime(@Query("symbol") String symbol);

    @GET("/api/mix/v1/market/history-fundRate")
    Call<ResponseResult> historyFundRate(@Query("symbol") String symbol,
                                         @Query("pageSize") int pageSize,
                                         @Query("pageNo") int pageNo,
                                         @Query("nextPage") boolean nextPage);

    @GET("/api/mix/v1/market/current-fundRate")
    Call<ResponseResult> currentFundRate(@Query("symbol") String symbol);

    @GET("/api/mix/v1/market/open-interest")
    Call<ResponseResult> openInterest(@Query("symbol") String symbol);

    @GET("/api/mix/v1/market/mark-price")
    Call<ResponseResult> markPrice(@Query("symbol") String symbol);


}

