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
public class MixCloseTrackOrderRequest implements Serializable {

    /**
     * Currency pair
     */
    private String symbol;

    private Long trackingNo;
}
