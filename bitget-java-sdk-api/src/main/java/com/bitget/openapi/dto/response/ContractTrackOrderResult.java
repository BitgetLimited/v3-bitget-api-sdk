package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractTrackOrderResult {

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
    private Integer openLeverage;
    /**
     * 平均开仓价格
     */
    private BigDecimal averageOpenPrice;
    /**
     * 开仓时间
     */
    private Date openTime;
    /**
     * 持仓数量(开仓成交张数）
     */
    private BigDecimal openDealCount;
    /**
     * 止盈价
     */
    private BigDecimal stopProfitPrice;
    /**
     * 止损价
     */
    private BigDecimal stopLossPrice;
    /**
     * 订单号
     */
    private Long orderNo;

}
