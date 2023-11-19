package com.bitget.openapi.common.enums;

import lombok.Getter;

@Getter
public enum SignTypeEnum {
    SHA256("1", "sha256"),
    RSA("2", "rsa"),
    ;

    private final String code;
    private final String name;

    SignTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
