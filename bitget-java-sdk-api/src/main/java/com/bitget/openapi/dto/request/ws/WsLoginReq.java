package com.bitget.openapi.dto.request.ws;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WsLoginReq {
    private String apiKey;
    private String passphrase;
    private String timestamp;
    private String sign;
}
