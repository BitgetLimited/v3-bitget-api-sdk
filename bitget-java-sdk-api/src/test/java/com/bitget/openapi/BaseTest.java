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
    private final String apiKey = "bg_21cc4e1bd67dcffb5683f3e8f6d13966";
    /**
     * 用户 secretKey
     */
    private final String secretKey = "071e7b5970136d1bcdae58e6278a08943e0f66ba08897823a2974e20b1ce6e20";
    /**
     * 口令
     */
    private final String passphrase = "123456a";
    /**
     * bitget open api 根路径
     */
    private final String baseUrl = "http://192.168.33.2:12457";
    private final ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey)
            .passphrase(passphrase)
            .baseUrl(baseUrl)
            .locale(SupportedLocaleEnum.EN_US.getName())
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
