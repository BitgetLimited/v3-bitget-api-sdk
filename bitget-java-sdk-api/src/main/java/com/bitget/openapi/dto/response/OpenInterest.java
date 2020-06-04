package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 持仓 )
 * @author jian.li
 * @create 2020-05-29 12:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenInterest implements Serializable {
    private static final long serialVersionUID = -1590230497660999213L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String symbol;
    /**
     * 总持仓量
     */
    private String amount;
    /**
     * 系统时间戳
     */
    private String timestamp;
    /**
     * 是否是正向合约
     */
    private Boolean forwardContractFlag = false;

}
