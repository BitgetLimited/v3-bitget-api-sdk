package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FVirtualCaptialOperator implements Serializable {

    private static final long serialVersionUID = -2266194576148092059L;

    /**
     * 主键id
     */
    private  Integer fid;
    /**
     * 用户id
     */
    private  Long fuid;
    /**
     * 虚拟币id
     */
    private  Integer fcoinid;
    /**
     *资金
     */
    private  BigDecimal famount=BigDecimal.ZERO;
    /**
     * 费用
     */
    private  BigDecimal ffees=BigDecimal.ZERO;
    /**
     * btc费用
     */
    private  BigDecimal fbtcfees=BigDecimal.ZERO;
    /**
     *类型(1充值,2提现)
     */
    private  Integer ftype;
    /**
     * 状态（1-等待提现，2-正在处理，3-提现成功，4-用户撤销
     */
    private  Integer fstatus;
    /**
     * 提现地址tag
     */
    private  String ftag;
    /**
     * 提币时IP
     */
    private  String fip;
    /**
     * 是否为API提币
     */
    private  Integer fisfromapi;
    /**
     * 交易ID
     */
    private  String funiquenumber;
    /**
     * 提现地址
     */
    private  String fwithdrawaddress;
    /**
     * 充值地址
     */
    private  String frechargeaddress;
    /**
     * 创建时间
     */
    private  Date fcreatetime;
    /**
     * 更新时间
     */
    private  Date fupdatetime;
}
