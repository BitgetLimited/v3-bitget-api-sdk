package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryTraceResult {

    /**
     * 合约名称
     */
    private  String symbol;
    /**
     * 仓位方向
     */
    private  Integer holdSide;
    /**
     * 开仓杠杆
     */
    private Integer openLevel;
    /**
     * 开仓均价
     */
    private String openAvgPrice;
    /**
     * 开仓时间
     */
    private Long openTime;
    /**
     * 平仓成交张数
     */
    private String closeDealCount;
    /**
     * 平仓触发时间
     */
    private Long closeTime;
    /**
     * 平仓均价
     */
    private String closeAvgPrice;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 1止盈 2止损(平仓类型）
     */
    private Integer stopType;
    /**
     * 已实现盈亏
     */
    private String achievedProfits;
    /**
     * 开仓累计手续费
     */
    private String openFee;
    /**
     * 平仓累计手续费
     */
    private String closeFee;
}
