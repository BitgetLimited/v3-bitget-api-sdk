package com.bitget.openapi.dto.request.mix;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Adjustment margin request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixAdjustMarginFixRequest implements Serializable {

    private static final long serialVersionUID = -3858107194985716037L;

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Position direction (all positions are not transferred)
     */
    private String holdSide;
    /**
     * Amount greater than 0 increases less than 0 decreases
     */
    private BigDecimal amount;





}
