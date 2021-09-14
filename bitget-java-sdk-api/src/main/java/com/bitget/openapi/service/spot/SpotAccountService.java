package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.request.spot.SpotTransferRecordReq;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

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

    ResponseResult transferRecords(SpotTransferRecordReq spotTransferRecordReq) throws IOException;
}
