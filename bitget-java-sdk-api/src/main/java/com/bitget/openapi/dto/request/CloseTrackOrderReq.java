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
public class CloseTrackOrderReq implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;
    /**
     * Tracking order No
     */
    private Long trackingNo;
}
