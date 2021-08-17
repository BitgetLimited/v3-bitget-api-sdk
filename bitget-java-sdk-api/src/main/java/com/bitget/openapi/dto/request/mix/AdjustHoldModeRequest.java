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
public class AdjustHoldModeRequest implements Serializable {


    private static final long serialVersionUID = -3858107194985716036L;

    /**
     * 币对
     */
    private String symbol;

    /**
     * 资产币种Id
     */
    private String marginCoin;
    /**
     * 持仓模式
     * 1 单向持仓
     * 2 双向持仓
     */
    private String holdMode;



}
