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
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;
    /**
     * Order Id
     */
    private List<String> orderIds;

}
