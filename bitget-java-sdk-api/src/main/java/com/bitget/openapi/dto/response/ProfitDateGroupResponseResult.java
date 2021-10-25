package com.bitget.openapi.dto.response;

import lombok.*;

import java.io.Serializable;

/**
 * ProfitDateGroupResponseDto
 *
 * @author bai
 * @date 2020-11-28 2:20 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProfitDateGroupResponseResult implements Serializable {

    private static final long serialVersionUID = -5117956743725351338L;
    // 当前日期
    private Long date;
    // 收益
    private String profit;
    //单位
    private String settleTokenId;
}
