package com.bitget.openapi.common.enums.spot;

import lombok.Getter;

@Getter
public enum SpotOrderTypeEnum {

    /**
     * 限价单
     */
    LIMIT("limit"),

    /**
     * 市价单
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
