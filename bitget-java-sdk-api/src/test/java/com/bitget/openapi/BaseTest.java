package com.bitget.openapi;

import com.bitget.openapi.common.client.BitgetRestClient;
import com.bitget.openapi.common.domain.ClientParameter;
import com.bitget.openapi.common.enums.SupportedLocaleEnum;
import org.junit.After;
import org.junit.Before;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class BaseTest {

    /**
     * 用户 apiKey
     */
    private final String apiKey = "bg_bbe24d57657d45de54210905888024e2";
    /**
     * 用户 secretKey
     */
    private final String secretKey = "61629c51d4b5f127ace628fba9feb41a3272fee468d28deea35a23e121b37188";
    /**
     * 口令
     */
    private final String passphrase = "11111111";
    /**
     * bitget open api 根路径
     */
// private final String baseUrl = "http://127.0.0.1:8081";
    private final String baseUrl = "http://192.168.33.2:27832";
    private final ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey)
            .passphrase(passphrase)
            .baseUrl(baseUrl)
            .locale(SupportedLocaleEnum.ZH_CN.getName())
            .build();
    BitgetRestClient bitgetRestClient;

    @Before
    public void setup() {
        bitgetRestClient = BitgetRestClient.builder().configuration(parameter).build();
    }

    @After
    public void tearDown() {

    }
}
