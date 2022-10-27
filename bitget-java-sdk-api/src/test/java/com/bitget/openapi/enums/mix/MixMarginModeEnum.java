package com.bitget.openapi.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Margin mode
 */
@AllArgsConstructor
@Getter
public enum MixMarginModeEnum {

    CROSSED( "crossed"),// Full warehouse

    FIXED( "fixed"); // Warehouse by warehouse

    private final String code;

}
