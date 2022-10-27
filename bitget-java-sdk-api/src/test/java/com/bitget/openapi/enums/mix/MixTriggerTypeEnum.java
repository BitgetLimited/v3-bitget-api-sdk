package com.bitget.openapi.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MixTriggerTypeEnum {

    FILL_PRICE("fill_price"),
    MARKET_PRICE( "market_price");

    private final String value;


}
