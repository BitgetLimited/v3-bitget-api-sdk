package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *下单对象
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderReq implements Serializable {

    private static final long serialVersionUID = 5109506374875594403L;
    /**
     * 合约代码
     */
    private String symbol;
    /**
     *自定义订单号(不超过50个字符，且不能是特殊字符，如火星字符等)
     */
    private String client_oid;
    /**
     * 下单数量（不能为0，不能为负数）
     */
    private String size;
    /**
     * 1:开多 2:开空 3:平多 4:平空
     */
    private String type;

    /**
     * 0:限价还是1:市价
     */
    private String match_price;
    /**
     * 委托价格（有精度限制，精度（tick_size）和步长（priceEndStep）取“合约信息接口”，限价必填）
     */
    private String price;
    /**
     * 0:普通，1：只做maker;2:全部成交或立即取消;3:立即成交并取消剩余
     */
    private String order_type;
    /**
     * 跟单号
     */
    private String trace_no;
    /**
     * 预设的止盈价格
     */
    private BigDecimal presetTakeProfitPrice;

    /**
     * 预设的止损价格
     */
    private BigDecimal presetStopLossPrice;


}
