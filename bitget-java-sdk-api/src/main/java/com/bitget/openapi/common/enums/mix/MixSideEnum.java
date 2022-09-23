package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum MixSideEnum {
    /**
     * Kaiduo
     */
    OPEN_LONG("open_long"),
    /**
     * Open empty
     */
    OPEN_SHORT("open_short"),
    /**
     * Pingduo
     */
    CLOSE_LONG("close_long"),
    /**
     * Flat air
     */
    CLOSE_SHORT("close_short"),
    ;

    private final String side;

}
