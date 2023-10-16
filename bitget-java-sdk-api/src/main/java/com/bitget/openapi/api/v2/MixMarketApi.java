package com.bitget.openapi.api.v2;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface MixMarketApi {

    @GET("/api/v2/mix/market/contracts")
    Call<ResponseResult> contracts(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/market/orderbook")
    Call<ResponseResult> orderbook(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/market/ticker")
    Call<ResponseResult> ticker(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/market/tickers")
    Call<ResponseResult> tickers(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/market/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/v2/mix/market/candles")
    Call<ResponseResult> candles(@QueryMap Map<String, String> paramMap);

}

