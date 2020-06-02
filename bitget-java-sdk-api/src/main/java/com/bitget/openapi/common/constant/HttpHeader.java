package com.bitget.openapi.common.constant;

public class HttpHeader {
    /**
     * baseUrl must end in /
     */
    public static final String BASE_URL = "https://capi.bitget.com/api/swap/v3/";
    /**
     * http request timeout
     */
    public static final Long TIME_OUT = 30L;


    /**
     * header parameter
     */
    public static final String ACCESS_SIGN = "ACCESS-SIGN";
    public static final String ACCESS_TIMESTAMP = "ACCESS-TIMESTAMP";
    public static final String ACCESS_KEY = "ACCESS-KEY";
    public static final String ACCESS_PASSPHRASE = "ACCESS-PASSPHRASE";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String BG_BEFORE = "BG_BEFORE";
    public static final String BG_AFTER = "BG_AFTER";
    public static final String X_LOCALE = "x-locale";
    public static final String COOKIE = "Cookie";
}
