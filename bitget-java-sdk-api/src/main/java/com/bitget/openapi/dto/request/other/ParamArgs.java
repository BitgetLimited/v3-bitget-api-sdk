package com.bitget.openapi.dto.request.other;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 * @author hpf
 */
@Builder
@AllArgsConstructor
@Data
public class ParamArgs {

    @JSONField(ordinal = 1)
    private String channel;

    @JSONField(ordinal = 2)
    private String instType;

    @JSONField(ordinal = 3)
    private String instId;
}
