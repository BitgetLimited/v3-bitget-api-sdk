package com.bitget.openapi.dto.response.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
public class MixDelegateOrderListResult implements Serializable {

    private static final long serialVersionUID = 3547072553938819685L;

    /**
     * Whether there is the next page
     */
    private boolean nextFlag = false;
    /**
     * Cut off ID
     */
    private String endId;
    /**
     * Delegate List
     */
    private List<MixDelegateOrderResult> orderList;
}
