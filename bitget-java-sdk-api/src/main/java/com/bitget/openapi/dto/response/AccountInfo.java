package com.bitget.openapi.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo implements Serializable {
    private static final long serialVersionUID = 8790794013069627062L;
    /**
     * 账户权益
     */
    private String equity;
    /**
     * 逐仓账户余额
     */
    private String fixed_balance;
    /**
     * 账户余额
     */
    private String total_avail_balance;
    /**
     * 已用保证金
     */
    private String margin;
    /**
     * 已实现盈亏
     */
    private String realized_pnl;
    /**
     * 未实现盈亏
     */
    private String unrealized_pnl;
    /**
     * 合约名称
     */
    private String instrument_id;
    /**
     * 开仓冻结保证金
     */
    private String margin_frozen;
    /**
     * 创建时间
     */
    private String timestamp;
    /**
     * 仓位模式：全仓crossed
     * 逐仓：fixed
     */
    private String margin_mode;

    /**
     * 是否是正向合约
     */
    private Boolean forwardContractFlag = false;

}
