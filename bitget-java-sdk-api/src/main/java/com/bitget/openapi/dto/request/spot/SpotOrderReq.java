package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place an order request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotOrderReq implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * Currency pair
     */
    private String symbol;
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
