package com.bitget.openapi.common.enums.spot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SpotWalletTypeEnum {

    SPOT("spot"),
    MIX_USDT("mix_usdt"),
    MIX_USD("mix_usd"),
    ;

    private final String code;
}
