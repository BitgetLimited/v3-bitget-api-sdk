package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot bill request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotBillQueryReq implements Serializable {

    private static final long serialVersionUID = -5806007811150714154L;

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
