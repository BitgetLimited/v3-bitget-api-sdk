package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: modify plan request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixModifyPresetRequest implements Serializable {

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
     * If the profit stop price is blank, cancel the profit stop
     */
    private String presetTakeProfitPrice;

    /**
     * If the stop loss price is blank, cancel the stop loss
     */
    private String presetStopLossPrice;

    /**
     * order id
     */
    private String orderId;

    /**
     * plan type
     */
    private String planType;
}
