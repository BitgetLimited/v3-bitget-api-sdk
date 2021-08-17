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
public class MixAdjustMarginFixRequest implements Serializable {

    private String symbol;

    private String marginCoin;

    private String holdSide;
    /**
     * 金额 大于0 增加 小于0减少
     */
    private BigDecimal amount;





}
