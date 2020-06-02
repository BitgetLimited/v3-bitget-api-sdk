package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 历史资金费率 )
 * @author jian.li
 * @create 2020-05-29 12:33
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoricalFundingRate implements Serializable {
    private static final long serialVersionUID = -3899271352898769370L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String instrument_id;
    /**
     * 资金费率
     */
    private String funding_rate;
    /**
     * 结算时间
     */
    private String funding_time;
}
