package com.bitget.openapi.common.enums;

import lombok.Getter;

@Getter
public enum SupportedLocaleEnum {
    EN_US("en_US", "English"),
    ZH_CN("zh-CN", "Simplified chinese"),
    JA_JP("ja-JP", "Japanese"),
    ko_KR("ko-KR", "Simplified chinese"),

    ;
    private final String name;
    private final String comment;

    SupportedLocaleEnum(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }
}
