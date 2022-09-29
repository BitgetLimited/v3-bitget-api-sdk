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
public class SpotCancelOrderReq implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * Order Id
     */
    private String orderId;
}
