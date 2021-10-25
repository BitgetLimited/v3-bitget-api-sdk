package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixCancelOrderRequest implements Serializable {

    private static final long serialVersionUID = -5806007811150714152L;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 合约symbol
     */
    private String symbol;

    private String marginCoin;

}
