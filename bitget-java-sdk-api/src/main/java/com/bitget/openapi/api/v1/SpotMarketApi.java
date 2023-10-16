package com.bitget.openapi.api.v1;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface SpotMarketApi {

    @GET("/api/spot/v1/public/currencies")
    Call<ResponseResult> currencies();

    @GET("/api/spot/v1/public/products")
    Call<ResponseResult> products();

    @GET("/api/spot/v1/public/product")
    Call<ResponseResult> product(@QueryMap Map<String, String> paramMap);

    @GET("/api/spot/v1/market/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/spot/v1/market/depth")
    Call<ResponseResult> depth(@QueryMap Map<String, String> paramMap);

    @GET("/api/spot/v1/market/ticker")
    Call<ResponseResult> ticker(@QueryMap Map<String, String> paramMap);

    @GET("/api/spot/v1/market/tickers")
    Call<ResponseResult> tickers();

    @GET("/api/spot/v1/market/candles")
    Call<ResponseResult> candles(@QueryMap Map<String, String> paramMap);
}
