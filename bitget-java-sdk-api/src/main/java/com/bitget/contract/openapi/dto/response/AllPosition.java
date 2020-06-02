package com.bitget.contract.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllPosition implements Serializable {
    private static final long serialVersionUID = 1334734707966426725L;
    /**
     * 全仓模式或逐仓模式
     */
    private String margin_mode;
    /**
     * 持仓列表
     */
    private List<Position> holding;
}
