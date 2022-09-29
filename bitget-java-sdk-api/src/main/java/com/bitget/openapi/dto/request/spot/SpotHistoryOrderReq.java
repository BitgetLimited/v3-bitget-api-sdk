package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotHistoryOrderReq implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;

    private Long after;

    private Long before;
    /**
     * Default 100, maximum 500
     */
    @Builder.Default
    private Integer limit = 100;
}
