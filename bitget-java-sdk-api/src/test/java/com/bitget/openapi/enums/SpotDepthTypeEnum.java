package com.bitget.openapi.enums;

import lombok.Getter;

@Getter
public enum SpotDepthTypeEnum {

    /**
     * step0
     */
    STEP0("step0"),

    /**
     * step1
     */
    STEP1("step1"),

    /**
     * step2
     */
    STEP2("step2"),

    /**
     * step3
     */
    STEP3("step3"),

    /**
     * step4
     */
    STEP4("step4"),

    /**
     * step5
     */
    STEP5("step5"),
    ;

    private final String code;

    SpotDepthTypeEnum(String code) {
        this.code = code;
    }

    public static SpotDepthTypeEnum toEnum(String code) {
        for (SpotDepthTypeEnum item : SpotDepthTypeEnum.values()) {
            if (item.code.equalsIgnoreCase(code)) {
                return item;
            }
        }
        return null;
    }
}