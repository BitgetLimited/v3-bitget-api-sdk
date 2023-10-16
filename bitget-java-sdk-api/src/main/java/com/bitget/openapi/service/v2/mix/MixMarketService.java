package com.bitget.openapi.service.v2.mix;

import com.bitget.openapi.api.v2.MixMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class MixMarketService {

    private final MixMarketApi mixMarketApi;

    public MixMarketService(ApiClient client) {
        mixMarketApi = client.create(MixMarketApi.class);
    }

    public ResponseResult contracts(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixMarketApi.contracts(paramMap).execute().body());
    }

    public ResponseResult orderbook(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixMarketApi.orderbook(paramMap).execute().body());
    }

    public ResponseResult ticker(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixMarketApi.ticker(paramMap).execute().body());
    }

    public ResponseResult tickers(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixMarketApi.tickers(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixMarketApi.fills(paramMap).execute().body());
    }

    public ResponseResult candles(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixMarketApi.candles(paramMap).execute().body());
    }
}
