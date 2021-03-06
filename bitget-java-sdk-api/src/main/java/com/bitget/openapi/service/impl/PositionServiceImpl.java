package com.bitget.openapi.service.impl;


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
    public List<AllPosition> getAllPosition() throws IOException {
        Call<List<AllPosition>> call = positionApi.getAllPosition();
        return call.execute().body();
    }

    @Override
    public AllPosition getSinglePosition(String symbol) throws IOException {
        Call<AllPosition> call = positionApi.getSinglePosition(symbol);
        return call.execute().body();
    }

    @Override
    public List<FVirtualCaptialOperator> virtualCapital(String symbol, String ftype, Integer limit, Integer gt, Integer lt) throws IOException {
        Call<List<FVirtualCaptialOperator>> call= positionApi.virtualCapital(symbol, ftype, limit, gt, lt);
        return call.execute().body();
    }

    @Override
    public HoldModelDto changeHoldMode(ChangeHoldModel holdModel)  throws IOException{
        Call<HoldModelDto> call = positionApi.changeHoldMode(holdModel);
        return call.execute().body();
    }
}
