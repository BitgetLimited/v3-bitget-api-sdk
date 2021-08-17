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
     * 仓位Id, PK4
     */
    private String positionId;


    /**
     * 该帐户所在的业务
     */
    private String businessLine;


    /**
     * 保证金币种
     */
    private String marginCoin;

    /**
     * 该仓位所属的币对(symbol)
     */
    private String symbolId;

    /**
     * 该仓位所属的方向 1 LONG 2SHORT
     */
    private Integer holdSide;
    /**
     * 开仓数量
     */
    private BigDecimal openDelegateCount;

    /**
     *
     */
    private BigDecimal lockedMargin;

    /**
     * 该balanceIdent + symbolId + holdSide下的保证金数量, 单位为tokenId
     */
    private BigDecimal margin;

    /**
     * 该balanceIdent + symbolId + holdSide下的持仓数量， 单位为symbolId的左币种
     */
    private BigDecimal available;

    /**
     * 该balanceIdent + symbolId + holdSide下的持仓锁定数量，一般即平仓委托数量， 单位为symbolId的左币种
     */
    private BigDecimal locked;

    private BigDecimal total;

    /**
     * 该balanceident + symbolId + holdSide下的杠杆倍数, 全仓模式下，不同holdSide的
     * 杠杆倍数是一样的
     */
    private Integer leverage;

    /**
     * 该balanceIdent + symbolId + holdSide下的已实现盈亏，记录值. 单位为tokenId
     */
    private BigDecimal achievedProfits;

    /**
     * 该balanceIdent + symbolId + holdSide下的平均开仓价。 单位为symbolId的右币种
     */
    private BigDecimal averageOpenPrice;

    /**
     * 该balanceIdent + symbolId + holdSide下的仓位状态
     */
    private Integer status;


    /**
     * 保证金模式
     * 1逐仓模式,保证金支持单个币对的单个方向,
     * 2全仓模式，保证金支持单个币对所有方向;
     */
    private Integer marginMode;

    /**
     * 持仓模式 1单向持仓,2双向持仓 现在默认是双向持仓
     */
    private Integer holdMode;


    /**
     * 自动追加保证金
     */
    private Integer autoAppendMargin;

    private String createTime;

    private String updateTime;

    private BigDecimal reducePrice;
}
