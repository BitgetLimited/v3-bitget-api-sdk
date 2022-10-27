package com.bitget.openapi.common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientParameter {

    /**
     * User apiKey, required
     */
    private String apiKey;
    /**
     * User secretKey, required
     */
    private String secretKey;
    /**
     * User passphrase, required
     */
    private String passphrase;
    /**
     * Service url, optional, default https://capi.bitget.com/api/swap/v3/
     */
    private String baseUrl;
    /**
     * Link timeout, optional, default 30s
     */
    private Long timeout;
    /**
     * Linguistic environment
     */
    private String locale;

}
