package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotBillQueryReq implements Serializable {

    /**
     * 币种ID
     */
    private Integer coinId;

    /**
     * 分组类型
     */
    private String groupType;

    /**
     * 业务类型
     */
    private String bizType;

    /**
     * 传入billId ,查之前的数据
     */
    private Long after;

    /**
     * 传入billId,查之后的数据
     */
    private Long before;

    /**
     * 默认100，最大500
     */
    @Builder.Default
    private Integer limit = 100;
}
