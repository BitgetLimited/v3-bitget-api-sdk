package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixTraceModifyTPSLOrderReq  implements Serializable {

    private Long trackingNo;

    private String symbol;

    private BigDecimal stopProfitPrice;

    private BigDecimal stopLossPrice;

    private String clientOid;
}
