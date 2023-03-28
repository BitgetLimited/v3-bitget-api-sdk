package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderReq;
import com.bitget.openapi.dto.request.mix.MixTraceModifyTPSLOrderReq;
import com.bitget.openapi.dto.request.mix.MixTraceSetCopyTradeSymbolReq;
import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;


/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: mix trace service
 */
public interface MixTraceService {

    /**
     * Dealer closing interface
     * @param mixCloseTrackOrderReq
     * @return ResponseResult
     */
    ResponseResult closeTraceOrder(MixCloseTrackOrderReq mixCloseTrackOrderReq) throws IOException;

    /**
     * The trader obtains the current order
     * @param symbol
     * @param productType
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    ResponseResult currentTrack(String symbol,String productType,int pageSize,int pageNo) throws IOException;

    /**
     * The trader obtains the historical order
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    ResponseResult historyTrack(String startTime,String endTime,int pageSize,int pageNo) throws IOException;

    /**
     * Summary of traders' profit sharing
     * @return ResponseResult
     */
    ResponseResult summary() throws IOException;

    /**
     * Historical profit sharing summary of traders (by settlement currency)
     * @return ResponseResult
     */
    ResponseResult profitSettleTokenIdGroup() throws IOException;

    /**
     * Historical profit sharing summary of traders (by settlement currency and date)
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    ResponseResult profitDateGroupList(int pageSize,int pageNo) throws IOException;

    /**
     * Historical profit distribution details of traders
     * @param marginCoin
     * @param date
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    ResponseResult profitDateList(String marginCoin,String date,int pageSize,int pageNo) throws IOException;

    /**
     * Details of traders to be distributed
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    ResponseResult waitProfitDateList(int pageSize,int pageNo) throws IOException;

    /**
     * Followers obtain documentary information
     * @param pageSize
     * @param pageNo
     * @param startTime
     * @param endTime
     * @return ResponseResult
     */
    ResponseResult followerHistoryOrders(String pageSize,String pageNo,String startTime,String endTime) throws IOException;

    /**
     * Get Follower Open Orders
     * @param symbol
     * @param productType
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    ResponseResult followerOrder(String symbol,String productType,int pageSize,int pageNo) throws IOException;

    /**
     * trader get copytrade symbol
     * @return ResponseResult
     */
    ResponseResult traderSymbols() throws IOException;

    /**
     * trader set copytrade symbol
     * @return ResponseResult
     */
    ResponseResult setUpCopySymbols(MixTraceSetCopyTradeSymbolReq mixTraceSetCopyTradeSymbol) throws IOException;

    /**
     * trader modify tpsl order
     * @return ResponseResult
     */
    ResponseResult modifyTPSL(MixTraceModifyTPSLOrderReq mixTraceModifyTPSLOrderReq) throws IOException;

}
