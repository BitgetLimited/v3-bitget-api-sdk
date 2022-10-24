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
public class SpotWithdrawalInnerReq implements Serializable {

    private String coin;

    private String toUid;

    private String amount;

    private String clientOid;

}
