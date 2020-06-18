package com.bitget.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class CancelPlanResult implements Serializable {

    private static final long serialVersionUID = -1108687620409623010L;
    /**
     * result : true
     * orderId : 2047593676229632
     * client_oid : 2047593676229632
     * symbol : LTC-USD-181228
     */
    private String order_id;
    private String client_oid;
    private Boolean result;
    private String err_code;
    private String err_msg;

}
