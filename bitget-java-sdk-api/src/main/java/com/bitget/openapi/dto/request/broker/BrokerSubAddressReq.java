package com.bitget.openapi.dto.request.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerSubAddressReq implements Serializable {


    private String subUid;

    private String coin;

    private String chain;
}
