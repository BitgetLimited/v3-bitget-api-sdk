package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderReq;
import com.bitget.openapi.dto.request.mix.MixTraceModifyTPSLOrderReq;
import com.bitget.openapi.dto.request.mix.MixTraceSetCopyTradeSymbolReq;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.enums.mix.MixProductTypeEnum;
import org.junit.Test;
import java.io.IOException;

public class MixTraceServiceTest extends BaseTest {

    static String symbol = "BTCUSDT_UMCBL";
    static long trackingNo = 0L;
    static int pageSize = 10;
    static int pageNo = 1;
    static String date = "";
    static String startTime = "";
    static String endTime = "";

    //passed
    @Test
    public void closeTraceOrder() throws IOException {
        MixCloseTrackOrderReq build = MixCloseTrackOrderReq.builder()
                .symbol(symbol)
                .trackingNo(trackingNo)
                .build();

        ResponseResult result = bitgetRestClient.mix().bitget().trace().closeTraceOrder(build);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void currentTrack() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().currentTrack(symbol, MixProductTypeEnum.UMCBL.getCode(),pageSize,pageNo);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void historyTrack() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().historyTrack(startTime,endTime,pageSize,pageNo);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void summary() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().summary();
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void profitSettleTokenIdGroup() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().profitSettleTokenIdGroup();
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void profitDateGroupList() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().profitDateGroupList(pageSize,pageNo);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void profitDateList() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().profitDateList(symbol,date,pageSize,pageNo);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void waitProfitDateList() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().waitProfitDateList(pageSize,pageNo);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void followerHistoryOrders() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().followerHistoryOrders("10","1","1635782400000","1635852263953");
        System.out.println(JSON.toJSONString(result));
    }
    //passed
    @Test
    public void followerOrder() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().followerOrder(symbol,"umcbl",pageSize,pageNo);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void traderSymbols() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().trace().traderSymbols();
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void setUpCopySymbols() throws IOException {
        MixTraceSetCopyTradeSymbolReq mixTraceSetCopyTradeSymbolReq = new MixTraceSetCopyTradeSymbolReq();
        mixTraceSetCopyTradeSymbolReq.setSymbol(symbol);
        ResponseResult result = bitgetRestClient.mix().bitget().trace().setUpCopySymbols(mixTraceSetCopyTradeSymbolReq);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void modifyTPSL() throws IOException {
        MixTraceModifyTPSLOrderReq mixTraceModifyTPSLOrderReq = new MixTraceModifyTPSLOrderReq();
        mixTraceModifyTPSLOrderReq.setSymbol(symbol);
        mixTraceModifyTPSLOrderReq.setTrackingNo(804641389214179330L);
        ResponseResult result = bitgetRestClient.mix().bitget().trace().modifyTPSL(mixTraceModifyTPSLOrderReq);
        System.out.println(JSON.toJSONString(result));
    }
}
