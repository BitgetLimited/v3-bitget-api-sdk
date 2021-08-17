package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum MixSideEnum {
    /**
     * 开多
     */
    OPEN_LONG("open_long"),
    /**
     * 开空
     */
    OPEN_SHORT("open_short"),
    /**
     * 平多
     */
    CLOSE_LONG("close_long"),
    /**
     * 平空
     */
    CLOSE_SHORT("close_short"),
    ;

    private final String side;

}
