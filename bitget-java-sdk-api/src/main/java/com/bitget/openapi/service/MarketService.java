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
     * @param symbol
     * @param size
     * @return
     * @throws IOException
     */
    Depth getDepthApi(String symbol, String size) throws IOException;

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
     * @param symbol
     * @return
     * @throws IOException
     */
    Ticker getTicker(String symbol) throws IOException;

    /**
     * 获取成交数据
     *
     * @param symbol
     * @param limit
     * @return
     * @throws IOException
     */
    List<Trades> getTrades(String symbol, String limit) throws IOException;

    /**
     * 获取K线数据
     *
     * @param symbol
     * @param start
     * @param end
     * @param granularity
     * @return
     */
    List<Object[]> getCandles(String symbol, String start, String end, String granularity) throws IOException;

    /**
     * 获取指数信息
     *
     * @param symbol
     * @return
     */
    Index getIndex(String symbol) throws IOException;

    /**
     * 获取平台总持仓量
     *
     * @param symbol
     * @return
     */
    OpenInterest getOpenInterestApi(String symbol) throws IOException;

    /**
     * 获取合约最高限价和最低限价
     *
     * @param symbol
     * @return
     */
    PriceLimit getPriceLimitApi(String symbol) throws IOException;

    /**
     * 获取合约下一次结算时间
     *
     * @param symbol
     * @return
     * @throws IOException
     */
    FundingTime getFundingTimeApi(String symbol) throws IOException;
    /**
     * 获取合约历史资金费率-----新的接口
     * @param symbol
     * @param pageIndex
     * @param pageSize
     * @return
     * @throws IOException
     */
    List<HistoricalFundingRate>getNewHistoricalFundingRateApi(String symbol, String pageIndex, String pageSize) throws IOException;

    /**
     * 获取合约标记价格
     *
     * @param symbol
     * @return
     */
    MarkPrice getMarkPriceApi(String symbol) throws IOException;

    /**
     * 可开张数
     *
     * @param symbol 合约code
     * @param amount       用于开仓的总的金额
     * @param leverage     杠杆，默认以20计算
     * @param openPrice    开仓价格
     * @return
     */
    String calOpenCount(String symbol, String amount, String leverage, String openPrice) throws IOException;
}
