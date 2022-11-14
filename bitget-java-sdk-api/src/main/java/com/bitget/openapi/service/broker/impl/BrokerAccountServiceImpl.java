package com.bitget.openapi.service.broker.impl;

import com.bitget.openapi.api.broker.BrokerAccountApi;
import com.bitget.openapi.api.spot.SpotWalletApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.broker.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.broker.BrokerAccountService;
import retrofit2.Call;

import java.io.IOException;

public class BrokerAccountServiceImpl implements BrokerAccountService {

    private final BrokerAccountApi brokerAccountApi;

    public BrokerAccountServiceImpl(ApiClient client) {
        brokerAccountApi = client.create(BrokerAccountApi.class);
    }


    @Override
    public ResponseResult info() throws IOException {
        return null;
    }

    @Override
    public ResponseResult subCreate(BrokerSubCreateReq req) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subList(int pageSize, String lastEndId, String status) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subModify(BrokerSubModifyReq req) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subModifyEmail(BrokerSubModifyEmailReq req) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subEmail(String subUid) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subSpotAssets(String subUid) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subFutureAssets(String subUid, String productType) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subDepositAddress(BrokerSubAddressReq req) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subWithdraw(BrokerSubWithdrawReq req) throws IOException {
        return null;
    }

    @Override
    public ResponseResult subAutoTransfer(BrokerSubTransferReq req) throws IOException {
        return null;
    }
}
