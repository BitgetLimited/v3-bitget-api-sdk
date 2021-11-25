package com.bitget.openapi.ws;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.ws.SubscribeReq;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class BitgetWsClientTest {

    public static final String PUSH_URL = "wss://ws.bitget.com/mix/v1/stream";

    public static final String API_KEY = "";
    public static final String SECRET_KEY = "";
    public static final String PASS_PHRASE = "";


    public static void main(String[] args) {
        BitgetWsClient client = BitgetWsHandle.builder()
                                .pushUrl(PUSH_URL)
                                .apiKey(API_KEY)
                                .secretKey(SECRET_KEY)
                                .passPhrase(PASS_PHRASE)
                                .isLogin(true)
                                //默认监听处理，如订阅时指定监听，默认不再接收该channel订阅信息
                                .listener(response -> {
                                    JSONObject json = JSONObject.parseObject(response);
                                    System.out.println("def:" + json);
                                //失败消息的逻辑处理,如:订阅失败
                                }).errorListener(response -> {
                                    JSONObject json = JSONObject.parseObject(response);
                                    System.out.println("error:" + json);
                                }).build();


        List<SubscribeReq> list = new ArrayList<SubscribeReq>() {{
            add(SubscribeReq.builder().instType("mc").channel("ticker").instId("BTCUSD").build());
            add(SubscribeReq.builder().instType("SP").channel("candle1W").instId("BTCUSDT").build());
        }};
        client.subscribe(list);

        List<SubscribeReq> list2 = new ArrayList<SubscribeReq>() {{

            add(SubscribeReq.builder().instType("UMCBL").channel("account").instId("default").build());
        }};
        client.subscribe(list2, response -> {
            JSONObject json = JSONObject.parseObject(response);
            System.out.println("appoint:" + json);
        });
    }

}
