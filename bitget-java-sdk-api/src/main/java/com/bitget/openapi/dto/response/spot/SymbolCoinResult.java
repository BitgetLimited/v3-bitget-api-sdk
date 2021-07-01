package com.bitget.openapi.dto.response.spot;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SymbolCoinResult implements Serializable {

    /**
     * 币对
     */
    private String symbol;

    /**
     * 基础币
     */
    private String baseCoin;

    /**
     * 计价币
     */
    private String quoteCoin;

    /**
     * 最小交易数量
     */
    private String minTradeAmount;

    /**
     * 最大交易数量
     */
    private String maxTradeAmount;

    /**
     * taker手续费率
     */
    private String takerFeeRate;

    /**
     * marker手续费率
     */
    private String makerFeeRate;

    /**
     * 价格精度
     */
    private String priceScale;

    /**
     * 数量精度
     */
    private String quantityScale;

    /**
     *  online:线上
     */
    private String status;
}
