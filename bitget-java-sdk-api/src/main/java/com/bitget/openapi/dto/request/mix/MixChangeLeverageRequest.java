package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public  class MixChangeLeverageRequest implements Serializable {

    private static final long serialVersionUID = 2185132921513652714L;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
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
