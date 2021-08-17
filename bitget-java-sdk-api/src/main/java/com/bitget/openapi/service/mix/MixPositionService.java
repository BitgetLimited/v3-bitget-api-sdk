package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface MixPositionService {

    ResponseResult singlePosition(String symbol, String marginCoin) throws IOException;

    ResponseResult allPosition(String productType, String marginCoin) throws IOException;
}
