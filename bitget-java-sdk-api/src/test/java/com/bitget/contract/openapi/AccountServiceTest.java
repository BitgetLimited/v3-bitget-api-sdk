package com.bitget.contract.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.contract.openapi.dto.request.AdjustMarginReq;
import com.bitget.contract.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.contract.openapi.dto.request.ChangeLeverageReq;
import com.bitget.contract.openapi.dto.request.LedgerReq;
import com.bitget.contract.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class AccountServiceTest extends BaseTest {

    private static final String instrumentId = "cmt_btcusdt";
    @Test
    public void accounts()throws IOException{
        List<AccountInfo> result = bitgetRestClient.contract().bitget().account().accounts();
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void  getAccount()throws  IOException{
        AccountInfo result = bitgetRestClient.contract().bitget().account().getAccount(instrumentId);
      System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void  settings()throws  IOException{
        AccountSetting result = bitgetRestClient.contract().bitget().account().settings(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void leverage()throws IOException{
        ChangeLeverageReq req=ChangeLeverageReq.builder().leverage(10).side(1).build();
        ChangeLeverageResult result = bitgetRestClient.contract().bitget().account().leverage(instrumentId, req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getLedger()throws  IOException{
        LedgerReq req=LedgerReq.builder().
                from("1").
                to("2").
                limit("50").
                build();
        List<LedgerResult> result = bitgetRestClient.contract().bitget().account().getLedger(instrumentId, req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void ledgerMargin()throws  IOException{
        LedgerReq req=LedgerReq.builder().
                limit("50").
                from("1").
                to("2").
                build();
        List<LedgerResult> result = bitgetRestClient.contract().bitget().account().ledgerMargin(instrumentId, req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void adjustMargin()throws IOException{
        AdjustMarginReq req=AdjustMarginReq.builder().
                amount("100").
                positionType(1).
                type(1).
                build();
        AdjustMarginResult result = bitgetRestClient.contract().bitget().account().adjustMargin(instrumentId, req);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void modifyAutoAppendMargin()throws  IOException{
        AutoAppendMarginReq req=AutoAppendMarginReq.builder().
                append_type(0).
                side(1).
                build();
        AutoAppendMarginResult result = bitgetRestClient.contract().bitget().account().modifyAutoAppendMargin(instrumentId, req);
        System.out.println(JSON.toJSONString(result));
    }
}
