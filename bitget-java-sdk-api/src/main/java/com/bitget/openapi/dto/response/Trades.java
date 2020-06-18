package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 成交记录 )
 * @author jian.li
 * @create 2020-05-29 12:37
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trades implements Serializable {
    private static final long serialVersionUID = -9063865903909230943L;
    /**
     * 成交id
     */
    private String trade_id;
    /**
     * 成交价格
     */
    private String price;
    /**
     * 成交数量
     */
    private String size;
    /**
     * 成交方向：sell，buy
     */
    private String side;
    /**
     * 成交时间
     */
    private String timestamp;
    /**
     * 合约code
     */
    private String symbol;
}
