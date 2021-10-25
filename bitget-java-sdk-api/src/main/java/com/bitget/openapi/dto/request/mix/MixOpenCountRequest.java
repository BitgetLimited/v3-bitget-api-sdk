package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class MixOpenCountRequest {

    /**
     * 合约交易对
     */
    private String symbol;
    /**
     * 保证金币种
     */
    private String marginCoin;

    private BigDecimal openPrice;

    private BigDecimal openAmount;

    private Integer leverage = 20;
}
