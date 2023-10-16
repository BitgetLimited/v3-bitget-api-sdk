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
	 * The user apiKey is replaced with his own
	 */
	private final String apiKey = "";
	/**
	 * The user's secretKey is replaced with his own
	 */
	private final String secretKey = "";
	/**
	 * Replace the password with your own
	 */
	private final String passphrase = "";
	/**
	 * Bitget open api root path
	 */
	private final String baseUrl = "https://api.bitget.com";


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
