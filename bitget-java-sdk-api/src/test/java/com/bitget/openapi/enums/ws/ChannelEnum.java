package com.bitget.openapi.enums.ws;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ChannelEnum {

    SWAP_TICKER("swap/ticker"),
    SWAP_CANDLE_1MIN("swap/candle60s"),
    SWAP_CANDLE_5MIN("swap/candle300s"),
    SWAP_CANDLE_15MIN("swap/candle900s"),
    SWAP_CANDLE_30MIN("swap/candle1800s"),
    SWAP_CANDLE_1H("swap/candle3600s"),
    SWAP_CANDLE_4H("swap/candle14400s"),
    SWAP_CANDLE_12H("swap/candle43200s"),
    SWAP_CANDLE_1D("swap/candle86400s"),
    SWAP_CANDLE_1W("swap/candle604800s"),
    SWAP_TRADE("swap/trade"),
    SWAP_FUNDING_RATE("swap/funding_rate"),
    SWAP_PRICE_RANGE("swap/price_range"),
    SWAP_DEPTH("swap/depth"),
    SWAP_MARKET_PRICE("swap/mark_price"),

    SWAP_ACCOUNT("swap/account"),
    SWAP_POSITION("swap/position"),
    SWAP_ORDER("swap/order"),
    ;

    private String channel;
}
