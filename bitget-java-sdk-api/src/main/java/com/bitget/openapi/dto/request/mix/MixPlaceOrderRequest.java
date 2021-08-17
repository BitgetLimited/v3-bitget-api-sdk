package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixPlaceOrderRequest implements Serializable {

    private static final long serialVersionUID = -7008876848185925619L;

    /**
     * 合约
     */
    private String symbol;

    /**
     * 保证金币种
     */
    private String marginCoin;

    /**
     * 客户端标识
     */
    private String clientOid;
    /**
     * 下单币量
     */
    private BigDecimal size;
    /**
     * 开多 开空 平多 平空
     */
    private String side;
    /**
     * 订单类型 市价 限价
     */
    private String orderType;
    /**
     * 委托价格
     */
    private BigDecimal price;

    /**
     * 订单有效期
     */
    private String timeInForceValue;
    /**
     * 预设止盈价
     */
    private BigDecimal presetTakeProfitPrice;
    /**
     * 预设止损价
     */
    private BigDecimal presetStopLossPrice;

}
