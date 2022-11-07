package com.bitget.openapi.broker;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.broker.BrokerSubCreateReq;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;

import java.io.IOException;

public class BrokerAccountTest extends BaseTest {


    //passed
    @Test
    public void info() throws IOException {
        ResponseResult result = bitgetRestClient.broker().bitget().account().info();
        System.out.println(JSON.toJSONString(result));
    }


    //passed
    @Test
    public void subCreate() throws IOException {
        BrokerSubCreateReq build = BrokerSubCreateReq.builder()
                .build();
        ResponseResult result = bitgetRestClient.broker().bitget().account().subCreate(build);
        System.out.println(JSON.toJSONString(result));
    }
}
