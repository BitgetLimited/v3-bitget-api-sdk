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
	private final String apiKey = "bg_b6bf2c1e88e352f6d03a0d02544f1354";
	/**
	 * 用户 secretKey 替换成自己的
	 */
	private final String secretKey = "8ecba60d41f18be31a35371800a22628b5d9a8ec5f4b9a084d862f85770306f1";
	/**
	 * 口令 替换成自己的
	 */
	private final String passphrase = "11111111";
	/**
	 * bitget open api 根路径
	 */
	
	//private final String baseUrl = "https://capi.bitgetapi.com";
	private final String baseUrl = "http://192.168.33.2:12457";

	private final ClientParameter parameter = ClientParameter.builder().apiKey(apiKey).secretKey(secretKey).passphrase(passphrase).baseUrl(baseUrl)
			.locale(SupportedLocaleEnum.ZH_CN.getName()).build();
	BitgetRestClient bitgetRestClient;
	
	@Before
	public void setup() {
		bitgetRestClient = BitgetRestClient.builder().configuration(parameter).build();
	}
	
	@After
	public void tearDown() {
		
	}
}
