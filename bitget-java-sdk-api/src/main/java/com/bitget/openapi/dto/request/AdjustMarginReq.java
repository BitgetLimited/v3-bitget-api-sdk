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
public class AdjustMarginReq implements Serializable {

    private static final long serialVersionUID = -7870680025161802152L;

    /**
     * Currency pair
     */
    private  String symbol;
    /**
     * quantity
     */
    private String amount;
    /**
     * Direction 0 Multi warehouse 1 Empty warehouse
     */
    private Integer positionType;
    /**
     * Type 1 increase 2 decrease
     */
    private Integer type;
}
