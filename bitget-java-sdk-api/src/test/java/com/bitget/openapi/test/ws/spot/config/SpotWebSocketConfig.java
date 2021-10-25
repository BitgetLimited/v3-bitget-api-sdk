package com.bitget.openapi.test.ws.spot.config;

/**
 * config
 *
 * @author hupf
 * @create 2021-08-17 11:35
 **/
public class SpotWebSocketConfig {

    // bitget coin webSocket url china area:wss://ws.bitgetapi.com/spot/v1/stream,International:wss://ws.bitget.com/spot/v1/stream
    private static final String SERVICE_URL = "wss://ws.bitget.com/spot/v1/stream";
    // api key
    private static final String API_KEY = "";
    // secret key
    private static final String SECRET_KEY = "";
    // passphrase
    private static final String PASSPHRASE = "";


    public static void publicConnect(SpotWebSocketClient spotWebSocketClient) {
        System.out.println(SERVICE_URL);
        spotWebSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(SpotWebSocketClient spotWebSocketClient) {
        System.out.println(SERVICE_URL);
        //与服务器建立连接
        spotWebSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        spotWebSocketClient.login(API_KEY, PASSPHRASE, SECRET_KEY);
    }
}
