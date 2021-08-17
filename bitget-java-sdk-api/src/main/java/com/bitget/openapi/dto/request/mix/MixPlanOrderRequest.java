package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
public class MixPlanOrderRequest implements Serializable {

    /**
     * 合约交易对
     */
    private String symbol;
    /**
     * 保证金币种
     */
    private String marginCoin;
    /**
     * 下单数量
     */
    private BigDecimal size;
    /**
     * 委托价格
     */
    private BigDecimal executePrice;
    /**
     * 触发价格
     */
    private BigDecimal triggerPrice;
    /**
     * 委托方向
     */
    private String side;
    /**
     * 交易类型
     */
    private String orderType;
    /**
     * 触发类型 成交价触发 标记价触发
     */
    private String triggerType;

    private String clientOid;
    /**
     * 预设止盈价
     */
    private String presetTakeProfitPrice;
    /**
     * 预设止损价
     */
    private String presetStopLossPrice;

}
