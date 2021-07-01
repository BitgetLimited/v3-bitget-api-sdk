package com.bitget.openapi.dto.request.spot;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SpotOrdersReq implements Serializable {

    /**
     * 订单方向
     */
    private String side;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 订单控制类型
     */
    private String force;

    /**
     * 委托价格，仅适用于限价单
     */
    private String price;

    /**
     * 数量
     */
    private String quantity;

    /**
     * 客户端订单ID
     */
    private String clientOrderId;
}
