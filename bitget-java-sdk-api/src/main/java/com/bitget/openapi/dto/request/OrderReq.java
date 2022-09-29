package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Ordering object
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderReq implements Serializable {

    private static final long serialVersionUID = 5109506374875594403L;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Custom order number (no more than 50 characters, and cannot be special characters, such as Mars characters)
     */
    private String client_oid;
    /**
     * Order quantity (cannot be 0 or negative)
     */
    private String size;
    /**
     * 1: Kaiduo 2: Kaikong 3: Pingduo 4: Pingkong
     */
    private String type;

    /**
     * 0: price limit or 1: market price
     */
    private String match_price;
    /**
     * Entrusted price (with precision limit, the precision (ticke_size) and step length (priceEndStep) are "contract information interface", and price limit is required)
     */
    private String price;
    /**
     * 0: ordinary, 1: only make; 2: Complete transaction or immediate cancellation; 3: Close immediately and cancel the remaining
     */
    private String order_type;
    /**
     * trace_no
     */
    private String trace_no;
    /**
     * Preset stop profit price
     */
    private BigDecimal presetTakeProfitPrice;
    /**
     * Preset stop loss price
     */
    private BigDecimal presetStopLossPrice;


}
