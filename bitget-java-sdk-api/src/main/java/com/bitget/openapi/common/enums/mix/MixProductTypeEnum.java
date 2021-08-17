package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MixProductTypeEnum {


    USDT_TYPE("usdt_type"),
    MIX_TYPE("mix_type"),
    ;

    private final String code;

}