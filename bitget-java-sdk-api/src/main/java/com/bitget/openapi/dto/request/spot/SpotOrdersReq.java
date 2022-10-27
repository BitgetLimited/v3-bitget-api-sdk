package com.bitget.openapi.dto.request.spot;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: SpotOrdersReq
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SpotOrdersReq implements Serializable {

    /**
     * Order direction
     */
    private String side;
    /**
     * Order type
     */
    private String orderType;
    /**
     * Order Control Type
     */
    private String force;
    /**
     * Entrusted price, only applicable to price limit order
     */
    private String price;
    /**
     * quantity
     */
    private String quantity;
    /**
     * Client order ID
     */
    private String clientOrderId;
}
