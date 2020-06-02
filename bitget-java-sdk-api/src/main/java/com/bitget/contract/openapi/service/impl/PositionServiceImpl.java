package com.bitget.contract.openapi.service.impl;


import com.bitget.contract.openapi.api.PositionApi;
import com.bitget.contract.openapi.common.client.ApiClient;
import com.bitget.contract.openapi.dto.response.AllPosition;
import com.bitget.contract.openapi.dto.response.Holds;
import com.bitget.contract.openapi.service.PositionService;
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
    public AllPosition getSinglePosition(String instrumentId) throws IOException {
        Call<AllPosition> call = positionApi.getSinglePosition(instrumentId);
        return call.execute().body();
    }

    @Override
    public Holds getHolds(String instrumentId) throws IOException {
        Call<Holds> call = positionApi.getHolds(instrumentId);
        return call.execute().body();
    }
}
