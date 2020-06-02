package com.bitget.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * ( 计划委托订单结果 )
 * @author jian.li
 * @create 2020-05-29 12:36
 */
@Data
public class PlanPlaceOrderResult implements Serializable {

    private static final long serialVersionUID = 7388570192902103978L;
    /**
     * 客户端标识
     */
    private String client_oid;
    /**
     * 计划委托订单号
     */
    private String order_id;
}
