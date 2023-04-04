package com.bitget.openapi.common.enums.spot;


import lombok.Getter;

@Getter
public enum ForceEnum {

    NORMAL("normal"),

    POST_ONLY("postOnly"),

    FOK("fok"),

    IOC("ioc"),

    ;

    private final String code;

    ForceEnum(String code) {
        this.code = code;
    }

    public static ForceEnum toEnum(String code) {
        for (ForceEnum item : ForceEnum.values()) {
            if (item.code.equalsIgnoreCase(code)) {
                return item;
            }
        }
        return null;
    }
}
