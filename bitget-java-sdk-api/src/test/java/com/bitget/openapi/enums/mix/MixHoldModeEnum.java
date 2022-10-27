package com.bitget.openapi.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MixHoldModeEnum {

    SINGLE_HOLD( "single_hold"),
    DOUBLE_HOLD( "double_hold");

    private final String code;

}
