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
public class SpotFillsOrderReq implements Serializable {

    private String symbol;

    private String orderId;

    private Long after;

    private Long before;

    /**
     * 默认100，最大500
     */
    @Builder.Default
    private Integer limit = 100;
}
