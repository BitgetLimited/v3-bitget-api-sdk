package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author hupf
 */
@Builder
@Data
public class MixCancelBatchOrdersRequest  {
    private static final long serialVersionUID = -7705106195889290245L;


    /**
     * 合约symbol
     */
    private String symbol;

    private String marginCoin;
    /**
     * 订单id
     */
    private List<String> orderIds;

}
