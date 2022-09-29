package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class MixModifyPresetRequest implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;

    private String presetTakeProfitPrice;

    private String presetStopLossPrice;

    private String orderId;

    private String planType;
}
