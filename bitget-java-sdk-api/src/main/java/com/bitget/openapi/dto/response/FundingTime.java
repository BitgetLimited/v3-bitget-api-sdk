package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 下次结算时间 )
 * @author jian.li
 * @create 2020-05-29 12:32
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FundingTime implements Serializable {
    private static final long serialVersionUID = 463680335593277505L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String symbol;
    /**
     * 下一次的结算时间
     */
    private String funding_time;
    /**
     * 是否是正向合约
     */
    private Boolean forwardContractFlag = false;
}
