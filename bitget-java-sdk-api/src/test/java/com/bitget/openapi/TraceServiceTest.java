package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.CloseTrackOrderReq;
import com.bitget.openapi.dto.response.CloseTrackOrderResult;
import com.bitget.openapi.dto.response.ContractTrackOrderResult;
import com.bitget.openapi.dto.response.HistoryTraceResult;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TraceServiceTest  extends BaseTest{


    private static final String symbol = "cmt_btcusdt";

    @Test
    public void closeTrackOrder()throws IOException{
        CloseTrackOrderReq req=CloseTrackOrderReq.builder().symbol(symbol).trackingNo(666479626381428332L).build();
        JSONObject result = bitgetRestClient.contract().bitget().trace().closeTrackOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void currentTrack() throws  IOException{
        JSONObject result = bitgetRestClient.contract().bitget().trace().currentTrack(symbol, "1", "100");
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void historyTrack() throws  IOException{
        JSONObject result = bitgetRestClient.contract().bitget().trace().historyTrack("1", "100", 70);
        System.out.println(JSON.toJSONString(result));
    }
}
