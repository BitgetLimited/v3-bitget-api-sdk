package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotPlanOrderReq implements Serializable {

    private Long userId;

    private String symbol;

    private String size;

    private String executePrice;

    private String triggerPrice;

    private String side;

    private String orderType;

    private String triggerType;

    private String timeInForceValue = "normal";

    private String clientOid;

    private String channelApiCode;
}
