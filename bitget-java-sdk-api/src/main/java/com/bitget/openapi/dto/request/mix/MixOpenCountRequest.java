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
 * @DES: Get the openable request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixOpenCountRequest implements Serializable {

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
     * open price
     */
    private BigDecimal openPrice;
    /**
     * open amount
     */
    private BigDecimal openAmount;
    /**
     * Default leverage 20
     */
    private Integer leverage = 20;
}
