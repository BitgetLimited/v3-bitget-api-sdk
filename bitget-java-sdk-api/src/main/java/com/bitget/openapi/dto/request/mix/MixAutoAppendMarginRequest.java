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
public class MixAutoAppendMarginRequest implements Serializable {

    private static final long serialVersionUID = 8014475115086428904L;

    /**
     * Asset Currency Id
     */
    private String marginCoin;

    /**
     * Currency pair
     */
    private String symbol;

    /**
     *
     */
    private Integer holdSide;

    /**
     * 0 - Do not automatically append
     * 1 - Auto append
     */
    private Integer autoAppendMargin;



}
