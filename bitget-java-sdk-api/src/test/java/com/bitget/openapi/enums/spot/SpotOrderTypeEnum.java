package com.bitget.openapi.enums.spot;

import lombok.Getter;

@Getter
public enum SpotOrderTypeEnum {

    /**
     * Price limit order
     */
    LIMIT("limit"),

    /**
     * Market price list
     */
    MARKET("market"),
    ;

    private final String code;

    SpotOrderTypeEnum(String code) {
        this.code = code;
    }

    public static SpotOrderTypeEnum toEnum(String code) {
        for (SpotOrderTypeEnum item : SpotOrderTypeEnum.values()) {
            if (item.code.equalsIgnoreCase(code)) {
                return item;
            }
        }
        return null;
    }

}
