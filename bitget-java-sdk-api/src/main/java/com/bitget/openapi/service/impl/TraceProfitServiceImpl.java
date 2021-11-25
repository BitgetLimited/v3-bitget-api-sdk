package com.bitget.openapi.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.api.TraceProfitApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.*;
import com.bitget.openapi.service.TraceProfitService;

import java.io.IOException;
import java.util.List;

/**
 * @author fengqiyuan
 * @date 2021/3/18 2:52 PM
 */
public class TraceProfitServiceImpl implements TraceProfitService {

    private final TraceProfitApi traceProfitApi;

    public TraceProfitServiceImpl(ApiClient apiClient) {
        this.traceProfitApi = apiClient.create(TraceProfitApi.class);
    }

    @Override
    public JSONObject totalProfitInfo() throws IOException {
        return traceProfitApi.totalProfitInfo().execute().body();
    }

    @Override
    public JSONObject profitHisList(Integer pageNo, Integer pageSize) throws IOException {
        return traceProfitApi.profitHisList(pageNo, pageSize).execute().body();
    }

    @Override
    public JSONObject profitHisDetail(String symbol, Integer pageNo, Integer pageSize, Long date) throws IOException {
        return traceProfitApi.profitHisDetail(symbol, pageNo, pageSize, date).execute().body();
    }

    @Override
    public JSONObject waitProfitDetail(Integer pageNo, Integer pageSize) throws IOException {
        return traceProfitApi.waitProfitDetail(pageNo, pageSize).execute().body();
    }

    @Override
    public JSONObject getSumProfitList() throws IOException {
        return traceProfitApi.getSumProfitList().execute().body();
    }
}
