package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TraceProfitServiceTest extends BaseTest{


    private static final String symbol = "USDT";

    /**
     * 累计已分润、预计待分润、昨日分润
     * @return
     */
    @Test
    public void totalProfitInfo() throws IOException {
        TotalProfitInfoResult result = bitgetRestClient.contract().bitget().traceProfit().totalProfitInfo();
        System.out.println(JSON.toJSONString(result));
    }

    /**
     * 历史分润
     *
     * @return
     */
    @Test
    public void profitHisList() throws IOException {
        PageResult<ProfitDateGroupResponseResult> result = bitgetRestClient.contract().bitget().traceProfit().profitHisList(1, 10);
        System.out.println(JSON.toJSONString(result));
    }

    /**
     * 历史分润明细
     *
     * @return
     */
    @Test
    public void profitHisDetail() throws IOException{
        PageResult<ProfitDateDetailResponseResult> result = bitgetRestClient.contract().bitget().traceProfit().profitHisDetail(symbol, 1, 10, 1614147600000L);
        System.out.println(JSON.toJSONString(result));
    }
    /**
     * 待分润明细列表
     *
     * @return
     */
    @Test
    public void waitProfitDetail() throws IOException {
        PageResult<ProfitDateDetailResponseResult> result = bitgetRestClient.contract().bitget().traceProfit().waitProfitDetail(1, 10);
        System.out.println(JSON.toJSONString(result));
    }

    /**
     * 累积已分润列表
     *
     * @return
     */
    @Test
    public void getSumProfitList() throws IOException {
        List<ProfitSymbolGroupResult> result = bitgetRestClient.contract().bitget().traceProfit().getSumProfitList();
        System.out.println(JSON.toJSONString(result));
    }
}
