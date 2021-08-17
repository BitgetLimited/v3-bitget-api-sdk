package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MixHoldSideEnum {

    LONG("long"),     //多仓
    SHORT("short"),   //空仓
    ;

    private final String code;

}
