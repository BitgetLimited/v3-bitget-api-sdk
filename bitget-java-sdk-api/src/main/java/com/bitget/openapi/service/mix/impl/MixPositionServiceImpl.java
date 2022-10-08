package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixPositionApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixPositionService;
import java.io.IOException;

public class MixPositionServiceImpl implements MixPositionService {

    private final MixPositionApi mixPositionApi;

    public MixPositionServiceImpl(ApiClient client) {
        mixPositionApi = client.create(MixPositionApi.class);
    }

    @Override
    public ResponseResult singlePosition(String symbol, String marginCoin) throws IOException {
        return mixPositionApi.singlePosition(symbol,marginCoin).execute().body();
    }

    @Override
    public ResponseResult allPosition(String productType, String marginCoin) throws IOException {
        return mixPositionApi.allPosition(productType, marginCoin).execute().body();
    }
}
