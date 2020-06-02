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
public class ChangeLeverageResult implements Serializable {
    private static final long serialVersionUID = 5022095724195241739L;
    /**
     * 多仓杠杆
     */
    private String long_leverage;
    /**
     * 持仓模式
     */
    private String margin_mode;
    /**
     * 空仓杠杆
     */
    private String short_leverage;
    /**
     * 合约名称
     */
    private String instrument_id;
    /**
     * 是否是正向合约
     */
    private Boolean forwardContractFlag = false;
}
