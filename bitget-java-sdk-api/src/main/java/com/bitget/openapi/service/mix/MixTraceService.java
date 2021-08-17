package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface MixTraceService {

    ResponseResult closeTraceOrder(MixCloseTrackOrderRequest mixCloseTrackOrderRequest) throws IOException;

    ResponseResult currentTrack(String symbol,String productType,int pageSize,int pageNo) throws IOException;

    ResponseResult historyTrack(String startTime,String endTime,int pageSize,int pageNo) throws IOException;

    ResponseResult summary() throws IOException;

    ResponseResult profitSettleTokenIdGroup() throws IOException;

    ResponseResult profitDateGroupList(int pageSize,int pageNo) throws IOException;

    ResponseResult profitDateList(String marginCoin,String date,int pageSize,int pageNo) throws IOException;

    ResponseResult waitProfitDateList(int pageSize,int pageNo) throws IOException;
}
