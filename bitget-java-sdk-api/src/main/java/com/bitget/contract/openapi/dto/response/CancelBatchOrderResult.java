package com.bitget.contract.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelBatchOrderResult implements Serializable {

    private static final long serialVersionUID = 8126438671230139095L;
    private boolean result;
    private String instrument_id;
    private List<String> order_ids;
    private List<CancelOrderResult> fail_infos;
}
