package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 保证金模式
 */
@AllArgsConstructor
@Getter
public enum MixMarginModeEnum {

    CROSSED( "crossed"),// Full warehouse

    FIXED( "fixed"); // Warehouse by warehouse

    private final String code;

}
