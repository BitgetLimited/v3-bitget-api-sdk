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
 * @DES: place an order request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixPlaceOrderRequest implements Serializable {

    private static final long serialVersionUID = -7008876848185925619L;

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Client ID
     */
    private String clientOid;
    /**
     * Amount of currency placed
     */
    private BigDecimal size;
    /**
     * Open more, open more, empty more, empty more
     */
    private String side;
    /**
     * Order Type Market Price Limit
     */
    private String orderType;
    /**
     * Entrusted price
     */
    private BigDecimal price;
    /**
     * Order validity
     */
    private String timeInForceValue;
    /**
     * Default stop profit price
     */
    private BigDecimal presetTakeProfitPrice;
    /**
     * Preset stop loss price
     */
    private BigDecimal presetStopLossPrice;

}
