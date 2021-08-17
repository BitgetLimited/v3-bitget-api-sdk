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
     * 合约名称
     */
    private String symbolId;

    /**
     * 保证金币种
     */
    private String marginCoin;

    /**
     * 多仓杠杆
     */
    private Integer long_leverage;

    /**
     * 空仓杠杆
     */
    private Integer short_leverage;

    /**
     * 全仓时的杠杆
     */
    private Integer crossMarginLeverage;

    /**
     * 保证金模式 1逐仓 2全仓
     */
    private Integer marginMode;

}
