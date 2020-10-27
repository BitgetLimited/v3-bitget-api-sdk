package com.bitget.openapi.api;

import com.bitget.openapi.dto.request.CloseTrackOrderReq;
import com.bitget.openapi.dto.response.CloseTrackOrderResult;
import com.bitget.openapi.dto.response.ContractTrackOrderResult;
import com.bitget.openapi.dto.response.HistoryTraceResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface TraceApi {

    /**
     * 下单平仓单
     * @return
     */
    @POST("/api/swap/v3/trace/closeTrackOrder")
    Call<CloseTrackOrderResult> closeTrackOrder(@Body CloseTrackOrderReq orderReq);

    /**
     * 获取交易员当前带单list
     *
     * @return
     */
    @GET("/api/swap/v3/trace/currentTrack")
    Call<List<ContractTrackOrderResult>> currentTrack(@Query("symbol") String symbol,
                                                      @Query("pageIndex") String pageIndex,
                                                      @Query("pageSize") String pageSize);

    /**
     * 获取历史带单列表
     *
     * @return
     */
    @GET("/api/swap/v3/trace/historyTrack")
    Call<List<HistoryTraceResult>> historyTrack(@Query("symbol") String symbol,
                                                @Query("pageIndex") String pageIndex,
                                                @Query("pageSize") String pageSize,
                                                @Query("createDate") Integer createDate);


}
