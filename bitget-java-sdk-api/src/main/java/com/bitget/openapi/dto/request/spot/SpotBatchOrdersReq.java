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
public class SpotBatchOrdersReq implements Serializable {

    /**
     * 币对
     */
    private String symbol;

    /**
     * 批量订单ID
     */
    private List<SpotOrdersReq> orderList;
}
