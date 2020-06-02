package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractInfo implements Serializable {
    private static final long serialVersionUID = -5380012831947013615L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String instrument_id;
    /**
     * 合约币种，如cmt_btcusdt中前面的BTC
     */
    private String underlying_index;
    /**
     * 计价货币，如cmt_btcusdt中的USD
     */
    private String quote_currency;
    /**
     * 保证金币种，如cmt_btcusdt中BTC
     */
    private String coin;
    /**
     * 合约面值
     */
    private String contract_val;
    /**
     * 创建时间
     */
    private String listing;
    /**
     * 结算时间
     */
    private List<String> delivery;
    /**
     * 数量精度
     */
    private String size_increment;
    /**
     * 价格精度
     */
    private String tick_size;
    /**
     * 是否是正向合约
     */
    private Boolean forwardContractFlag;
    /**
     * 价格最后一位步长 5
     */
    private BigDecimal priceEndStep;
}
