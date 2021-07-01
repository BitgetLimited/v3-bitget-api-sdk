package com.bitget.openapi.common.enums.spot;

import lombok.Getter;

@Getter
public enum OrderSideEnum {

    /**
     * 买单
     */
    BUY("buy"),

    /**
     * 卖单
     */
    SELL("sell"),
    ;

    private final String code;

    OrderSideEnum(String code) {
        this.code = code;
    }

    public static OrderSideEnum toEnum(String code) {
        for (OrderSideEnum item : OrderSideEnum.values()) {
            if (item.code.equalsIgnoreCase(code)) {
                return item;
            }
        }
        return null;
    }


}
