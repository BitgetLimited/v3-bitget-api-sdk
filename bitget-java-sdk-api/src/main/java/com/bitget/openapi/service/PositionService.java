package com.bitget.openapi.service;


import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.Holds;

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
     *
     * @return
     * @throws IOException
     */
    AllPosition getSinglePosition(String instrumentId) throws IOException;

    /**
     * 获取合约挂单冻结数量
     *
     * @param instrumentId
     * @return
     */
    Holds getHolds(String instrumentId) throws IOException;
}
