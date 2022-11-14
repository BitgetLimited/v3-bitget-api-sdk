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
public class BrokerSubWithdrawReq implements Serializable {

    private String subUid;

    private String coin;

    private String address;

    private String tag;

    private String chain;

    private String amount;

    private String remark;

    private String clientOid;




}
