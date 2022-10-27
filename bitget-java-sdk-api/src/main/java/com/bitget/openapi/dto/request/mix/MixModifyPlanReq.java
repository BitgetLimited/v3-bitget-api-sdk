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
public class MixModifyPlanReq implements Serializable {

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
     * Planned entrusted order No
     */
    private String orderId;

    /**
     * Execution price
     */
    private BigDecimal executePrice;

    /**
     * Trigger Price
     */
    private BigDecimal triggerPrice;

    /**
     * Trigger Type
     */
    private String triggerType;

    /**
     * Order Type
     */
    private String orderType;
}
