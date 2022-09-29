package com.bitget.openapi.dto.request.mix;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;


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
     * Asset Currency Id
     */
    private String marginCoin;

    private String holdSide;
    /**
     * Amount greater than 0 increases less than 0 decreases
     */
    private BigDecimal amount;





}
