package com.bitget.contract.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * ( 下单结果 )
 * @author jian.li
 * @create 2020-05-29 12:35
 */
@Data
public class PlaceOrderResult implements Serializable {
    private static final long serialVersionUID = -4728484192952359027L;
    /**
     * 客户端标识
     */
    private String client_oid;
    /**
     * 订单id
     */
    private String order_id;
}
