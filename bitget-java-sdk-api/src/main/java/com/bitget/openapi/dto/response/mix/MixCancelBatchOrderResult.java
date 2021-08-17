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
     * 处理结果
     */
    private boolean result;
    /**
     * 合约code
     */
    private String symbol;
    /**
     * 订单ids
     */
    private List<String> order_ids;
    /**
     * 取消订单的结果集合
     */
//    private List<CancelOrderResult> fail_infos;
}
