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
public class BrokerSubCreateReq implements Serializable {

    private String subName;

    private String remark;
}
