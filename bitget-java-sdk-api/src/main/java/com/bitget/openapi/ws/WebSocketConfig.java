package com.bitget.openapi.ws;

public class WebSocketConfig {

    private static final String SERVICE_URL = "wss://csocketapi.bitgetapi.com/ws/v1";
    private static final String API_KEY = "xxxxx";
    private static final String SECRET_KEY = "xxxx";
    private static final String PASSPHRASE = "xxxx";


    public static void publicConnect(WebSocketClient webSocketClient) {
        System.out.println(SERVICE_URL);
        WebSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(WebSocketClient webSocketClient) {
        System.out.println(SERVICE_URL);
        //与服务器建立连接
        WebSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        WebSocketClient.login(API_KEY, PASSPHRASE, SECRET_KEY);
    }
}
