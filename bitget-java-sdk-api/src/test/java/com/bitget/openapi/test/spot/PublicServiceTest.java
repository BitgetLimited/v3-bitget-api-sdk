package com.bitget.openapi.test.spot;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.response.ResponseResult;
import org.junit.Test;

import java.io.IOException;

public class PublicServiceTest extends BaseTest {


    @Test
    public void time() throws IOException {
        ResponseResult time = bitgetRestClient.spot().bitget().common().time();
        System.out.println(JSON.toJSONString(time));
    }

    @Test
    public void currencies() throws IOException {
        ResponseResult currencies = bitgetRestClient.spot().bitget().common().currencies();
        System.out.println(JSON.toJSONString(currencies));
    }

    @Test
    public void products() throws IOException {
        ResponseResult products = bitgetRestClient.spot().bitget().common().products();
        System.out.println(JSON.toJSONString(products));
    }

    @Test
    public void product() throws IOException {
        ResponseResult productSingle = bitgetRestClient.spot().bitget().common().product("ETHUSDT_SPBL");
        System.out.println(JSON.toJSONString(productSingle));
    }

}
