package com.bitget.openapi.ws;

public class WebSocketConfig {

    private static final String SERVICE_URL = "wss://csocketapi.bitgetapi.com/ws/v1";
    private static final String API_KEY = "bg_6ec7289f2a360e415ac096ec5ce9acda";
    private static final String SECRET_KEY = "bd96960ed310adb3ab6d51ad6c2b5f35fe571f4a6e6a707e5f77cd29830e0435";
    private static final String PASSPHRASE = "1r1b6uX6PQ9tbKwb";


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
