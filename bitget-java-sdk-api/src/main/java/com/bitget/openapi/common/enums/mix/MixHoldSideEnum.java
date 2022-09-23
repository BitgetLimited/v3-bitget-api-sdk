package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MixHoldSideEnum {

    LONG("long"),     //Multi warehouse

    SHORT("short"),   //Empty position
    ;

    private final String code;

}
