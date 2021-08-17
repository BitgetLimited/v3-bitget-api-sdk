package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author hupf
 */
@Data
@Builder
public class PlaceOrderBaseParam {

    private static final long serialVersionUID = -7008876848185925619L;
    /**
     * 客户端标识
     */
    private String clientOid;
    /**
     * 下单币量
     */
    private BigDecimal size;
    /**
     * 1:开多 2:开空 3:平多 4:平空
     */
    private String side;
    /**
     * 订单类型
     */
    private String orderType;
    /**
     * 委托价格
     */
    private BigDecimal price;

    private String timeInForceValue;

}
