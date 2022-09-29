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
     * Asset Currency Id
     */
    private String marginCoin;

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * Settlement currency
     */
    private BigDecimal locked;

    /**
     * //Warehouse by warehouse： available -> locked(ContractDetailPosition.lockedMargin) -> ContractDetailPosition.margin
     * //Full warehouse： available -> locked(ContractDetailPosition.lockedMargin) -> ContractCrossPosition.margin
     * //blend： available -> locked(ContractDetailPosition.lockedMargin) -> available
     * //Indicates the currently available assets, which can be negative in some cases. For example, in the contract scenario, floating profit opening
     */
    private BigDecimal available;

    /**
     * Maximum opening balance of the whole warehouse (settlement currency)
     */
    private BigDecimal crossMaxAvailable;

    /**
     * Maximum available opening amount (settlement currency)
     */
    private BigDecimal fixedMaxAvailable;

    /**
     * Maximum transferable out
     */
    private BigDecimal maxTransferOut;

    /**
     * Account equity (settlement currency)
     */
    private BigDecimal equity;

    /**
     * Account equity (usdt)
     */
    private BigDecimal usdtEquity;

    /**
     * Account equity (btc)
     */
    private BigDecimal btcEquity;

    /**
     * Used (settlement currency)
     */
    private BigDecimal usedBalance;

    /**
     * Actual margin rate in full position
     */
    private BigDecimal crossMarginRate;

    /**
     * Full warehouse risk rate
     */
    private BigDecimal crossRiskRate;

    /**
     * Lever in full position
     */
    private Integer crossMarginLeverage;
    /**
     * Long lever for position by position
     */
    private Integer fixedLongLeverage;
    /**
     * Short lever on a position by position basis
     */
    private Integer fixedShortLeverage;
    /**
     * Contract margin mode 1, position by position mode 2, full position mode
     */
    private Integer marginMode;
    /**
     * Contractual position mode 1 One way position 2 Two way position
     */
    private Integer holdMode;


}
