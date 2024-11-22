package com.bitget.openapi.service.v1.spot;

import com.bitget.openapi.api.v1.SpotMarketApi;
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

    public ResponseResult currencies() throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.currencies().execute().body());
    }

    public ResponseResult products() throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.products().execute().body());
    }

    public ResponseResult product(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.product(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.fills(paramMap).execute().body());
    }

    public ResponseResult depth(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.depth(paramMap).execute().body());
    }

    public ResponseResult ticker(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.ticker(paramMap).execute().body());
    }

    public ResponseResult tickers() throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.tickers().execute().body());
    }

    public ResponseResult candles(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotMarketApi.candles(paramMap).execute().body());
    }
}
