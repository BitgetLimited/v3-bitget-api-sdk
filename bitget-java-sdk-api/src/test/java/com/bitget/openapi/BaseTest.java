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
	private final String apiKey = "bg_fcdae1a6714c08a554bf4f62a6da9563";
	/**
	 * The user's secretKey is replaced with his own
	 */
	private final String secretKey = "5ccea28f627c4ac772a8044cbe0aa2792df6688414c062b3761cc3d6d692a298";
	/**
	 * Replace the password with your own
	 */
	private final String passphrase = "1r1b6uX6PQ9tbKwb";
	/**
	 * Bitget open api root path
	 */
	//
	private final String baseUrl = "https://api.bitget.com";
	/**
	 * Bitget open api root path
	 */
    //private final String baseUrl = "https://api.bitget.com";

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
