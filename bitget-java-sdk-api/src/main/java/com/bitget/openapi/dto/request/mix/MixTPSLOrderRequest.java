package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
public class MixTPSLOrderRequest implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;

    private String planType;

    private BigDecimal triggerPrice;

    private String holdSide;
}
