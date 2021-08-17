package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MixPlanTypeEnum {
    NORMAL_PLAN( "normal_plan"),
    PROFIT_PLAN( "profit_plan"),
    LOSS_PLAN( "loss_plan")
    ;

    private final String value;

}
