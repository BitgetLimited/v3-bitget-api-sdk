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
public  class MixChangeLeverageRequest implements Serializable {
    private static final long serialVersionUID = 2185132921513652714L;

    private String symbol;

    private String marginCoin;

    /**
     * 杠杆倍数
     */
    private Integer leverage;


    /**
     * 全仓杠杆可以不传此参数
     * 持仓方向: long多仓 short空仓,
     * MixHoldSideEnum
     */
    private String holdSide;



}
