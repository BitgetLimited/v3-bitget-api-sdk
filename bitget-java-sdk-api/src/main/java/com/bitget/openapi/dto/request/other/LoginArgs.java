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
     * 用于调用API的用户身份唯一标示，需要用户申请
     */
    @JSONField(ordinal = 1)
    private String apiKey;

    /**
     * APIKey 的密码
     */
    @JSONField(ordinal = 2)
    private String passphrase;

    /**
     * 时间戳 ，是Unix Epoch时间，单位是秒
     */
    @JSONField(ordinal = 3)
    private String timestamp;

    /**
     * 签名字符串
     */
    @JSONField(ordinal = 4)
    private String sign;
}
