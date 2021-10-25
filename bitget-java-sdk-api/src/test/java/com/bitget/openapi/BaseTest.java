package com.bitget.openapi;

import org.junit.After;
import org.junit.Before;

import com.bitget.openapi.common.client.BitgetRestClient;
import com.bitget.openapi.common.domain.ClientParameter;
import com.bitget.openapi.common.enums.SupportedLocaleEnum;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class BaseTest {
	
	/**
	 * 用户 apiKey 替换成自己的
	 */
	private final String apiKey = "bg_6ec7289f2a360e415ac096ec5ce9acda";
	/**
	 * 用户 secretKey 替换成自己的
	 */
	private final String secretKey = "bd96960ed310adb3ab6d51ad6c2b5f35fe571f4a6e6a707e5f77cd29830e0435";
	/**
	 * 口令 替换成自己的
	 */
	private final String passphrase = "1r1b6uX6PQ9tbKwb";
	/**
	 * bitget open api 根路径
	 */
	//
    private final String baseUrl = "https://capi.bitget.com";

	private final ClientParameter parameter = ClientParameter.builder().apiKey(apiKey).secretKey(secretKey).passphrase(passphrase).baseUrl(baseUrl)
			.locale(SupportedLocaleEnum.ZH_CN.getName()).build();
	public BitgetRestClient bitgetRestClient;
	
	@Before
	public void setup() {
		bitgetRestClient = BitgetRestClient.builder().configuration(parameter).build();
	}
	
	@After
	public void tearDown() {
		
	}
}
