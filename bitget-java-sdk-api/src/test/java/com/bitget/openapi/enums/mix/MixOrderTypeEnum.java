package com.bitget.openapi.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MixOrderTypeEnum {

    LIMIT("limit"),
    MARKET("market");

    private String code;
}
