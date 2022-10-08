package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Dealer closing request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixCloseTrackOrderReq implements Serializable {

    private static final long serialVersionUID = -5806007811150714154L;

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * The tracking order number comes from the trackingNo of the current interface with the order
     */
    private Long trackingNo;
}
