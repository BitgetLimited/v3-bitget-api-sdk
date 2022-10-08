package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.common.enums.mix.MixProductTypeEnum;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class MixMarketServiceTest extends BaseTest {

    static String symbol = "BTCUSDT_UMCBL";

    static Integer limit = 50;

    static String startTime = "1629177891000";

    static String endTime = "1629181491000";

    static String granularity = "60";

    // 测试通过
    @Test
    public void contracts() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().contracts(MixProductTypeEnum.SDMCBL.getCode());
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void depth() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().depth(symbol,limit);
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void ticker() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().ticker(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void tickers() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().tickers(MixProductTypeEnum.UMCBL.getCode());
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void fills() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().fills(symbol,limit);
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void candles() throws IOException {
        List<Object[]> result =  bitgetRestClient.mix().bitget().market().candles(symbol,granularity,startTime,endTime);
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void index() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().index(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    // 测试通过
    @Test
    public void fundingTime() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().fundingTime(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    //passed
    @Test
    public void historyFundRate() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().historyFundRate(symbol, 20,1,false);
        System.out.println(JSON.toJSONString(result));
    }

    // 测试通过
    @Test
    public void currentFundRate() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().currentFundRate(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    // 测试通过
    @Test
    public void openInterest() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().openInterest(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    // 测试通过
    @Test
    public void markPrice() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().market().markPrice(symbol);
        System.out.println(JSON.toJSONString(result));
    }



}
