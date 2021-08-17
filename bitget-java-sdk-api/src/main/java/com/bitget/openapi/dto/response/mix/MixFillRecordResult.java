package com.bitget.openapi.dto.response.mix;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hupf
 */
@Data
public class MixFillRecordResult implements Serializable {
    private static final long serialVersionUID = 1309613557371800640L;
    /**
     * 对手交易id
     */
    private String trade_id;
    /**
     * 合约code
     */
    private String symbol;
    /**
     * 订单id
     */
    private String order_id;
    /**
     * 成交价格
     */
    private String price;
    /**
     * 成交数量
     */
    private String order_qty;
    /**
     * 手续费
     */
    private String fee;
    /**
     * 创建时间
     */
    private String timestamp;
    /**
     * 流动性方向，T：taker M：maker
     */
    private String exec_type;
    /**
     * 订单方向
     */
    private String side;
    /**
     * 委托类型
     */
    private String delegateType;
}
