package com.bitget.openapi.common.enums.spot;

import lombok.Getter;

@Getter
public enum OrderSideEnum {

    /**
     * check
     */
    BUY("buy"),

    /**
     * vouchers of sale
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
