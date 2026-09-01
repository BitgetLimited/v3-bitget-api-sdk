package com.bitget.openapi.common.domain;

import com.bitget.openapi.common.enums.SignTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.Proxy;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientParameter {

    /**
     * 用户 api key，必填
     */
    private String apiKey;

    /**
     * 用户密钥，必填
     */
    private String secretKey;

    /**
     * 用户 passphrase，必填
     */
    private String passphrase;

    /**
     * 服务 url，非必填 默认
     */
    private String baseUrl;

    /**
     * 链接超时时间，非必填 默认 30s
     */
    private Long timeout;

    /**
     * 语言环境
     */
    private String locale;

    /**
     * 签名类型
     */
    private SignTypeEnum signType = SignTypeEnum.SHA256;


    /**
     * 代理配置
     */
    private Proxy proxy;

     /**
     * 是否是模拟交易
     */
    private boolean isPapTrading = false;
}
