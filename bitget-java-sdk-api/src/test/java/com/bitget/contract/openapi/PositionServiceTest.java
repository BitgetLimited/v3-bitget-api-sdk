package com.bitget.contract.openapi;

import com.alibaba.fastjson.JSON;
import com.bitget.contract.openapi.dto.response.AllPosition;
import com.bitget.contract.openapi.dto.response.Holds;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class PositionServiceTest extends BaseTest {
    private static final String instrumentId = "cmt_btcusdt";

    @Test
    public void getAllPosition() throws IOException {
        List<AllPosition> result = bitgetRestClient.contract().bitget().position().getAllPosition();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getSinglePosition() throws IOException {
        AllPosition result = bitgetRestClient.contract().bitget().position().getSinglePosition(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getHolds() throws IOException {
        Holds result = bitgetRestClient.contract().bitget().position().getHolds(instrumentId);
        System.out.println(JSON.toJSONString(result));
    }

}
