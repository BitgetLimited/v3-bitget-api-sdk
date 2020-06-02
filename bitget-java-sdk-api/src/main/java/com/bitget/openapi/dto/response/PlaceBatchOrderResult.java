package com.bitget.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ( 批量计划委托结果 )
 * @author jian.li
 * @create 2020-05-29 12:35
 */
@Data
public class PlaceBatchOrderResult implements Serializable {

    private static final long serialVersionUID = -8584478447189208808L;
    /**
     * order_info : [{"orderId":"64-2b-17122f911-3","client_oid":"12233456","error_code":"0","error_message":""},{"orderId":"64-2c-17132f711-0","client_oid":"12453456","error_code":"0","error_message":""}]
     * result : true
     */
    private List<OrderInfoResult> order_info;
    /**
     * 成功 true 失败 false
     */
    private boolean result;
}
