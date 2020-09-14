package com.bitget.openapi.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChangeHoldModel {

    private  Integer holdModel;
    private  String  symbol;
}
