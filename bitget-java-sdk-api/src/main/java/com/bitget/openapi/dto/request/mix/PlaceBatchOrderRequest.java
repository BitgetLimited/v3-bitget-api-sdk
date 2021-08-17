package com.bitget.openapi.dto.request.mix;

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
public class PlaceBatchOrderRequest implements Serializable {
    private static final long serialVersionUID = 7456926698906558545L;
    /**
     * 合约symbolId
     */
    private String symbol;
    /**
     * 结算币种id
     */
    private String marginCoin;

    /**
     * 订单信息
     */
    private List<PlaceOrderBaseParam> orderDataList;




}
