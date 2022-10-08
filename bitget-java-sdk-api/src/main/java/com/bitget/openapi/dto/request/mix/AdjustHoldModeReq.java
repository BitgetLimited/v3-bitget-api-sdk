package com.bitget.openapi.dto.request.mix;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Adjust hold mode request
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustHoldModeReq implements Serializable {


    private static final long serialVersionUID = -3858107194985716036L;
    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Deposit currency
     */
    private String marginCoin;
    /**
     * Position mode
     * 1 One way position
     * 2 Two way position
     */
    private String holdMode;



}
