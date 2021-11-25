package com.bitget.openapi.service;

import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.response.*;

import java.io.IOException;
import java.util.List;

/**
 * @author fengqiyuan
 * @date 2021/3/16 11:48 AM
 */
public interface TraceProfitService {
    /**
     * 累计已分润、预计待分润、昨日分润
     * @return
     */
    JSONObject totalProfitInfo() throws IOException;

    /**
     * 历史分润
     *
     * @return
     */
    JSONObject profitHisList(Integer pageIndex,
                                                            Integer pageSize) throws IOException;

    /**
     * 历史分润明细
     *
     * @return
     */
    JSONObject profitHisDetail(String settleTokenId,
                                                               Integer pageIndex,
                                                               Integer pageSize,
                                                               Long date) throws IOException;
    /**
     * 待分润明细列表
     *
     * @return
     */
    JSONObject waitProfitDetail(Integer pageIndex,
                                                                Integer pageSize) throws IOException;

    /**
     * 累积已分润列表
     *
     * @return
     */
    JSONObject getSumProfitList() throws IOException;
}
