package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MixCancelPlanRequest implements Serializable {

    private static final long serialVersionUID = -5806007811150714154L;

    /**
     * Order Id
     */
    private String orderId;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     *
     */
    private String planType;
    /**
     * Asset Currency Id
     */
    private String marginCoin;

}
