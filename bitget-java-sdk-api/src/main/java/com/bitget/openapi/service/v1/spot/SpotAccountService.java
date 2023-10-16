package com.bitget.openapi.service.v1.spot;

import com.bitget.openapi.api.v1.SpotAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: bitget
 * @Date: 2021-05-31 15:08
 * @DES:
 */
public class SpotAccountService {

    private final SpotAccountApi spotAccountApi;

    public SpotAccountService(ApiClient client) {
        spotAccountApi = client.create(SpotAccountApi.class);
    }

    public ResponseResult getInfo(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotAccountApi.getInfo(paramMap).execute().body());
    }

    public ResponseResult assetsLite(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotAccountApi.assetsLite(paramMap).execute().body());
    }

    public ResponseResult bills(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotAccountApi.bills(paramMap).execute().body());
    }

    public ResponseResult transferRecords(Map<String,String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(spotAccountApi.transferRecords(paramMap).execute().body());
    }
}
