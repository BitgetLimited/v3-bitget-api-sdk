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

    @Override
    public boolean equals(Object o) {
        SubscribeReq that = (SubscribeReq) o;
        return Objects.equals(instType.toUpperCase(), that.instType.toUpperCase()) && Objects.equals(channel.toUpperCase(), that.channel.toUpperCase()) && Objects.equals(instId.toUpperCase(), that.instId.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(instType.toUpperCase(), channel.toUpperCase(), instId.toUpperCase());
    }
}
