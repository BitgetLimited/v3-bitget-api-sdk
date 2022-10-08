package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: set lever request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public  class MixChangeLeverageReq implements Serializable {

    private static final long serialVersionUID = 2185132921513652714L;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Leverage ratio
     */
    private Integer leverage;
    /**
     * The whole warehouse lever can not transfer this parameter
     * Position direction: long multi position short short position,
     * MixHoldSideEnum
     */
    private String holdSide;



}
