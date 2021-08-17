package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixTraceApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixTraceService;

import java.io.IOException;

public class MixTraceServiceImpl implements MixTraceService {

    private final MixTraceApi mixTraceApi;

    public MixTraceServiceImpl(ApiClient client) {
        mixTraceApi = client.create(MixTraceApi.class);
    }

    @Override
    public ResponseResult closeTraceOrder(MixCloseTrackOrderRequest mixCloseTrackOrderRequest) throws IOException {
        return mixTraceApi.closeTraceOrder(mixCloseTrackOrderRequest).execute().body();
    }

    @Override
    public ResponseResult currentTrack(String symbol, String productType, int pageSize, int pageNo) throws IOException {
        return mixTraceApi.currentTrack(symbol,productType,pageSize,pageNo).execute().body();
    }

    @Override
    public ResponseResult historyTrack(String startTime, String endTime, int pageSize, int pageNo) throws IOException {
        return mixTraceApi.historyTrack(startTime,endTime,pageSize,pageNo).execute().body();
    }

    @Override
    public ResponseResult summary() throws IOException {
        return mixTraceApi.summary().execute().body();
    }

    @Override
    public ResponseResult profitSettleTokenIdGroup() throws IOException {
        return mixTraceApi.profitSettleTokenIdGroup().execute().body();
    }

    @Override
    public ResponseResult profitDateGroupList(int pageSize, int pageNo) throws IOException {
        return mixTraceApi.profitDateGroupList(pageSize,pageNo).execute().body();
    }

    @Override
    public ResponseResult profitDateList(String marginCoin, String date, int pageSize, int pageNo) throws IOException {
        return mixTraceApi.profitDateList(marginCoin,date,pageSize,pageNo).execute().body();
    }

    @Override
    public ResponseResult waitProfitDateList(int pageSize, int pageNo) throws IOException {
        return mixTraceApi.waitProfitDateList(pageSize,pageNo).execute().body();
    }
}
