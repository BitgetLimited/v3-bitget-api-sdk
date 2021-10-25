package com.bitget.openapi.dto.response;

import lombok.*;

/**
 * ( 累计分润DTO )
 *
 * @author fqy
 * @create 2021/3/16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TotalProfitInfoResult {
    /**
     * 昨日分润-交易员
     */
    private String yesterdaySplitProfit;

    private String yesterdayTimeStamp;

    /**
     * 累积分润 ---4期新增
     */
    private String sumProfit;

    /**
     * 待分润 ---4期新增
     */
    private String waitProfit;

}