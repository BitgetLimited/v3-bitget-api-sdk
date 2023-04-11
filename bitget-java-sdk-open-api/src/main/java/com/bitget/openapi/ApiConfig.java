package com.bitget.openapi;

import com.bitget.openapi.auth.ApiKeyAuth;

public class ApiConfig {
    public static String BASE_PATH = "https://api.bitget.com";
    public static String SECRET_KEY = "your value";
    public static String API_KEY = "your value";
    public static String PASSPHRASE = "your value";

    public static ApiClient getConfig() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(ApiConfig.BASE_PATH);

        ApiKeyAuth SECRET_KEY = (ApiKeyAuth) defaultClient.getAuthentication("SECRET_KEY");
        SECRET_KEY.setApiKey(ApiConfig.SECRET_KEY);

        ApiKeyAuth ACCESS_KEY = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_KEY");
        ACCESS_KEY.setApiKey(ApiConfig.API_KEY);

        ApiKeyAuth ACCESS_PASSPHRASE = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_PASSPHRASE");
        ACCESS_PASSPHRASE.setApiKey(ApiConfig.PASSPHRASE);

        return defaultClient;
    }
}
