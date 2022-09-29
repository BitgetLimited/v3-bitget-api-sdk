package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanPlaceOrderReq implements Serializable {
    private static final long serialVersionUID = 1288092295878149846L;
    /**
     * Execution price
     */
    private String execute_price;
    /**
     * Trigger Price
     */
    private String trigger_price;
    /**
     * Matching type 0: Price limit 1: Market price
     */
    private String match_type;
    /**
     * Direction 1 Multi warehouse 2 Empty warehouse
     */
    private String side;
    /**
     * Position direction
     */
    private String holdSide;
    /**
     * Type 1 Opening 2 Closing
     */
    private String type;
    /**
     * Number of contracts
     */
    private String size;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Client ID
     */
    private String client_oid;
}
