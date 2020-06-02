package com.bitget.contract.openapi.common.enums;


public enum OrderTypeEnum {

    LIMIT(0),
    MARKET(1);

    private Integer code;


    OrderTypeEnum(Integer code) {
        this.code = code;
    }

    public static OrderTypeEnum toEnum(Integer code) {
        for (OrderTypeEnum item : OrderTypeEnum.values()) {
            if (item.code.equals(code)) {
                return item;
            }
        }
        StringBuilder str = new StringBuilder();
        str.append("the argument of ").append(code).append(" have no correspondence OrderTypeEnum enum!");
        throw new IllegalArgumentException(str.toString());
    }

    public Integer getCode() {
        return code;
    }

    public boolean isThisType(OrderTypeEnum orderTypeEnum) {
        return this == orderTypeEnum;
    }
}
