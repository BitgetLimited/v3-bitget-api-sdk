package com.bitget.contract.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustMarginReq implements Serializable {
    private static final long serialVersionUID = -7870680025161802152L;
    /**
     * 数量
     */
    private String amount;
    /**
     * 方向0多仓 1空仓
     */
    private Integer positionType;
    /**
     * 类型1增加 2减少
     */
    private Integer type;
}
