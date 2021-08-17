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
     *
     */
    private String marginCoin;
    /**
     *
     */
    private String symbolId;

    /**
     * true: 双向持仓模式；false: 单向持仓模式
     */
    private boolean dualSidePosition;


}
