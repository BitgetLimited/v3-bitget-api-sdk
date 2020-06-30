package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.FVirtualCaptialOperator;
import com.bitget.openapi.dto.response.Holds;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class PositionServiceTest extends BaseTest {
    private static final String symbol = "cmt_btcusdt";

    @Test
    public void getAllPosition() throws IOException {
        List<AllPosition> result = bitgetRestClient.contract().bitget().position().getAllPosition();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getSinglePosition() throws IOException {
        AllPosition result = bitgetRestClient.contract().bitget().position().getSinglePosition(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getHolds() throws IOException {
        Holds result = bitgetRestClient.contract().bitget().position().getHolds(symbol);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public  void  virtualCapital()throws  IOException{
        List<FVirtualCaptialOperator> capital = bitgetRestClient.contract().bitget().position().virtualCapital(symbol, "1,2", 10, 398526, null);
        System.out.println(JSON.toJSON(capital));
    }
}
