package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Batch cancellation request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixCancelBatchOrdersReq implements Serializable {

    private static final long serialVersionUID = -7705106195889290245L;

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Order Id list
     */
    private List<String> orderIds;

}
