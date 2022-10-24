package com.bitget.openapi.dto.request.spot;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotWithdrawalReq implements Serializable {

    private String coin;

    private String address;

    private String tag;

    private String chain;

    private String amount;

    private String remark;

    private String clientOid;

}
