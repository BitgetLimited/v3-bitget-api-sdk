package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanPlaceOrderReq implements Serializable {
    private static final long serialVersionUID = 1288092295878149846L;
    /**
     * 执行价格
     */
    private String execute_price;
    /**
     * 触发价格
     */
    private String trigger_price;
    /**
     * 匹配类型 0:限价 1：市价
     */
    private String match_type;
    /**
     * 方向 1多仓 2空仓
     */
    private String side;
    /**
     * 类型 1开仓 2平仓
     */
    private String type;
    /**
     * 合约张数
     */
    private String size;
    /**
     * 产品编码
     */
    private String symbol;
    /**
     * 客户端标识
     */
    private String client_oid;
}
