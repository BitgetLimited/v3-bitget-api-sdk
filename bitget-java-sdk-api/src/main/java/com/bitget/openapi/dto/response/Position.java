package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 持仓 )
 * @author jian.li
 * @create 2020-05-29 12:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position implements Serializable {
    private static final long serialVersionUID = 2859926864912988632L;
    /**
     * 预估爆仓价
     */
    private String liquidation_price;
    /**
     * 持仓数量
     */
    private String position;
    /**
     * 可平数量
     */
    private String avail_position;
    /**
     * 开仓平均价
     */
    private String avg_cost;
    /**
     * 合约代码
     */
    private String symbol;
    /**
     * 杠杆
     */
    private String leverage;
    /**
     * 已实现盈亏
     */
    private String realized_pnl;
    /**
     * 方向
     */
    private String side;
    private String timestamp;

    private String margin;

}
