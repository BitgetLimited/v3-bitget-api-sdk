package com.bitget.openapi.dto.response.spot;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SpotCurrencyInfoResult implements Serializable {


    /**
     * 币种ID
     */
    private String coinId;

    /**
     * 币种名称
     */
    private String coinName;

    /**
     * 知否支持转账 true/false
     */
    private String transfer;

    private List<ChainInfoResult> chains = new ArrayList<>();
}
