package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 合约最高限价和最低限价 )
 * @author jian.li
 * @create 2020-05-29 12:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceLimit implements Serializable {
    private static final long serialVersionUID = 5542784187533827080L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String symbol;
    /**
     * 最高买价
     */
    private String highest;
    /**
     * 最低卖价
     */
    private String lowest;
    /**
     * 系统时间戳
     */
    private String timestamp;
    /**
     * 是否是正向合约
     */
    private Boolean forwardContractFlag = false;
}
