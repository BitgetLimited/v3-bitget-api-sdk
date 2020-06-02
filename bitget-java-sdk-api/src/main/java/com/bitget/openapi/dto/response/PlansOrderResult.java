package com.bitget.openapi.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ( 计划委托订单结果 )
 * @author jian.li
 * @create 2020-05-29 12:36
 */
@Data
public class PlansOrderResult implements Serializable {
    private static final long serialVersionUID = -197235448471041897L;
    /**
     * 计划订单列表
     */
    private List<PlanOrder> list;
    /**
     * 是否有下页数据 true：是 false：否
     */
    private boolean nextPage;

}
