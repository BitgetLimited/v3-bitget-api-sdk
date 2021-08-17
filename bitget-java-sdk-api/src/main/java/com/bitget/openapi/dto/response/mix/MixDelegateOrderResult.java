package com.bitget.openapi.dto.response.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;


@Builder
@Data
public class MixDelegateOrderResult implements Serializable {


    private static final long serialVersionUID = -1912104784842743195L;
    /**
     * 交易对信息
     */
    private String symbol;

    /**
     * 委托数量
     */
    private BigDecimal size;

    /**
     * 订单号
     */
    private Long order_id;


    /**
     * 客户端标识
     */
    private String client_oid;


    /**
     * 成交数量
     */
    private BigDecimal filled_qty;

    /**
     * 总手续费
     */
    private BigDecimal fee;


    /**
     * 委托价格
     */
    private BigDecimal price;
    /**
     * 平均成交价
     */
    private BigDecimal price_avg;

    /**
     * NEW 新建订单 PARTIALLY_FILLED 部分成交 FILLED 全部成交 CANCELED 已撤销
     */
    private String state;

    /**
     * 委托类型 委托类型 1:开多 2:开空 3:平多 4:平空
     */
    private Integer type;


    /**
     * 订单类型 NORMAL：普通委托 POST_ONLY：只做Maker（Post only） FOK：全部成交或立即取消（FOK） IOC：立即成交并取消剩余（IOC）
     */
    private String timeInForce;

    /**
     *
     */
    private String businessSource;

    /**
     * 总盈亏
     */
    private BigDecimal totalProfits;

    /**
     * 订单方向 BUY 买 SELL 卖
     */
    private String side;

    /**
     * 持仓方向 LONG 多仓 SHORT 空仓
     */
    private String posSide;

    /**
     * 订单创建时间
     */
    private Long createTime;

    /**
     * 订单更新时间
     */
    private Long updateTime;

    /**
     * 币种id
     */
    private String marginCoin;

}
