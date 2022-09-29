package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class MixModifyTPSLRequest implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;

    private String orderId;

    private String triggerPrice;

    private String planType;

}
