package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Get order details request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotOrderInfoReq implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Order Id
     */
    private String orderId;
    /**
     * Client Order Id
     */
    private String clientOrderId;
}
