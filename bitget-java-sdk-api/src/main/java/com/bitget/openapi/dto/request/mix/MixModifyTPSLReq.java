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
public class MixModifyTPSLReq implements Serializable {

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
     * Order id
     */
    private String orderId;

    /**
     * Trigger price
     */
    private String triggerPrice;

    /**
     * Plan type
     */
    private String planType;

}
