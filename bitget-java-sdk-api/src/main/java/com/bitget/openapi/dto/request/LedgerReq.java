package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LedgerReq implements Serializable {
    private static final long serialVersionUID = -4263036979877033084L;

    private String from;

    private String to;
    /**
     * Paging Size
     */
    private String limit;
    /**
     * Start time
     */
    private String startTime;
    /**
     * End time
     */
    private String endTime;
}
