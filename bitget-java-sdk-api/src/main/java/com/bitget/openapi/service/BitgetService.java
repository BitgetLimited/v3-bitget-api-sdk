package com.bitget.openapi.service;

import com.bitget.openapi.api.BitgetApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.google.common.collect.Maps;

import java.io.IOException;
import java.util.Map;

public class BitgetService {

    private final BitgetApi bitgetApi;

    public BitgetService(ApiClient client) {
        bitgetApi = client.create(BitgetApi.class);
    }

    public ResponseResult get(String url, Map<String, String> paramMap) throws IOException {
        return bitgetApi.sendGetRequest(url, paramMap).execute().body();
    }

    public ResponseResult get(String url) throws IOException {
        return get(url, Maps.newHashMap());
    }

    public ResponseResult post(String url, Map<String, String> paramMap) throws IOException {
        return bitgetApi.sendPostRequest(url, paramMap).execute().body();
    }

    public ResponseResult post(String url) throws IOException {
        return post(url, Maps.newHashMap());
    }
}
