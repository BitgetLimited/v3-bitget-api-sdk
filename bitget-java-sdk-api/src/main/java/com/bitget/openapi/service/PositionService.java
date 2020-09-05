package com.bitget.openapi.service;


import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.FVirtualCaptialOperator;
import com.bitget.openapi.dto.response.Holds;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;

/**
 * 持仓服务
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface PositionService {
    /**
     *获取全部合约仓位信息
     * @return
     * @throws IOException
     */
    List<AllPosition> getAllPosition() throws IOException;

    /**
     * 获取全部合约仓位信息
     * @param symbol
     * @return
     * @throws IOException
     */
    AllPosition getSinglePosition(String symbol) throws IOException;

    /**
     * 出入金数据记录
     * @return
     * @throws IOException
     */
    List<FVirtualCaptialOperator>  virtualCapital(String  symbol,
                                                  String ftype,
                                                  Integer limit,
                                                  Integer gt,
                                                  Integer lt)throws  IOException;
}
