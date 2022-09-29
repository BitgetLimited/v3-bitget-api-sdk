package com.bitget.openapi.dto.request.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustMarginModeRequest implements Serializable {

    private static final long serialVersionUID = 586091911369690370L;

    /**
     * Asset Currency Id
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
