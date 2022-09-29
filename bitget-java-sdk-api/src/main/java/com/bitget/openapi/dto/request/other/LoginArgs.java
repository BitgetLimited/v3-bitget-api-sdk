package com.bitget.openapi.dto.request.other;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 * @author hpf
 */
@Builder
@AllArgsConstructor
@Data
public class LoginArgs {

    /**
     * The unique ID of the user used to call the API, which needs to be applied by the user
     */
    @JSONField(ordinal = 1)
    private String apiKey;
    /**
     * Password of APIKey
     */
    @JSONField(ordinal = 2)
    private String passphrase;
    /**
     * Timestamp is the Unix Epoch time in seconds
     */
    @JSONField(ordinal = 3)
    private String timestamp;
    /**
     * Signature String
     */
    @JSONField(ordinal = 4)
    private String sign;
}
