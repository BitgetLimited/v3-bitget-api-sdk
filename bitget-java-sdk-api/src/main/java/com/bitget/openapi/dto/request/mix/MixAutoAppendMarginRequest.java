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

    private String marginCoin;


    private String symbol;

    /**
     *
     */
    private Integer holdSide;

    /**
     * 0 - 不自动追加
     * 1 - 自动追加
     */
    private Integer autoAppendMargin;



}
