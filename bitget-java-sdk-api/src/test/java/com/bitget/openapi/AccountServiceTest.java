package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.dto.request.AdjustMarginReq;
import com.bitget.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.openapi.dto.request.ChangeLeverageReq;
import com.bitget.openapi.dto.request.LedgerReq;
import com.bitget.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class AccountServiceTest extends BaseTest {

    private static final String symbol = "cmt_btcusdt";
    @Test
    public void accounts()throws IOException{
        List<AccountInfo> result = bitgetRestClient.contract().bitget().account().accounts();
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void  getAccount()throws  IOException{
        AccountInfo result = bitgetRestClient.contract().bitget().account().getAccount(symbol);
      System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void  settings()throws  IOException{
        AccountSetting result = bitgetRestClient.contract().bitget().account().settings(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void leverage()throws IOException{
        ChangeLeverageReq req=ChangeLeverageReq.builder().leverage(10).side(1).build();
        ChangeLeverageResult result = bitgetRestClient.contract().bitget().account().leverage(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getLedger()throws  IOException{
        LedgerReq req=LedgerReq.builder().
                from("1").
                to("2").
                limit("50").startTime("2020-05-30 11:02:36").endTime("2020-06-03 11:02:36").
                build();
        List<LedgerResult> result = bitgetRestClient.contract().bitget().account().getLedger(symbol, req.getFrom(),req.getTo(),req.getLimit(),req.getStartTime(),req.getEndTime());
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void ledgerMargin()throws  IOException{
        LedgerReq req=LedgerReq.builder().
                limit("50").
                from("1").
                to("2").endTime("").startTime("").
                build();
        List<LedgerResult> result = bitgetRestClient.contract().bitget().account().ledgerMargin(symbol, req.getFrom(),req.getTo(),req.getLimit(),req.getStartTime(),req.getEndTime());
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void adjustMargin()throws IOException{
        AdjustMarginReq req=AdjustMarginReq.builder().
                amount("100").
                positionType(1).
                type(1).
                build();
        AdjustMarginResult result = bitgetRestClient.contract().bitget().account().adjustMargin(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void modifyAutoAppendMargin()throws  IOException{
        AutoAppendMarginReq req=AutoAppendMarginReq.builder().
                append_type(0).
                side(1).
                build();
        AutoAppendMarginResult result = bitgetRestClient.contract().bitget().account().modifyAutoAppendMargin(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }
}
