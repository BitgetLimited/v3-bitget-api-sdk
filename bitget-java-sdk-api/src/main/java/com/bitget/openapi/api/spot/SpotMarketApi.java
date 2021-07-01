package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SpotMarketApi {

    @GET("/api/spot/v1/market/fills")
    Call<ResponseResult> fills(@Query("symbol") String symbol,@Query("limit") Integer limit);


    @GET("/api/spot/v1/market/depth")
    Call<ResponseResult> depth(@Query("symbol") String symbol,
                               @Query("limit") Integer limit,
                               @Query("type") String type);


    @GET("/api/spot/v1/market/ticker")
    Call<ResponseResult> ticker(@Query("symbol") String symbol);


    @GET("/api/spot/v1/market/tickers")
    Call<ResponseResult> tickers();


    @GET("/api/spot/v1/market/candles")
    Call<ResponseResult> candles(@Query("symbol") String symbol,
                                 @Query("period") String period,
                                 @Query("after") String after,
                                 @Query("before") String before,
                                 @Query("limit") Integer limit);
}
