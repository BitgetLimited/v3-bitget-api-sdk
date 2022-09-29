package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class MixOpenCountRequest {

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;

    private BigDecimal openPrice;

    private BigDecimal openAmount;

    private Integer leverage = 20;
}
