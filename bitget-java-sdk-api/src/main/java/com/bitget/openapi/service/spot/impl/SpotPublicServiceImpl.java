package com.bitget.openapi.service.spot.impl;

import com.bitget.openapi.api.spot.SpotPublicApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.service.spot.SpotPublicService;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot public serviceImpl
 */
public class SpotPublicServiceImpl implements SpotPublicService {

    private final SpotPublicApi spotPublicApi;

    public SpotPublicServiceImpl(ApiClient client) {
        spotPublicApi = client.create(SpotPublicApi.class);
    }

    /**
     * Get server time
     * @return ResponseResult
     */
    @Override
    public ResponseResult time() throws IOException {
        return spotPublicApi.time().execute().body();
    }

    /**
     * Basic information of currency
     * @return ResponseResult
     */
    @Override
    public ResponseResult currencies() throws IOException {
        return spotPublicApi.currencies().execute().body();
    }

    /**
     * Get all product information
     * @return ResponseResult
     */
    @Override
    public ResponseResult products() throws IOException{
        return spotPublicApi.products().execute().body();
    }

    /**
     * Get single product information
     * @param symbol
     * @return ResponseResult
     */
    @Override
    public ResponseResult product(String symbol) throws IOException{
        return spotPublicApi.product(symbol).execute().body();
    }

}
