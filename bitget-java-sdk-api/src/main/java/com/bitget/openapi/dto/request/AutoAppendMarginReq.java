package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutoAppendMarginReq implements Serializable {

    private static final long serialVersionUID = -8106007170051510407L;

    /**
     * 合约code
     */
    private String symbol;
    /**
     * 方向 1多仓 2空仓
     */
    private Integer side;

    /**
     * 追加保证金类型 0 不自动追加 1 自动追加
     */
    private Integer append_type;
}
