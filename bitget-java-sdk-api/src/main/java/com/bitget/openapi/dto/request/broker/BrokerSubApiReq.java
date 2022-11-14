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
public class BrokerSubApiReq implements Serializable {

    private String subUid;

    private String passphrase;

    private String remark;

    private String ip;

    private String perm = "readonly";
}
