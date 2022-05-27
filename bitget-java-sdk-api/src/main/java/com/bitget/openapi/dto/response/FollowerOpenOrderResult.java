package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FollowerOpenOrderResult {

    private static final long serialVersionUID = 2182672129628573247L;

    private String trackingNo;

    private String openOrderId;

    private String closeOrderId;

    private String symbol;

    private String holdSide;

    private Integer openLeverage;

    private Double openAvgPrice;

    private Long openTime;

    private String openDealCount;

    private String openMargin;

    private Double averageClosePrice;

    private String closeDealCount;

    private Long closeTime;
}
