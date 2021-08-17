package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class MixModifyTPSLRequest  implements Serializable {

    /**
     * 合约交易对
     */
    private String symbol;
    /**
     * 保证金币种
     */
    private String marginCoin;

    private String orderId;

    private String triggerPrice;

}
