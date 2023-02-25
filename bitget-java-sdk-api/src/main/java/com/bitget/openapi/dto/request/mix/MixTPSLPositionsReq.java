package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixTPSLPositionsReq implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * Deposit currency
     */
    private String marginCoin;

    private String planType;

    private BigDecimal triggerPrice;

    private String triggerType;

    private String holdSide;

    /**
     * http header X-CHANNEL-API-CODE, default null
     */
    private String channelApiCode;

    /**
     * 单项持仓  是否只减仓
     */
    private boolean reduceOnly = false;

}
