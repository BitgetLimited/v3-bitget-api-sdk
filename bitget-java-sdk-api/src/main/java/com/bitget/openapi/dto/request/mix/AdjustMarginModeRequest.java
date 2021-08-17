package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustMarginModeRequest implements Serializable {

    private static final long serialVersionUID = 586091911369690370L;

    /**
     * 资产币种Id
     */
    private String marginCoin;

    /**
     * 币对
     */
    private String symbol;

    /**
     * 保证金模式
     */
    private String marginMode;


}
