package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotAccountService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot account serviceImpl
 */
public class SpotAccountServiceImpl implements SpotAccountService {

    private final SpotAccountApi spotAccountApi;

    public SpotAccountServiceImpl(ApiClient client) {
        spotAccountApi = client.create(SpotAccountApi.class);
    }

    /**
     * Obtain account assets
     * @return ResponseResult
     */
    @Override
    public ResponseResult assets(String coin) throws IOException {
        return spotAccountApi.assets(coin).execute().body();
    }

    /**
     * Get the bill flow
     * @param spotBillQueryReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult bills(SpotBillQueryReq spotBillQueryReq) throws IOException {
        return spotAccountApi.bills(spotBillQueryReq).execute().body();
    }

    /**
     * Obtain transfer records
     * @param coinId
     * @param fromType
     * @param limit
     * @param after
     * @param before
     * @return ResponseResult
     */
    @Override
    public ResponseResult transferRecords(String coinId, String fromType, String limit, String after, String before) throws IOException {
        return spotAccountApi.transferRecords(coinId,fromType,limit,after,before).execute().body();
    }
}
