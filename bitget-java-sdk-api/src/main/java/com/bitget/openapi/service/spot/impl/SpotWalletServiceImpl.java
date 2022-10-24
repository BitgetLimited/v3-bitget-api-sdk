package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotPublicApi;
import com.bitget.openapi.api.spot.SpotWalletApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.spot.SpotSubTransferReq;
import com.bitget.openapi.dto.request.spot.SpotTransferReq;
import com.bitget.openapi.dto.request.spot.SpotWithdrawalInnerReq;
import com.bitget.openapi.dto.request.spot.SpotWithdrawalReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotWalletService;

import java.io.IOException;

public class SpotWalletServiceImpl implements SpotWalletService {

    private final SpotWalletApi spotWalletApi;

    public SpotWalletServiceImpl(ApiClient client) {
        spotWalletApi = client.create(SpotWalletApi.class);
    }

    @Override
    public ResponseResult transfer(SpotTransferReq body) throws IOException {
        return spotWalletApi.transfer(body).execute().body();
    }

    @Override
    public ResponseResult subTransfer(SpotSubTransferReq body) throws IOException {
        return spotWalletApi.subTransfer(body).execute().body();
    }

    @Override
    public ResponseResult depositAddress(String coin, String chain) throws IOException {
        return spotWalletApi.depositAddress(coin,chain).execute().body();
    }

    @Override
    public ResponseResult withdrawal(SpotWithdrawalReq body) throws IOException {
        return spotWalletApi.withdrawal(body).execute().body();
    }

    @Override
    public ResponseResult withdrawalInner(SpotWithdrawalInnerReq body) throws IOException {
        return spotWalletApi.withdrawalInner(body).execute().body();
    }

    @Override
    public ResponseResult withdrawalList(String coin, String startTime, String endTime, Integer pageNo, Integer pageSize) throws IOException {
        return spotWalletApi.withdrawalList(coin,startTime,endTime,pageNo,pageSize).execute().body();
    }

    @Override
    public ResponseResult depositList(String coin, String startTime, String endTime, Integer pageNo, Integer pageSize) throws IOException {
        return spotWalletApi.depositList(coin,startTime,endTime,pageNo,pageSize).execute().body();
    }
}
