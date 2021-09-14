package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotTransferRecordReq {

    private Integer coinId;
    private String fromType;

    @Builder.Default
    private Integer limit=10;

    //默认查询近7天数据
    private Long after;
    private Long before;

}