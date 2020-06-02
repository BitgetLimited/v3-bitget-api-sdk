package com.bitget.contract.openapi.service.impl;


import com.bitget.contract.openapi.api.AccountApi;
import com.bitget.contract.openapi.common.client.ApiClient;
import com.bitget.contract.openapi.dto.request.AdjustMarginReq;
import com.bitget.contract.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.contract.openapi.dto.request.ChangeLeverageReq;
import com.bitget.contract.openapi.dto.request.LedgerReq;
import com.bitget.contract.openapi.dto.response.*;
import com.bitget.contract.openapi.service.AccountService;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class AccountServiceImpl implements AccountService {

    private final AccountApi accountApi;

    public AccountServiceImpl(ApiClient client) {
        accountApi = client.create(AccountApi.class);
    }

    @Override
    public List<AccountInfo> accounts() throws IOException {
        return accountApi.accounts().execute().body();
    }

    @Override
    public AccountInfo getAccount(String instrumentId) throws IOException {
        return accountApi.getAccount(instrumentId).execute().body();
    }

    @Override
    public AccountSetting settings(String instrumentId) throws IOException {
        return accountApi.settings(instrumentId).execute().body();
    }

    @Override
    public ChangeLeverageResult leverage(String instrumentId, ChangeLeverageReq changeLeverageReq) throws IOException {
        return accountApi.leverage(instrumentId, changeLeverageReq).execute().body();
    }

    @Override
    public List<LedgerResult> getLedger(String instrumentId, LedgerReq ledgerReq) throws IOException {
        return accountApi.getLedger(instrumentId, ledgerReq).execute().body();
    }

    @Override
    public List<LedgerResult> ledgerMargin(String instrumentId, LedgerReq ledgerReq) throws IOException {
        return accountApi.ledgerMargin(instrumentId, ledgerReq).execute().body();
    }

    @Override
    public AdjustMarginResult adjustMargin(String instrumentId, AdjustMarginReq adjustMarginReq) throws IOException {
        return accountApi.adjustMargin(instrumentId, adjustMarginReq).execute().body();
    }

    @Override
    public AutoAppendMarginResult modifyAutoAppendMargin(String instrumentId, AutoAppendMarginReq autoAppendMarginReq) throws IOException {
        return accountApi.modifyAutoAppendMargin(instrumentId, autoAppendMarginReq).execute().body();
    }
}
