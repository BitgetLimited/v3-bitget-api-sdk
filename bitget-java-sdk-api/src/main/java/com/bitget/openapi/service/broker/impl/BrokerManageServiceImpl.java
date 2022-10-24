package com.bitget.openapi.service.broker.impl;

import com.bitget.openapi.api.broker.BrokerAccountApi;
import com.bitget.openapi.api.broker.BrokerManageApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.broker.BrokerSubApiReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.broker.BrokerManageService;

import java.io.IOException;

public class BrokerManageServiceImpl implements BrokerManageService {

    private final BrokerManageApi brokerManageApi;

    public BrokerManageServiceImpl(ApiClient client) {
        brokerManageApi = client.create(BrokerManageApi.class);
    }


    @Override
    public ResponseResult subApiCreate(BrokerSubApiReq req) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subApiList(String subUid) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subApiModify(BrokerSubApiReq req) throws IOException {
        return null;
    }
}
