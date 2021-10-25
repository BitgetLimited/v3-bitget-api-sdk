package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.spot.SpotAssetsResult;

import java.io.IOException;
import java.util.List;

/**
 * @Author: bitget
 * @Date: 2021-05-31 11:12
 * @DES:
 */
public interface SpotAccountService {

    /**
     * 查询币币资产
     *
     * @return
     * @throws IOException
     */
    ResponseResult assets() throws IOException;

    ResponseResult bills(SpotBillQueryReq spotBillQueryReq) throws IOException;

    ResponseResult transferRecords(String coinId,String fromType,String limit,String after,String before) throws IOException;
}
