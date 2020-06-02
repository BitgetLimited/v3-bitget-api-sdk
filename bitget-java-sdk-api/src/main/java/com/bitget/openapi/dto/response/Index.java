package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 指数 )
 * @author jian.li
 * @create 2020-05-29 12:33
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Index implements Serializable {
    private static final long serialVersionUID = 3408201681106544558L;
    /**
     * 合约名称，如cmt_btcusdt
     */
    private String instrument_id;
    /**
     * 现货指数价格
     */
    private String index;
    /**
     * 系统时间戳
     */
    private String timestamp;
}
