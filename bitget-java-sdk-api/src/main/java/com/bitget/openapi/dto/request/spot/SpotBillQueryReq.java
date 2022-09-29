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
public class SpotBillQueryReq implements Serializable {

    /**
     * Currency ID
     */
    private Integer coinId;
    /**
     * Group Type
     */
    private String groupType;
    /**
     * Business Type
     */
    private String bizType;
    /**
     * Pass in billId to query previous data
     */
    private Long after;
    /**
     * Pass in billId to check the subsequent data
     */
    private Long before;
    /**
     * Default 100, maximum 500
     */
    @Builder.Default
    private Integer limit = 100;
}
