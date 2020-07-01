package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.dto.request.AdjustMarginReq;
import com.bitget.openapi.dto.request.AutoAppendMarginReq;
import com.bitget.openapi.dto.request.ChangeLeverageReq;
import com.bitget.openapi.dto.request.LedgerReq;
import com.bitget.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class AccountServiceTest extends BaseTest {

        private static final String symbol = "cmt_btcusdt";

        @Test
        public void accounts() throws IOException {
                List<AccountInfo> result = bitgetRestClient.contract().bitget().account().accounts();
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void getAccount() throws IOException {
                AccountInfo result = bitgetRestClient.contract().bitget().account().getAccount(symbol);
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void settings() throws IOException {
                AccountSetting result = bitgetRestClient.contract().bitget().account().settings(symbol);
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void leverage() throws IOException {
                ChangeLeverageReq req = ChangeLeverageReq.builder().leverage(10).side(1).symbol(symbol).build();
                ChangeLeverageResult result = bitgetRestClient.contract().bitget().account().leverage(req);
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void getLedger() throws IOException {
                LedgerReq req = LedgerReq.builder().from("1").to("2").limit("10").startTime("1586502961000")
                                .endTime("1589094961000").build();
                List<LedgerResult> result = bitgetRestClient.contract().bitget().account().getLedger(symbol,
                                req.getFrom(), req.getTo(), req.getLimit(), req.getStartTime(), req.getEndTime());
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void ledgerMargin() throws IOException {
                LedgerReq req = LedgerReq.builder().limit("50").from("1").to("2").endTime("1586502961000")
                                .startTime("1589094961000").build();
                List<LedgerResult> result = bitgetRestClient.contract().bitget().account().ledgerMargin(symbol,
                                req.getFrom(), req.getTo(), req.getLimit(), req.getStartTime(), req.getEndTime());
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void adjustMargin() throws IOException {
                AdjustMarginReq req = AdjustMarginReq.builder().symbol(symbol).amount("100").positionType(0).type(1)
                                .build();
                ResponseResult<AdjustMarginResult> result = bitgetRestClient.contract().bitget().account()
                                .adjustMargin(req);
                System.out.println(JSON.toJSONString(result));
        }

        @Test
        public void modifyAutoAppendMargin() throws IOException {
                AutoAppendMarginReq req = AutoAppendMarginReq.builder().symbol(symbol).append_type(0).side(1).build();
                ResponseResult<AutoAppendMarginResult> result = bitgetRestClient.contract().bitget().account()
                                .modifyAutoAppendMargin(req);
                System.out.println(JSON.toJSONString(result));
        }
}
