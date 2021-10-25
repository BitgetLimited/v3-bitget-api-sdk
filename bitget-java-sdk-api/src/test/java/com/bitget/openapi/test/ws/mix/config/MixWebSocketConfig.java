package com.bitget.openapi.test.ws.mix.config;

/**
 * config
 *
 * @author hpf
 * @create 2021-08-30 11:35
 **/
public class MixWebSocketConfig {

    // bitget coin webSocket url
    // test2 ws://test2ws.k8s.itssofast.com/v1/stream
    private static final String SERVICE_URL = "ws://test3ws.k8s.itssofast.com/v1/stream";
    // api key
    private static final String API_KEY = "bg_71abe70ba846d60430fd333ce21aa626";
    // secret key
    private static final String SECRET_KEY = "8d9631d3ea31e3a178de97d2c1d025a9eaa3c11520d139f94a22b7aae69bbbab";
    // passphrase
    private static final String PASSPHRASE = "a1234567";


    public static void publicConnect(MixWebSocketClient spotWebSocketClient) {
        System.out.println(SERVICE_URL);
        spotWebSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(MixWebSocketClient spotWebSocketClient) {
        System.out.println(SERVICE_URL);
        //与服务器建立连接
        spotWebSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        spotWebSocketClient.login(API_KEY, PASSPHRASE, SECRET_KEY);
    }
}
