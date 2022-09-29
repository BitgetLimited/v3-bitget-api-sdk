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
public class ChangeLeverageResult implements Serializable {
    private static final long serialVersionUID = -5141021975009104090L;

    /**
     * Currency pair Id
     */
     private String symbolId;

    /**
     * Asset Currency Id
     */
    private String marginCoin;

    /**
     * Multi position lever
     */
    private Integer long_leverage;

    /**
     * Short position lever
     */
    private Integer short_leverage;

    /**
     * Lever in full position
     */
    private Integer crossMarginLeverage;

    /**
     * Margin mode 1 warehouse by warehouse 2 full warehouse
     */
    private Integer marginMode;

}
