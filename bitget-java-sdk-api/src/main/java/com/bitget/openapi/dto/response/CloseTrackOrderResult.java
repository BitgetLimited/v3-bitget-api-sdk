package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CloseTrackOrderResult {
    /**
     * 跟单号
     */
    private Long trackingNo;

    /**
     * 跟单结果
     */
    private boolean result;
}
