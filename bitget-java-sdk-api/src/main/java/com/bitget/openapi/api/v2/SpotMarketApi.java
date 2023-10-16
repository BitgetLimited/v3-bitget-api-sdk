package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface SpotMarketApi {

    @GET("/api/v2/spot/public/coins")
    Call<ResponseResult> coins(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/spot/public/symbols")
    Call<ResponseResult> symbols(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/spot/market/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/spot/market/orderbook")
    Call<ResponseResult> orderbook(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/spot/market/tickers")
    Call<ResponseResult> tickers();

    @GET("/api/v2/spot/market/candles")
    Call<ResponseResult> candles(@QueryMap Map<String, String> paramMap);
}
