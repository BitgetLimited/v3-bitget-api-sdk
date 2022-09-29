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
public class ChangeLeverageReq implements Serializable {
    private static final long serialVersionUID = 2185132921513652714L;
    /**
     * User Id
     */
    private Long userId;
    /**
     * Lever multiple, integer between 1-100 can be filled
     */
    private Integer leverage;
    /**
     * Direction: LONG_ Positions (1, "multi warehouse"),
     * SHORT_POSITIONS(2,"Empty position"),
     */
    private Integer side;

    private Integer holdSide;
    /**
     * Currency pair
     */
    private String symbol;

    /**

     * Position mode

     * 1 Warehouse by warehouse mode

     * 2 Full warehouse mode

     */
    private Integer holdModel;
}
