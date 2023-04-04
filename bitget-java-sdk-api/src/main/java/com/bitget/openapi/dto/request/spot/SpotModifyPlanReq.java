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
public class SpotModifyPlanReq implements Serializable {

    private long userId;

    private String orderId;

    private String executePrice;

    private String triggerPrice;

    private String orderType;

    private String size;
}