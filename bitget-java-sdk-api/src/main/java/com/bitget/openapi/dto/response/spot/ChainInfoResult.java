package com.bitget.openapi.dto.response.spot;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChainInfoResult implements Serializable {

    /**
     * 链名称
     */
    private String chain;

    /**
     * 是否需要tag
     */
    private String needTag;

    /**
     * true/false是否可提现
     */
    private String withdrawAble;

    /**
     * true/false是否可提现是否可充值
     */
    private String rechargeAble;

    /**
     * 提现手续费
     */
    private String withdrawFee;

    /**
     * 充值确认数
     */
    private String depositConfirm;

    /**
     * 提现确认数
     */
    private String withdrawConfirm;

    /**
     * 最小充值数
     */
    private String minDepositAmount;

    /**
     * 最小提现数
     */
    private String minWithdrawAmount;

    /**
     * 区块浏览器地址
     */
    private String browserUrl;
}
