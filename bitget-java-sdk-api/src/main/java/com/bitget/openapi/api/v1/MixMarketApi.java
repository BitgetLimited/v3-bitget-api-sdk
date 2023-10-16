package com.bitget.openapi.api.v1;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface MixMarketApi {

    @GET("/api/mix/v1/market/contracts")
    Call<ResponseResult> contracts(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/market/depth")
    Call<ResponseResult> depth(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/market/ticker")
    Call<ResponseResult> ticker(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/market/tickers")
    Call<ResponseResult> tickers(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/market/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/mix/v1/market/candles")
    Call<ResponseResult> candles(@QueryMap Map<String, String> paramMap);

}

