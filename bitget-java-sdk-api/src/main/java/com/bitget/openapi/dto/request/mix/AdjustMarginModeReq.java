package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Adjust margin mode request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustMarginModeReq implements Serializable {

    private static final long serialVersionUID = 586091911369690370L;

    /**
     * Deposit currency
     */
    private String marginCoin;

    /**
     * Currency pair
     */
    private String symbol;

    /**
     * Margin mode
     */
    private String marginMode;


}
