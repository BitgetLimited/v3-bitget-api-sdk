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
 * @DES: modify plan request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixTPSLOrderRequest implements Serializable {

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
     * Plan type
     */
    private String planType;

    /**
     * Trigger price
     */
    private BigDecimal triggerPrice;

    /**
     * Is this position long or short
     */
    private String holdSide;
}
