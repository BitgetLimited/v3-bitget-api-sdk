package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Builder
@Data
public class MixCancelPlanRequest implements Serializable {


    private String orderId;

    private String symbol;

    private String planType;

    private String marginCoin;

}
