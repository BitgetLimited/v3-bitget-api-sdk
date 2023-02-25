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
public class MixTrailOrderReq implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * Deposit currency
     */
    private String marginCoin;

    private BigDecimal triggerPrice;

    private String triggerType ;

    private String side;

    private String size;

    private String rangeRate;

    private String presetTakeProfitPrice;

    private String presetStopLossPrice;

    /**
     * 单项持仓  是否只减仓
     */
    private boolean reduceOnly = false;
}
