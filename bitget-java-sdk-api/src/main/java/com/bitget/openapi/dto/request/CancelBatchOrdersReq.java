package com.bitget.openapi.dto.request;

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
public class CancelBatchOrdersReq implements Serializable {
    private static final long serialVersionUID = 2194353520856678089L;
    /**
     * 订单id
     */
    private List<String> ids;
    /**
     * 合约名称
     */
    private String symbol;
}
