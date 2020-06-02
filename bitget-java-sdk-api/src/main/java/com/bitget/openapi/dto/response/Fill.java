package com.bitget.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * ( 成交记录对象 )
 *
 * @author jian.li
 * @create 2020-05-29 12:31
 */
@Data
public class Fill implements Serializable {
    private static final long serialVersionUID = -7376257918880374324L;
    /**
     * 交易id
     */
    private String trade_id;
    /**
     * 合约code
     */
    private String instrument_id;
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
}
