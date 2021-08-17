package com.bitget.openapi.dto.response.mix;

import lombok.Data;

@Data
public class PlaceOrderResult {

    /**
     * client_oid : 51dfa81b01084dfdb07bd642b5bfce63
     * error_code : 0
     * error_messsage :
     * orderId : 2047622606459904
     * result : true
     */
    private String client_oid;
    private String order_id;
}
