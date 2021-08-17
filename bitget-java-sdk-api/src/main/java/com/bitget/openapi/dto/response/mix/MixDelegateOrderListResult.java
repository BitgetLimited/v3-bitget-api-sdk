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
     * 是否有下一页
     */
    private boolean nextFlag = false;
    /**
     * 截止id
     */
    private String endId;
    /**
     * 委托列表
     */
    private List<MixDelegateOrderResult> orderList;
}
