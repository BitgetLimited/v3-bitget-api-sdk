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
     * Currency pair
     */
    private String symbol;
    /**
     * Entrusted quantity
     */
    private BigDecimal size;
    /**
     * Order Id
     */
    private Long order_id;
    /**
     * Client ID
     */
    private String client_oid;
    /**
     * Number of transactions
     */
    private BigDecimal filled_qty;
    /**
     * Total handling charge
     */
    private BigDecimal fee;
    /**
     * Entrusted price
     */
    private BigDecimal price;
    /**
     * Average transaction price
     */
    private BigDecimal price_avg;
    /**
     * NEW New Order PARTIALLY_ FILLED partial transactions FILLED all transactions CANCELLED canceled
     */
    private String state;
    /**
     * Delegate type Delegate type 1: open many 2: open empty 3: average many 4: average empty
     */
    private Integer type;
    /**
     * Order Type NORMAL: General Entrusted POST_ ONLY: Maker (Post only) FOK: Full transaction or immediate cancellation (FOK) IOC: immediate transaction and cancellation of the remaining (IOC)
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
