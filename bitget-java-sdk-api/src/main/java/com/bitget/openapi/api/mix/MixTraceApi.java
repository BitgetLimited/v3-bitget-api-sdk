package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.request.mix.MixCloseTrackOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MixTraceApi {

    @POST("/api/mix/v1/trace/closeTrackOrder")
    Call<ResponseResult> closeTraceOrder(@Body MixCloseTrackOrderRequest mixCloseTrackOrderRequest);

    @GET("/api/mix/v1/trace/currentTrack")
    Call<ResponseResult> currentTrack(@Query("symbol") String symbol,
                                      @Query("productType") String productType,
                                      @Query("pageSize") int pageSize,
                                      @Query("pageNo") int pageNo);

    @GET("/api/mix/v1/trace/historyTrack")
    Call<ResponseResult> historyTrack(@Query("startTime") String startTime,
                                      @Query("endTime") String endTime,
                                      @Query("pageSize") int pageSize,
                                      @Query("pageNo") int pageNo);

    @GET("/api/mix/v1/trace/summary")
    Call<ResponseResult> summary();


    @GET("/api/mix/v1/trace/profitSettleTokenIdGroup")
    Call<ResponseResult> profitSettleTokenIdGroup();

    @GET("/api/mix/v1/trace/profitDateGroupList")
    Call<ResponseResult> profitDateGroupList(@Query("pageSize") int pageSize,
                                             @Query("pageNo") int pageNo);

    @GET("/api/mix/v1/trace/profitDateList")
    Call<ResponseResult> profitDateList(@Query("marginCoin") String marginCoin,
                                        @Query("date") String date,
                                        @Query("pageSize") int pageSize,
                                        @Query("pageNo") int pageNo);


    @GET("/api/mix/v1/trace/waitProfitDateList")
    Call<ResponseResult> waitProfitDateList(@Query("pageSize") int pageSize,
                                             @Query("pageNo") int pageNo);
}
