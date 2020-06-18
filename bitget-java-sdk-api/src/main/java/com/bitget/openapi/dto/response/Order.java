package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 订单 )
 * @author jian.li
 * @create 2020-05-29 12:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private static final long serialVersionUID = -74980199062042213L;
    /**
     * 合约名称，如BTC-USD-SWAP
     */
    private String symbol;
    /**
     * 委托数量
     */
    private String size;
    /**
     * 系统时间
     */
    private String timestamp;
    /**
     * 客户标识
     */
    private String clientOid;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 成交数量
     */
    private String filled_qty;
    /**
     * 手续费
     */
    private String fee;
    /**
     * 订单id
     */
    private String order_id;
    /**
     * 委托价格
     */
    private String price;
    /**
     * 成交均价
     */
    private String price_avg;
    /**
     * 订单状态( -1:撤销成功 0:等待成交 1:部分成交 2:完全成交)
     */
    private String status;

    /**
     * 1:开多 2:开空 3:平多 4:平空
     */
    private String type;
    /**
     * 0：普通委托 1：只做Maker（Post only） 2：全部成交或立即取消（FOK） 3：立即成交并取消剩余（IOC）
     */
    private String order_type;
    /**
     * 总盈亏
     */
    private String totalProfits;
}
