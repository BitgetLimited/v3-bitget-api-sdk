package com.bitget.openapi.service.v2.spot;

import com.bitget.openapi.api.v2.SpotMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class SpotMarketService {

    private final SpotMarketApi spotMarketApi;

    public SpotMarketService(ApiClient client) {
        spotMarketApi = client.create(SpotMarketApi.class);
    }

    public ResponseResult coins(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.coins(paramMap).execute().body());
    }

    public ResponseResult symbols(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.symbols(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.fills(paramMap).execute().body());
    }

    public ResponseResult orderbook(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.orderbook(paramMap).execute().body());
    }

    public ResponseResult tickers() throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.tickers().execute().body());
    }

    public ResponseResult candles(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.candles(paramMap).execute().body());
    }
}
