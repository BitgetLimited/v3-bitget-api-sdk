package com.bitget.openapi.common.enums.ws;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SubEventEnum {

    SUBSCRIBE("subscribe"),
    UNSUBSCRIBE("unsubscribe"),
    LOGIN("login"),
    ;

    private String event;

}
