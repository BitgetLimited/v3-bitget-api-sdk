package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangeLeverageReq implements Serializable {
    private static final long serialVersionUID = 2185132921513652714L;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 杠杆倍数，可填写1-100之间的整数
     */
    private Integer leverage;
    /**
     * 方向: LONG_POSITIONS(1,"多仓"),
     * SHORT_POSITIONS(2,"空仓"),
     */
    private Integer side;
    /**
     * 合约代码
     */
    private String symbol;
}
