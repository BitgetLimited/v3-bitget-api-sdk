package com.bitget.contract.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * (  账单流水 )
 * @author jian.li
 * @create 2020-05-29 12:34
 */
@Data
public class LedgerResult implements Serializable {
    private static final long serialVersionUID = -5422879331018973147L;
    /**
     * 账单id
     */
    private String ledger_id;
    /**
     * 变动金额
     */
    private String amount;
    /**
     * 账单类型
     */
    private Integer type;
    /**
     * 手续费
     */
    private String fee;
    /**
     * 系统时间戳
     */
    private String timestamp;
    /**
     * 系统时间戳
     */
    private String create_time;
    /**
     * 系统时间戳
     */
    private String biz_time;
    /**
     * 合约代码
     */
    private String instrument_id;
}
