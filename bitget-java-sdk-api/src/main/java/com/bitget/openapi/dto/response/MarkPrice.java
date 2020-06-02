package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 标记价格 )
 * @author jian.li
 * @create 2020-05-29 12:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarkPrice implements Serializable {
    private static final long serialVersionUID = 2590340777948924734L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String instrument_id;
    /**
     * 标记价格
     */
    private String mark_price;
    /**
     * 系统时间戳
     */
    private String timestamp;
}
