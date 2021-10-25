package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.mix.ApiBalanceResult;
import com.bitget.openapi.dto.response.mix.ChangeHoldModeResult;
import com.bitget.openapi.dto.response.mix.ChangeLeverageResult;
import com.bitget.openapi.dto.response.mix.MixCommonResult;
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
    public ResponseResult leverage(MixChangeLeverageRequest mixChangeLeverageRequest) throws IOException {
        return mixAccountApi.leverage(mixChangeLeverageRequest).execute().body();
    }

    @Override
    public ResponseResult margin(MixAdjustMarginFixRequest mixAdjustMarginFixRequest) throws IOException {
        return mixAccountApi.margin(mixAdjustMarginFixRequest).execute().body();
    }

    @Override
    public ResponseResult marginMode(AdjustMarginModeRequest adjustMarginModeRequest) throws IOException {
        return mixAccountApi.marginMode(adjustMarginModeRequest).execute().body();
    }

    @Override
    public ResponseResult positionMode(AdjustHoldModeRequest adjustHoldModeRequest) throws IOException {
        return mixAccountApi.positionMode(adjustHoldModeRequest).execute().body();
    }

    @Override
    public ResponseResult openCount(MixOpenCountRequest mixOpenCountRequest) throws IOException {
        return mixAccountApi.openCount(mixOpenCountRequest).execute().body();
    }
}
