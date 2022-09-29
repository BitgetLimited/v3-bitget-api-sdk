package com.bitget.openapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ( Order List Query Object )
 *
 * @author jian.li
 * @create 2020-05-29 12:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderListReq implements Serializable {
    private static final long serialVersionUID = 3721944028616588183L;
    /**
     * Currency pair
     */
    private String symbol;
    /**

     * - 1: Cancelled (including risk triggered cancellation), 0: No deal, 1: Partial deal, 2: Full deal, 3: No deal or partial deal, 4: Cancelled (including risk triggered cancellation) or Full deal

     */
    private Integer status;
    /**
     * From and to are mainly the data of the page to be queried (1 by default)
     */
    private String from;
    /**
     * From and to are mainly the data of the page to be queried (1 by default)
     */
    private String to;
    /**
     * The maximum number of result sets returned by pages is 100. If it is not filled, 100 will be returned by default. If it is less than or equal to 0, an exception will be reported. If it is not a numeric character, an exception will be reported
     */
    private String limit;


}
