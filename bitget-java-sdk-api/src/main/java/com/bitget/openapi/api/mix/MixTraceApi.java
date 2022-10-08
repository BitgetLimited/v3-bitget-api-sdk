package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: mix trace api
 */
public interface MixTraceApi {

    /**
     * Dealer closing interface
     * @param mixCloseTrackOrderReq
     * @return ResponseResult
     */
    @POST("/api/mix/v1/trace/closeTrackOrder")
    Call<ResponseResult> closeTraceOrder(@Body MixCloseTrackOrderReq mixCloseTrackOrderReq);

    /**
     * The trader obtains the current order
     * @param symbol
     * @param productType
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/currentTrack")
    Call<ResponseResult> currentTrack(@Query("symbol") String symbol,
                                      @Query("productType") String productType,
                                      @Query("pageSize") int pageSize,
                                      @Query("pageNo") int pageNo);

    /**
     * The trader obtains the historical order
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/historyTrack")
    Call<ResponseResult> historyTrack(@Query("startTime") String startTime,
                                      @Query("endTime") String endTime,
                                      @Query("pageSize") int pageSize,
                                      @Query("pageNo") int pageNo);

    /**
     * Summary of traders' profit sharing
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/summary")
    Call<ResponseResult> summary();

    /**
     * Historical profit sharing summary of traders (by settlement currency)
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/profitSettleTokenIdGroup")
    Call<ResponseResult> profitSettleTokenIdGroup();

    /**
     * Historical profit sharing summary of traders (by settlement currency and date)
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/profitDateGroupList")
    Call<ResponseResult> profitDateGroupList(@Query("pageSize") int pageSize,
                                             @Query("pageNo") int pageNo);


    /**
     * Historical profit distribution details of traders
     * @param marginCoin
     * @param date
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/profitDateList")
    Call<ResponseResult> profitDateList(@Query("marginCoin") String marginCoin,
                                        @Query("date") String date,
                                        @Query("pageSize") int pageSize,
                                        @Query("pageNo") int pageNo);

    /**
     * Details of traders to be distributed
     * @param pageSize
     * @param pageNo
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/waitProfitDateList")
    Call<ResponseResult> waitProfitDateList(@Query("pageSize") int pageSize,
                                             @Query("pageNo") int pageNo);

    /**
     * Followers obtain documentary information
     * @param pageSize
     * @param pageNo
     * @param startTime
     * @param endTime
     * @return ResponseResult
     */
    @GET("/api/mix/v1/trace/followerHistoryOrders")
    Call<ResponseResult> followerHistoryOrders(@Query("pageSize") String pageSize,
                                            @Query("pageNo") String pageNo,
                                            @Query("startTime") String startTime,
                                            @Query("endTime") String endTime);
}
