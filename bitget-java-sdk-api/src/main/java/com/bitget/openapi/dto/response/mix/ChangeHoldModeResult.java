package com.bitget.openapi.dto.response.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangeHoldModeResult implements Serializable {


    private static final long serialVersionUID = 7841886659172148893L;

    /**
     * Asset Currency Id
     */
    private String marginCoin;
    /**
     * Currency pair Id
     */
    private String symbolId;

    /**
     * True: two-way position mode; False: one-way position mode
     */
    private boolean dualSidePosition;


}
