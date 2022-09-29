package com.bitget.openapi.dto.response.mix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractPositionResult implements Serializable {

    private static final long serialVersionUID = 5612256438518727605L;
    /**
     * Bin Id, PK4
     */
    private String positionId;
    /**
     * Business of the account
     */
    private String businessLine;
    /**
     * Asset Currency Id
     */
    private String marginCoin;

    /**
     * Currency pair of the position (symbol)
     */
    private String symbolId;

    /**
     * Direction of the position 1 LONG 2SHORT
     */
    private Integer holdSide;
    /**
     * Opening quantity
     */
    private BigDecimal openDelegateCount;

    /**
     *
     */
    private BigDecimal lockedMargin;

    /**
     * The deposit quantity under the balanceIdent+symbolId+holdSide, in tokenId
     */

    private BigDecimal margin;
    /**
     * The position quantity under the balanceIdent+symbolId+holdSide, in the left currency of the symbolId
     */
    private BigDecimal available;
    /**
     * The position locking quantity under the balanceIdent+symbolId+holdSide is generally the closing consignment quantity, and the unit is the left currency of the symbolId
     */
    private BigDecimal locked;

    private BigDecimal total;
    /**

     *The leverage multiple under the balanceident+symbolId+holdSide mode

     *The leverage is the same

     */
    private Integer leverage;

    /**
     * The realized profit and loss under the balanceIdent+symbolId+holdSide is recorded Unit: tokenId
     */
    private BigDecimal achievedProfits;

    /**
     * The average opening price under the balanceIdent+symbolId+holdSide. Right currency in symbolId
     */
    private BigDecimal averageOpenPrice;

    /**
     * Position status under the balanceIdent+symbolId+holdSide
     */
    private Integer status;
    /**

     * Margin mode

     * 1. In the warehouse by warehouse mode, the deposit supports a single direction of a single currency pair,

     * 2 In the full warehouse mode, the deposit supports a single currency pair in all directions;

     */
    private Integer marginMode;

    /**
     *Position mode 1: one-way position, 2: two-way position. Now the default is two-way position
     */
    private Integer holdMode;
    /**
     *Automatic margin increase
     */
    private Integer autoAppendMargin;

    private String createTime;

    private String updateTime;

    private BigDecimal reducePrice;
}
