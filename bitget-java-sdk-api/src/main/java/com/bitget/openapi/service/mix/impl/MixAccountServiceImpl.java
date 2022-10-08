package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixAccountService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract account serviceImpl
 */
public class MixAccountServiceImpl implements MixAccountService {

    private final MixAccountApi mixAccountApi;

    public MixAccountServiceImpl(ApiClient client) {
        mixAccountApi = client.create(MixAccountApi.class);
    }

    /**
     * Get account  information
     * @param symbol
     * @param marginCoin
     * @return ResponseResult
     */
    @Override
    public ResponseResult getAccount(String symbol, String marginCoin) throws IOException {
        return mixAccountApi.account(symbol,marginCoin).execute().body();
    }

    /**
     * Get account  information list
     * @param productType
     * @return ResponseResult
     */
    @Override
    public ResponseResult getAccounts(String productType) throws IOException {
        return mixAccountApi.accounts(productType).execute().body();
    }

    /**
     * set lever
     * @param mixChangeLeverageReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult leverage(MixChangeLeverageReq mixChangeLeverageReq) throws IOException {
        return mixAccountApi.leverage(mixChangeLeverageReq).execute().body();
    }

    /**
     * Adjustment margin
     * @param mixAdjustMarginFixReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult margin(MixAdjustMarginFixReq mixAdjustMarginFixReq) throws IOException {
        return mixAccountApi.margin(mixAdjustMarginFixReq).execute().body();
    }

    /**
     * Adjust margin mode
     * @param adjustMarginModeReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult marginMode(AdjustMarginModeReq adjustMarginModeReq) throws IOException {
        return mixAccountApi.marginMode(adjustMarginModeReq).execute().body();
    }

    /**
     * Adjust hold mode
     * @param adjustHoldModeReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult positionMode(AdjustHoldModeReq adjustHoldModeReq) throws IOException {
        return mixAccountApi.positionMode(adjustHoldModeReq).execute().body();
    }

    /**
     * Get the openable quantity
     * @param mixOpenCountReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult openCount(MixOpenCountReq mixOpenCountReq) throws IOException {
        return mixAccountApi.openCount(mixOpenCountReq).execute().body();
    }
}
