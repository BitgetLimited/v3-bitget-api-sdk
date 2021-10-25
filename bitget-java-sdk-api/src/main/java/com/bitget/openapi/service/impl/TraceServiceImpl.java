package com.bitget.openapi.service.impl;

import com.bitget.openapi.api.TraceApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.CloseTrackOrderReq;
import com.bitget.openapi.dto.response.CloseTrackOrderResult;
import com.bitget.openapi.dto.response.ContractTrackOrderResult;
import com.bitget.openapi.dto.response.HistoryTraceResult;
import com.bitget.openapi.service.TraceService;

import java.io.IOException;
import java.util.List;

public class TraceServiceImpl  implements TraceService {

    private final TraceApi traceApi;
    public TraceServiceImpl(ApiClient client) {
        traceApi = client.create(TraceApi.class);
    }

    @Override
    public CloseTrackOrderResult closeTrackOrder(CloseTrackOrderReq orderReq) throws IOException {
        return traceApi.closeTrackOrder(orderReq).execute().body();
    }

    @Override
    public List<ContractTrackOrderResult> currentTrack(String symbol, String pageIndex, String pageSize)throws IOException {
        return traceApi.currentTrack(symbol,pageIndex,pageSize).execute().body();
    }

    @Override
    public List<HistoryTraceResult> historyTrack(String pageIndex, String pageSize, Integer createDate) throws IOException{
        return traceApi.historyTrack(pageIndex,pageSize,createDate).execute().body();
    }
}
