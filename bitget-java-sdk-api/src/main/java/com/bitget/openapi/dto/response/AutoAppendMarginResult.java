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
public class AutoAppendMarginResult implements Serializable {
    private static final long serialVersionUID = -3437506342832975464L;
    /**
     * true:设置成功，false设置失败
     */
    private Boolean result;
    /**
     * 0:表示不设置  1：表示设置了
     */
    private Integer append_type;
}
