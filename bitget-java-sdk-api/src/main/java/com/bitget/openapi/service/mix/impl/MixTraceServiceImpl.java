package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixTraceApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixTraceService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: mix trace serviceImpl
 */
public class MixTraceServiceImpl implements MixTraceService {

    private final MixTraceApi mixTraceApi;

    public MixTraceServiceImpl(ApiClient client) {
        mixTraceApi = client.create(MixTraceApi.class);
    }

    /**
     * Dealer closing interface
     * @param mixCloseTrackOrderReq
     * @return ResponseResult
     */
    @Override
    public ResponseResult closeTraceOrder(MixCloseTrackOrderReq mixCloseTrackOrderReq) throws IOException {
        return mixTraceApi.closeTraceOrder(mixCloseTrackOrderReq).execute().body();
    }

    /**
     * The trader obtains the current order
     * @param symbol
     * @param productType
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @Override
    public ResponseResult currentTrack(String symbol, String productType, int pageSize, int pageNo) throws IOException {
        return mixTraceApi.currentTrack(symbol,productType,pageSize,pageNo).execute().body();
    }

    /**
     * The trader obtains the historical order
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @Override
    public ResponseResult historyTrack(String startTime, String endTime, int pageSize, int pageNo) throws IOException {
        return mixTraceApi.historyTrack(startTime,endTime,pageSize,pageNo).execute().body();
    }

    /**
     * Summary of traders' profit sharing
     * @return ResponseResult
     */
    @Override
    public ResponseResult summary() throws IOException {
        return mixTraceApi.summary().execute().body();
    }

    /**
     * Historical profit sharing summary of traders (by settlement currency)
     * @return ResponseResult
     */
    @Override
    public ResponseResult profitSettleTokenIdGroup() throws IOException {
        return mixTraceApi.profitSettleTokenIdGroup().execute().body();
    }

    /**
     * Historical profit sharing summary of traders (by settlement currency and date)
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @Override
    public ResponseResult profitDateGroupList(int pageSize, int pageNo) throws IOException {
        return mixTraceApi.profitDateGroupList(pageSize,pageNo).execute().body();
    }

    /**
     * Historical profit distribution details of traders
     * @param marginCoin
     * @param date
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @Override
    public ResponseResult profitDateList(String marginCoin, String date, int pageSize, int pageNo) throws IOException {
        return mixTraceApi.profitDateList(marginCoin,date,pageSize,pageNo).execute().body();
    }

    /**
     * Details of traders to be distributed
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @Override
    public ResponseResult waitProfitDateList(int pageSize, int pageNo) throws IOException {
        return mixTraceApi.waitProfitDateList(pageSize,pageNo).execute().body();
    }

    /**
     * Followers obtain documentary information
     * @param pageSize
     * @param pageNo
     * @param startTime
     * @param endTime
     * @return ResponseResult
     */
    @Override
    public ResponseResult followerHistoryOrders(String pageSize, String pageNo, String startTime, String endTime) throws IOException {
        return mixTraceApi.followerHistoryOrders(pageSize,pageNo,startTime,endTime).execute().body();
    }
}
