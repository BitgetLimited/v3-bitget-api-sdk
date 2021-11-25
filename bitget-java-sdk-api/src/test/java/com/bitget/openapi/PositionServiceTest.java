package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.ChangeHoldModel;
import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.FVirtualCaptialOperator;
import com.bitget.openapi.dto.response.HoldModelDto;
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
        JSONObject result = bitgetRestClient.contract().bitget().position().getAllPosition();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getSinglePosition() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().position().getSinglePosition(symbol);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public  void  virtualCapital()throws  IOException{
        JSONObject capital = bitgetRestClient.contract().bitget().position().virtualCapital("usdt", "14", 10, 398526, null);
        System.out.println(JSON.toJSON(capital));
    }
    @Test
    public  void changeHoldMode()throws  IOException{
        ChangeHoldModel holdModel= ChangeHoldModel.builder().holdModel(1).symbol(symbol).build();
        JSONObject dto = bitgetRestClient.contract().bitget().position().changeHoldMode(holdModel);
        System.out.println(JSON.toJSON(dto));
    }
}
