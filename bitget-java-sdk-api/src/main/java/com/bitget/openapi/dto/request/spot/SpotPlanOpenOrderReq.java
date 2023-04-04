package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotPlanOpenOrderReq implements Serializable {

    private Long userId;

    private String symbol;

    private String startTime;

    private String endTime;

    private Integer pageSize;

    private String lastEndId;

    private String isPre;
}
