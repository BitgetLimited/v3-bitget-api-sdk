package com.bitget.openapi.dto.request.ws;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeReq {
    private String instType;
    private String channel;
    private String instId;
    private String coin;
}
