package com.bitget.openapi.api;

import com.bitget.openapi.dto.response.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author fengqiyuan
 * @date 2021/3/16 11:48 AM
 */
public interface TraceProfitApi {
    /**
     * 累计已分润、预计待分润、昨日分润
     * @return
     */
    @GET(value = "/api/swap/v3/trace/summary")
    Call<TotalProfitInfoResult> totalProfitInfo();

    /**
     * 历史分润
     *
     * @return
     */
    @GET(value = "/api/swap/v3/trace/profitDateGroupList")
    Call<PageResult<ProfitDateGroupResponseResult>> profitHisList(@Query("pageIndex") Integer pageNo,
                                                                  @Query("pageSize") Integer pageSize);

    /**
     * 历史分润明细
     *
     * @return
     */
    @GET(value = "/api/swap/v3/trace/profitDateList")
    Call<PageResult<ProfitDateDetailResponseResult>> profitHisDetail(@Query("settleTokenId") String settleTokenId,
                                                                     @Query("pageIndex") Integer pageNo,
                                                                     @Query("pageSize") Integer pageSize,
                                                                     @Query("date") Long date);
    /**
     * 待分润明细列表
     *
     * @return
     */
    @GET(value = "/api/swap/v3/trace/waitProfitDateList")
    Call<PageResult<ProfitDateDetailResponseResult>> waitProfitDetail(@Query("pageIndex") Integer pageNo,
                                                                      @Query("pageSize") Integer pageSize);

    /**
     * 累积已分润列表
     *
     * @return
     */
    @GET(value = "/api/swap/v3/trace/profitSettleTokenIdGroup")
    Call<List<ProfitSymbolGroupResult>> getSumProfitList();
}
