package com.bitget.openapi.service.impl;


import com.bitget.openapi.api.AccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.AdjustMarginReq;
import com.bitget.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.openapi.dto.request.ChangeLeverageReq;
import com.bitget.openapi.dto.request.LedgerReq;
import com.bitget.openapi.dto.response.*;
import com.bitget.openapi.service.AccountService;

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
    public AccountInfo getAccount(String symbol) throws IOException {
        return accountApi.getAccount(symbol).execute().body();
    }

    @Override
    public AccountSetting settings(String symbol) throws IOException {
        return accountApi.settings(symbol).execute().body();
    }

    @Override
    public ChangeLeverageResult leverage( ChangeLeverageReq changeLeverageReq) throws IOException {
        return accountApi.leverage(changeLeverageReq).execute().body();
    }

    @Override
    public List<LedgerResult> getLedger(String symbol,String from,
                                        String to,String limit, String startTime,
                                        String endTime) throws IOException {
        return accountApi.getLedger(symbol, from,to,limit,startTime,endTime).execute().body();
    }

    @Override
    public List<LedgerResult> ledgerMargin(String symbol, String from,
                                           String to,String limit, String startTime,
                                           String endTime) throws IOException {
        return accountApi.ledgerMargin(symbol,from,to,limit,startTime,endTime).execute().body();
    }

    @Override
    public AdjustMarginResult adjustMargin( AdjustMarginReq adjustMarginReq) throws IOException {
        return accountApi.adjustMargin(adjustMarginReq).execute().body();
    }

    @Override
    public AutoAppendMarginResult modifyAutoAppendMargin( AutoAppendMarginReq autoAppendMarginReq) throws IOException {
        return accountApi.modifyAutoAppendMargin(autoAppendMarginReq).execute().body();
    }
}
