package com.bitget.openapi.service;

import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.CloseTrackOrderReq;
import com.bitget.openapi.dto.response.CloseTrackOrderResult;
import com.bitget.openapi.dto.response.ContractTrackOrderResult;
import com.bitget.openapi.dto.response.HistoryTraceResult;

import java.io.IOException;
import java.util.List;


public interface TraceService {

    /**
     * 下单平仓单
     * @param orderReq
     * @return
     * @throws IOException
     */
    JSONObject closeTrackOrder(CloseTrackOrderReq orderReq) throws IOException;

    /**
     *获取交易员当前带单list
     * @param symbol
     * @param pageIndex
     * @param pageSize
     * @return
     */
    JSONObject currentTrack(String symbol, String pageIndex, String pageSize)throws IOException;

    /**
     * 获取历史带单列表
     * @param pageIndex
     * @param pageSize
     * @param createDate
     * @return
     */
    JSONObject historyTrack(String pageIndex, String pageSize, Integer createDate)throws IOException;

}
