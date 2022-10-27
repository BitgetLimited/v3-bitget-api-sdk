package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot public service
 */
public interface SpotPublicService {

    /**
     * Get server time
     * @return ResponseResult
     */
    ResponseResult time() throws IOException;

    /**
     * Basic information of currency
     * @return ResponseResult
     */
    ResponseResult currencies() throws IOException;

    /**
     * Get all product information
     * @return ResponseResult
     */
    ResponseResult products() throws IOException;

    /**
     * Get single product information
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult product(String symbol) throws IOException;

}
