package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Get historical delegation list request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotHistoryOrderReq implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * Pass in the data after the orderId asc
     */
    private Long after;

    /**
     * The orderId is passed in. The data before the orderId desc
     */
    private Long before;
    /**
     * Number of returned results Default 100, maximum 500
     */
    @Builder.Default
    private Integer limit = 100;
}
