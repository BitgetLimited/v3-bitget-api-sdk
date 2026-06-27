package com.bitget.openapi.service.v2.spot;

import com.bitget.openapi.api.v2.SpotWalletApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class SpotWalletService {

    private final SpotWalletApi spotWalletApi;

    public SpotWalletService(ApiClient client){
        spotWalletApi = client.create(SpotWalletApi.class);
    }

    public ResponseResult transfer(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotWalletApi.transfer(paramMap).execute().body());
    }

    public ResponseResult depositAddress(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotWalletApi.depositAddress(paramMap).execute().body());
    }

    public ResponseResult withdrawal(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotWalletApi.withdrawal(paramMap).execute().body());
    }

    public ResponseResult withdrawalRecords(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotWalletApi.withdrawalRecords(paramMap).execute().body());
    }

    public ResponseResult depositRecords(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotWalletApi.depositRecords(paramMap).execute().body());
    }
}
