package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdjustMarginResult implements Serializable {
    private static final long serialVersionUID = 4064857282707352103L;
    /**
     * 结果
     */
    private Boolean result;
    /**
     * 订单号
     */
    private String orderNo;
}
