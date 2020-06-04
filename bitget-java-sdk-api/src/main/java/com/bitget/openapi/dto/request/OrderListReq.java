package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( 订单列表查询对象 )
 *
 * @author jian.li
 * @create 2020-05-29 12:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderListReq implements Serializable {
    private static final long serialVersionUID = 3721944028616588183L;
    /**
     * 合约code
     */
    private String symbol;
    /**
     * -1:已撤单（包含风险触发撤销），0:未成交，1:部分成交，2：完全成交， 3:未成交或部分成交，4：已撤单（包含风险触发撤销）或完全成交
     */
    private Integer status;
    /**
     * from 和to主要是组成查第几页的数据（默认为1）
     */
    private String from;
    /**
     * from 和to主要是组成查第几页的数据 （默认为1）
     */
    private String to;
    /**
     * 分页返回的结果集数量，最大为100，不填默认返回100条，小于或等于0报异常，非数字型字符报异常
     */
    private String limit;


}
