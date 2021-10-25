package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class MixModifyPresetRequest implements Serializable {

    /**
     * 合约交易对
     */
    private String symbol;
    /**
     * 保证金币种
     */
    private String marginCoin;

    private String presetTakeProfitPrice;

    private String presetStopLossPrice;

    private String orderId;

    private String planType;
}
