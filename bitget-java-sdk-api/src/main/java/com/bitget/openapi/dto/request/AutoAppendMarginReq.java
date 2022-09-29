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
public class AutoAppendMarginReq implements Serializable {

    private static final long serialVersionUID = -8106007170051510407L;

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Direction 1 Multi warehouse 2 Empty warehouse
     */
    private Integer side;
    /**
     * Position direction 1 Multi position 2 Short position
     */
    private Integer holdSide;
    /**
     * Type of margin increase: 0, no automatic increase: 1, automatic increase
     */
    private Integer append_type;
}
