package com.bitget.openapi.dto.response;

import lombok.*;

import java.io.Serializable;

/**
 * ProfitProductCodeGroupResonseDto
 *
 * @author bai
 * @date 2020-11-28 3:05 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProfitSymbolGroupResult implements Serializable {

    private static final long serialVersionUID = 3970864198083903802L;
    // 当前交易对
    private String settleTokenId;
    // 收益
    private String profit;
}
