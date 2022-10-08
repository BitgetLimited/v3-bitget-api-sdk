package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotAccountService;
import java.io.IOException;

/**
 * @Author: bitget
 * @Date: 2021-05-31 15:08
 * @DES:
 */
public class SpotAccountServiceImpl implements SpotAccountService {

    private final SpotAccountApi spotAccountApi;

    public SpotAccountServiceImpl(ApiClient client) {
        spotAccountApi = client.create(SpotAccountApi.class);
    }

    @Override
    public ResponseResult assets() throws IOException {
        return spotAccountApi.assets().execute().body();
    }

    @Override
    public ResponseResult bills(SpotBillQueryReq spotBillQueryReq) throws IOException {
        return spotAccountApi.bills(spotBillQueryReq).execute().body();
    }

    @Override
    public ResponseResult transferRecords(String coinId, String fromType, String limit, String after, String before) throws IOException {
        return spotAccountApi.transferRecords(coinId,fromType,limit,after,before).execute().body();
    }
}
