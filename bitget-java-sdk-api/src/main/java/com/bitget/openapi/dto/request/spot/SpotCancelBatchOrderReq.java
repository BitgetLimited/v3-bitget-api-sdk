package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotCancelBatchOrderReq implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;

    /**
     *  Order ids
     */
    private List<String> orderIds;
}
