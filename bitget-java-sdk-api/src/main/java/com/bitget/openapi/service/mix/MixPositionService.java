package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract position service
 */
public interface MixPositionService {

    /**
     * Obtain single contract position information
     * @param symbol
     * @param marginCoin
     * @return ResponseResult
     */
    ResponseResult singlePosition(String symbol, String marginCoin) throws IOException;

    /**
     * Obtain all contract position information
     * @param productType
     * @param marginCoin
     * @return ResponseResult
     */
    ResponseResult allPosition(String productType, String marginCoin) throws IOException;
}
