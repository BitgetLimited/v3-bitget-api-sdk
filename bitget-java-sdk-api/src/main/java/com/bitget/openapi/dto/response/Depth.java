package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Depth implements Serializable {
    private static final long serialVersionUID = -3189494923249116793L;
    /**
     * 买方深度
     */
    private List<Object[]> asks;
    /**
     * 卖方深度
     */
    private List<Object[]> bids;
    /**
     * 时间戳
     */
    private String timestamp;
}
