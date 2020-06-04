/*************************************************************************
 * Copyright (C) 2016-2030 UPEX Technologies, Inc. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *************************************************************************/
package com.bitget.openapi.service;

import com.bitget.openapi.dto.response.*;

import java.io.IOException;
import java.util.List;

/**
 * market服务
 *
 * @author jian.li
 * @create 2020-05-26 19:10
 */
public interface MarketService {

    /**
     * 获取服务器时间
     *
     * @return
     * @throws IOException
     */
    ServerTime getTime() throws IOException;

    /**
     * 获取全部ticker信息
     *
     * @return
     * @throws IOException
     */
    List<ContractInfo> getContractsApi() throws IOException;


    /**
     * 获取合约的深度列表
     *
     * @param instrumentId
     * @param size
     * @return
     * @throws IOException
     */
    Depth getDepthApi(String instrumentId, String size) throws IOException;

    /**
     * 获取全部ticker信息
     *
     * @return
     * @throws IOException
     */
    List<Ticker> getTickersApi() throws IOException;

    /**
     * 获取某个ticker信息
     *
     * @param instrumentId
     * @return
     * @throws IOException
     */
    Ticker getInstrumentTicker(String instrumentId) throws IOException;

    /**
     * 获取成交数据
     *
     * @param instrumentId
     * @param limit
     * @return
     * @throws IOException
     */
    List<Trades> getInstrumentTrades(String instrumentId, String limit) throws IOException;

    /**
     * 获取K线数据
     *
     * @param instrumentId
     * @param start
     * @param end
     * @param granularity
     * @return
     */
    List<Object[]> getInstrumentCandles(String instrumentId, String start, String end, String granularity) throws IOException;

    /**
     * 获取指数信息
     *
     * @param instrumentId
     * @return
     */
    Index getInstrumentIndex(String instrumentId) throws IOException;

    /**
     * 获取平台总持仓量
     *
     * @param instrumentId
     * @return
     */
    OpenInterest getOpenInterestApi(String instrumentId) throws IOException;

    /**
     * 获取合约最高限价和最低限价
     *
     * @param instrumentId
     * @return
     */
    PriceLimit getPriceLimitApi(String instrumentId) throws IOException;

    /**
     * 获取合约下一次结算时间
     *
     * @param instrumentId
     * @return
     * @throws IOException
     */
    FundingTime getFundingTimeApi(String instrumentId) throws IOException;

    /**
     * 获取合约历史资金费率
     *
     * @param instrumentId
     * @return
     */
    HistoricalFundingRate getHistoricalFundingRateApi(String instrumentId,String from,String to,String limit) throws IOException;

    /**
     * 获取合约标记价格
     *
     * @param instrumentId
     * @return
     */
    MarkPrice getMarkPriceApi(String instrumentId) throws IOException;

    /**
     * 可开张数
     *
     * @param instrumentId 合约code
     * @param amount       用于开仓的总的金额
     * @param leverage     杠杆，默认以20计算
     * @param openPrice    开仓价格
     * @return
     */
    String calOpenCount(String instrumentId, String amount, String leverage, String openPrice) throws IOException;
}
