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
public class PlaceBatchOrderReq implements Serializable {
    private static final long serialVersionUID = -4363592514170972068L;

    /**
     * symbol : cmt_btcusdt
     * order_data : [{"client_oid":"bitget#123456","order_type":"1","price":"5","size":"2","type":"1","match_price":"0"},
     * {"client_oid":"bitget#123457","order_type":"1","price":"2","size":"3","type":"2","match_price":"1"}]
     */
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Order information
     */
    private String order_data;

    /**
     * Order information list
     */
    private List<OrderData> orderDataList;
}
