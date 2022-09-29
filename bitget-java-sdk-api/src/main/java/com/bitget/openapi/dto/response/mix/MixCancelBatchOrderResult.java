package com.bitget.openapi.dto.response.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MixCancelBatchOrderResult {
    /**
     * Processing results
     */
    private boolean result;
    /**
     * Contract code
     */
    private String symbol;
    /**
     * Order ids
     */
    private List<String> order_ids;
    /**
     * Result set for cancelling orders
     */
//    private List<CancelOrderResult> fail_infos;
}
