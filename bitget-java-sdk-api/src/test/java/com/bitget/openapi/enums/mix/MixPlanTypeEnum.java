package com.bitget.openapi.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MixPlanTypeEnum {
    NORMAL_PLAN( "normal_plan"),
    PROFIT_PLAN( "profit_plan"),
    LOSS_PLAN( "loss_plan"),
    MOVING_PLAN( "moving_plan"),
    TRACK_PLAN( "track_plan"),
    POS_PROFIT( "pos_profit"),
    POS_LOSS( "pos_loss")
    ;

    private final String value;

}
