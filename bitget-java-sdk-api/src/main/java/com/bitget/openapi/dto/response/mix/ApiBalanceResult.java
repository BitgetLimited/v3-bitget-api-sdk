package com.bitget.openapi.dto.response.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiBalanceResult implements Serializable {

    private static final long serialVersionUID = -2991634253324208657L;
    private Long id;


    /**
     * 资产币种
     */
    private String marginCoin;

    /**
     * 合约名称
     */
    private String symbol;

    /**
     * 结算币
     */
    private BigDecimal locked;

    /**
     * //逐仓时： available -> locked(ContractDetailPosition.lockedMargin) -> ContractDetailPosition.margin
     * //全仓时： available -> locked(ContractDetailPosition.lockedMargin) -> ContractCrossPosition.margin
     * //混合时： available -> locked(ContractDetailPosition.lockedMargin) -> available
     * //表示当前可用的资产, 其可以为负，在某些情况下。比如合约场景下，浮盈开仓
     */
    private BigDecimal available;

    /**
     * 全仓最大可用来开仓余额(结算币)
     */
    private BigDecimal crossMaxAvailable;

    /**
     * 逐仓最大可用来开仓金额(结算币)
     */
    private BigDecimal fixedMaxAvailable;

    /**
     * 最大可转出
     */
    private BigDecimal maxTransferOut;

    /**
     * 账户权益(结算币)
     */
    private BigDecimal equity;

    /**
     * 账户权益(usdt)
     */
    private BigDecimal usdtEquity;

    /**
     * 账户权益(btc)
     */
    private BigDecimal btcEquity;

    /**
     * 已用(结算币)
     */
    private BigDecimal usedBalance;

    /**
     * 全仓时 实际保证金率
     */
    private BigDecimal crossMarginRate;

    /**
     * 全仓时 风险率
     */
    private BigDecimal crossRiskRate;

    /**
     * 全仓时的杠杆
     */
    private Integer crossMarginLeverage;
    /**
     * 逐仓时的多头杠杆
     */
    private Integer fixedLongLeverage;
    /**
     * 逐仓时的空头杠杆
     */
    private Integer fixedShortLeverage;
    /**
     * 合约保证金模式 1逐仓模式 2全仓模式
     */
    private Integer marginMode;
    /**
     * 合约持仓模式 1 单向持仓 2 双向持仓
     */
    private Integer holdMode;


}
