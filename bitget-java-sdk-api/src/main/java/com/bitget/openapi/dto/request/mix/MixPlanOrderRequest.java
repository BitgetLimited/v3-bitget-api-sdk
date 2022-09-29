package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
public class MixPlanOrderRequest implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;
    /**
     * Amount of currency placed
     */
    private BigDecimal size;
    /**
     * Entrusted price
     */
    private BigDecimal executePrice;
    /**
     * Trigger Price
     */
    private BigDecimal triggerPrice;
    /**
     * Entrusting direction
     */
    private String side;
    /**
     * Transaction Type
     */
    private String orderType;
    /**
     * Trigger Type Transaction Price Trigger Flag Price Trigger
     */
    private String triggerType;
    /**
     * Client ID
     */
    private String clientOid;
    /**
     * Default stop profit price
     */
    private String presetTakeProfitPrice;
    /**
     * Preset stop loss price
     */
    private String presetStopLossPrice;

}
