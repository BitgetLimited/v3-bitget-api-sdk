package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: place batch order request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaceBatchOrderReq implements Serializable {

    private static final long serialVersionUID = 7456926698906558545L;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Order data list
     */
    private List<PlaceOrderBaseReq> orderDataList;




}
