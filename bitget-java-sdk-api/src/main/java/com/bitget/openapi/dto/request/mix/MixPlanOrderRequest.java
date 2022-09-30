package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: placePlan request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixPlanOrderRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Amount of currency placed
     */
    private BigDecimal size;
    /**
     * Entrusted price
     */
    private BigDecimal executePrice;
    /**
     * Trigger Price
     */
    private BigDecimal triggerPrice;
    /**
     * Entrusting direction
     */
    private String side;
    /**
     * Transaction Type
     */
    private String orderType;
    /**
     * Trigger Type Transaction Price Trigger Flag Price Trigger
     */
    private String triggerType;
    /**
     * Client ID
     */
    private String clientOid;
    /**
     * Default stop profit price
     */
    private String presetTakeProfitPrice;
    /**
     * Preset stop loss price
     */
    private String presetStopLossPrice;

}
