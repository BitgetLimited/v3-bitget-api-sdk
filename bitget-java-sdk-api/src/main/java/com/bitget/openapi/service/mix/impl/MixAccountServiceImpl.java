package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixAccountService;

import java.io.IOException;

public class MixAccountServiceImpl implements MixAccountService {

    private final MixAccountApi mixAccountApi;

    public MixAccountServiceImpl(ApiClient client) {
        mixAccountApi = client.create(MixAccountApi.class);
    }

    @Override
    public ResponseResult getAccount(String symbol, String marginCoin) throws IOException {
        return mixAccountApi.account(symbol,marginCoin).execute().body();
    }

    @Override
    public ResponseResult getAccounts(String productType) throws IOException {
        return mixAccountApi.accounts(productType).execute().body();
    }


    @Override
    public ResponseResult leverage(MixChangeLeverageReq mixChangeLeverageReq) throws IOException {
        return mixAccountApi.leverage(mixChangeLeverageReq).execute().body();
    }

    @Override
    public ResponseResult margin(MixAdjustMarginFixReq mixAdjustMarginFixReq) throws IOException {
        return mixAccountApi.margin(mixAdjustMarginFixReq).execute().body();
    }

    @Override
    public ResponseResult marginMode(AdjustMarginModeReq adjustMarginModeReq) throws IOException {
        return mixAccountApi.marginMode(adjustMarginModeReq).execute().body();
    }

    @Override
    public ResponseResult positionMode(AdjustHoldModeReq adjustHoldModeReq) throws IOException {
        return mixAccountApi.positionMode(adjustHoldModeReq).execute().body();
    }

    @Override
    public ResponseResult openCount(MixOpenCountReq mixOpenCountReq) throws IOException {
        return mixAccountApi.openCount(mixOpenCountReq).execute().body();
    }
}
