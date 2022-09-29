package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

/**
 * @author hupf
 */
@Data
@Builder
public class PlaceOrderBaseParam {

    private static final long serialVersionUID = -7008876848185925619L;
    /**
     * Client ID
     */
    private String clientOid;
    /**
     * Amount of currency placed
     */
    private BigDecimal size;
    /**
     * 1: Kaiduo 2: Kaikong 3: Pingduo 4: Pingkong
     */
    private String side;
    /**
     * Order Type
     */
    private String orderType;
    /**
     * Entrusted price
     */
    private BigDecimal price;

    private String timeInForceValue;

}
