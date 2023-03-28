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
    /**
     * Symbol Id
     */
     private String symbol ;
    /**
     * Order Id, From the /currentTrack in response the "trackingNo" field
     */
     private Long trackingNo ;
    /**
     * Take Profit Price, set to null means to disable/cancel TP
     */
    private BigDecimal stopProfitPrice ;
    /**
     * Stop Loss price, set to null means to disable/cancel SL
     */
    private BigDecimal	 stopLossPrice ;

}
