package com.bitget.openapi.service.mix.impl;

import com.bitget.openapi.api.mix.MixPositionApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.mix.MixPositionService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract position serviceImpl
 */
public class MixPositionServiceImpl implements MixPositionService {

    private final MixPositionApi mixPositionApi;

    public MixPositionServiceImpl(ApiClient client) {
        mixPositionApi = client.create(MixPositionApi.class);
    }

    /**
     * Obtain single contract position information
     * @param symbol
     * @param marginCoin
     * @return ResponseResult
     */
    @Override
    public ResponseResult singlePosition(String symbol, String marginCoin) throws IOException {
        return mixPositionApi.singlePosition(symbol,marginCoin).execute().body();
    }

    /**
     * Obtain all contract position information
     * @param productType
     * @param marginCoin
     * @return ResponseResult
     */
    @Override
    public ResponseResult allPosition(String productType, String marginCoin) throws IOException {
        return mixPositionApi.allPosition(productType, marginCoin).execute().body();
    }
}
