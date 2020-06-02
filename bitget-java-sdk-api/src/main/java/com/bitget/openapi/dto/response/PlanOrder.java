package com.bitget.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ( 计划委托订单 )
 *
 * @author jian.li
 * @create 2020-05-29 12:35
 */
@Data
public class PlanOrder implements Serializable {
    private static final long serialVersionUID = -6307627370627449502L;
    /**
     * 执行数量
     */
    private BigDecimal execute_count;
    /**
     * 委托数量
     */
    private BigDecimal delegate_count;
    /**
     * 创建时间
     */
    private Long create_time;
    /**
     * 更新时间
     */
    private Long update_time;
    /**
     * 方向 1开多 2开空 3平多 4平空")
     */
    private Integer direction;

    /**
     * 方向 1开多 2开空 3平多 4平空")
     */
    private String direction_desc;

    /**
     * 触发价格
     */
    private BigDecimal trigger_price;
    /**
     * 执行价格
     */
    private BigDecimal execute_price;
    /**
     * 订单号
     */
    private String order_id;
    /**
     * 订单类型0限价 1市价
     */
    private Integer order_type;
    /**
     * 合约编码
     */
    private String instrument_id;

    /**
     * 订单状态：状态 1未执行状态 2已委托 3执行失败状态 4用户取消状态
     */
    private int status;
    /**
     * 订单状态：状态 1未执行状态 2已委托 3执行失败状态 4用户取消状态
     */
    private String status_desc;
    /**
     * 计划委托时的成交价
     */
    private BigDecimal create_trade_price;
    /**
     * 计划类型：类型 0 普通计划 1-止盈计划 2-止损计划
     *  private Byte planType;
     */

}
