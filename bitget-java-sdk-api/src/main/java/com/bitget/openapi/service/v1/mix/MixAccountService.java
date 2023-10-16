package com.bitget.openapi.service.v1.mix;

import com.bitget.openapi.api.v1.MixAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class MixAccountService {

    private final MixAccountApi mixAccountApi;

    public MixAccountService(ApiClient client) {
        mixAccountApi = client.create(MixAccountApi.class);
    }

    public ResponseResult getAccount(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.account(paramMap).execute().body());
    }

    public ResponseResult getAccounts(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.accounts(paramMap).execute().body());
    }

    public ResponseResult setLeverage(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.setLeverage(paramMap).execute().body());
    }

    public ResponseResult setMargin(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.setMargin(paramMap).execute().body());
    }

    public ResponseResult setMarginMode(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.setMarginMode(paramMap).execute().body());
    }

    public ResponseResult setPositionMode(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.setPositionMode(paramMap).execute().body());
    }

    public ResponseResult singlePosition(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.singlePosition(paramMap).execute().body());
    }

    public ResponseResult allPosition(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(mixAccountApi.allPosition(paramMap).execute().body());
    }
}
