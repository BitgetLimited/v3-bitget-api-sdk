package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot account service
 */
public interface SpotAccountService {

    /**
     * Obtain account assets
     * @return ResponseResult
     */
    ResponseResult assets(String coin) throws IOException;

    /**
     * Get the bill flow
     * @param spotBillQueryReq
     * @return ResponseResult
     */
    ResponseResult bills(SpotBillQueryReq spotBillQueryReq) throws IOException;

    /**
     * Obtain transfer records
     * @param coinId
     * @param fromType
     * @param limit
     * @param after
     * @param before
     * @return ResponseResult
     */
    ResponseResult transferRecords(String coinId,String fromType,String limit,String after,String before) throws IOException;
}
