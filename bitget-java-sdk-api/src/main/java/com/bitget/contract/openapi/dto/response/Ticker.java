package com.bitget.contract.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (  最新成交价)
 * @author jian.li
 * @create 2020-05-29 12:37
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticker implements Serializable {
    private static final long serialVersionUID = 3365787526033084722L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String instrument_id;
    /**
     * 最新成交价
     */
    private String last;
    /**
     * 卖一价
     */
    private String best_ask;
    /**
     * 买一价
     */
    private String best_bid;
    /**
     * 24小时最高价
     */
    private String high_24h;
    /**
     * 24小时最低价
     */
    private String low_24h;
    /**
     * 24小时成交量
     */
    private String volume_24h;
    /**
     * 系统时间戳
     */
    private String timestamp;
}
