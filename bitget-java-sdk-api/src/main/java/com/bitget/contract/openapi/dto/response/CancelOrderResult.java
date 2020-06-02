package com.bitget.contract.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelOrderResult implements Serializable {

    private static final long serialVersionUID = 2182672129628573247L;
    private String order_id;
    private String client_oid;
    private String instrument_id;
    /**
     * 是否取消成功
     */
    private Boolean result;
    private String err_code;
    private String err_msg;

}
