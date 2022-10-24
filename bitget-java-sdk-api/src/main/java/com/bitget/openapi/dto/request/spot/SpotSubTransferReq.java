package com.bitget.openapi.dto.request.spot;

import java.io.Serializable;

public class SpotSubTransferReq implements Serializable {

    private String fromType;

    private String toType;

    private String amount;

    private String coin;

    private String clientOid;

    private String fromUserId;

    private String toUserId;
}
