package com.bitget.contract.openapi.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 合约挂单冻结数量 )
 * @author jian.li
 * @create 2020-05-29 12:33
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Holds implements Serializable {
    private static final long serialVersionUID = -2553610261751273588L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String instrument_id;
    /**
     * 开仓冻结保证金
     */
    private String amount;
    /**
     * 查询时间
     */
    private String timestamp;
}
