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
public class CloseTrackOrderReq implements Serializable {

    /**
     * 合约名称
     */
    private String symbol;
    /**
     * 追踪订单号
     */
    private Long trackingNo;
}
