package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: cancel the order request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixCancelOrderReq implements Serializable {

    private static final long serialVersionUID = -5806007811150714152L;
    /**
     * Order Id
     */
    private String orderId;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;

}
