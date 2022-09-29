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
     * Currency pair
     */
    private String symbol;
    /**
     * Asset Currency Id
     */
    private String marginCoin;
    /**
     * Order data
     */
    private List<PlaceOrderBaseParam> orderDataList;




}
