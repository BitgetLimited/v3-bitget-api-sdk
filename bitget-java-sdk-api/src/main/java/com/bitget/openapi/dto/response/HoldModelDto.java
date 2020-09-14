package com.bitget.openapi.dto.response;

import lombok.Data;

@Data
public class HoldModelDto {

    private boolean switchSuccess;

    /**
     * 持仓模式
     */
    private Integer resultHoldMode;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 合约编码
     */
    private String symbol;

    /**
     * 多仓杠杆
     */
    private Integer longLeverage;

    /**
     * 空仓杠杆
     */
    private Integer shortLeverage;
}
