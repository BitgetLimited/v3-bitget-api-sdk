package com.bitget.contract.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * ( 订单结果对象 )
 * @author jian.li
 * @create 2020-05-29 12:34
 */
@Data
public class OrderInfoResult implements Serializable {
    private static final long serialVersionUID = 7410790848916007851L;
    /**
     * orderId : 64-2b-17122f911-3
     * client_oid : 12233456
     * error_code : 0
     * error_message :
     */

    private String order_id;
    private String client_oid;
    private boolean result;
    private String error_code;
    private String error_message;
}
