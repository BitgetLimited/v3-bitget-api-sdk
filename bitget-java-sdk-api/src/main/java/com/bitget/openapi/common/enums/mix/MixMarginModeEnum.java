package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 保证金模式
 */
@AllArgsConstructor
@Getter
public enum MixMarginModeEnum {

    CROSSED( "crossed"),// 全仓
    FIXED( "fixed"); // 逐仓

    private final String code;

}
