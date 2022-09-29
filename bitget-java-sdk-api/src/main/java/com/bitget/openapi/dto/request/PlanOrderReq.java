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
public class PlanOrderReq implements Serializable {
    private static final long serialVersionUID = 402439922703688936L;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Direction 1: more open, 2: more open, 3: more flat, 4: more flat
     */
    private String side;
    /**
     * Entrustment type: 1 open more, 2 open more, 3 open more, 4 open more
     */
    private String delegateType;
    /**
     * Current Page
     */
    private String page_index;
    /**
     * Quantity per page
     */
    private String page_size;
    /**
     * Query start time (timestamp)
     */
    private String start_time;
    /**
     * Query end time (timestamp)
     */
    private String end_time;
}
