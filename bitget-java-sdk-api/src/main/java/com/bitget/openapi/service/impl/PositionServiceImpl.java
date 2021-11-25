package com.bitget.openapi.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.api.PositionApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.request.ChangeHoldModel;
import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.FVirtualCaptialOperator;
import com.bitget.openapi.dto.response.HoldModelDto;
import com.bitget.openapi.dto.response.Holds;
import com.bitget.openapi.service.PositionService;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class PositionServiceImpl implements PositionService {

    private final PositionApi positionApi;

    public PositionServiceImpl(ApiClient client) {
        positionApi = client.create(PositionApi.class);
    }

    @Override
    public JSONObject getAllPosition() throws IOException {
        Call<JSONObject> call = positionApi.getAllPosition();
        return call.execute().body();
    }

    @Override
    public JSONObject getSinglePosition(String symbol) throws IOException {
        Call<JSONObject> call = positionApi.getSinglePosition(symbol);
        return call.execute().body();
    }

    @Override
    public JSONObject virtualCapital(String symbol, String ftype, Integer limit, Integer gt, Integer lt) throws IOException {
        Call<JSONObject> call= positionApi.virtualCapital(symbol, ftype, limit, gt, lt);
        return call.execute().body();
    }

    @Override
    public JSONObject changeHoldMode(ChangeHoldModel holdModel)  throws IOException{
        Call<JSONObject> call = positionApi.changeHoldMode(holdModel);
        return call.execute().body();
    }
}
