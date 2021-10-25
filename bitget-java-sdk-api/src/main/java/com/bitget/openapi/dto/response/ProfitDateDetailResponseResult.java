package com.bitget.openapi.dto.response;

import lombok.*;

import java.io.Serializable;

/**
 * ProfitDateDetailResponseDto
 *
 * @author bai
 * @date 2020-11-28 2:53 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProfitDateDetailResponseResult implements Serializable {
    private static final long serialVersionUID = 4814185158408060130L;
    // 收益
    private String profit;
    //币对
    private String settleTokenId;
    //昵称
    private String nickName;
}
