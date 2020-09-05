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
public class PlanOrderReq implements Serializable {
    private static final long serialVersionUID = 402439922703688936L;
    /**
     * 合约代码
     */
    private String symbol;
    /**
     * 方向 1开多 2开空 3平多 4平空
     */
    private String side;
    /**
     * 委托类型 1开多 2开空 3平多 4平空
     */
    private String delegateType;
    /**
     * 当前页
     */
    private String page_index;
    /**
     * 每页数量
     */
    private String page_size;
    /**
     * 查询开始时间(时间戳)
     */
    private String start_time;
    /**
     * 查询结束时间(时间戳)
     */
    private String end_time;
}
