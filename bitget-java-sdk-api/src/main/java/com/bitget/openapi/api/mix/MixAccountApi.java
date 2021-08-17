package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface MixAccountApi {


    @GET("/api/mix/v1/account/account")
    Call<ResponseResult> account(@Query("symbol") String symbol,
                                 @Query("marginCoin") String marginCoin);


    @POST("/api/mix/v1/account/setLeverage")
    Call<ResponseResult> leverage(@Body MixChangeLeverageRequest mixChangeLeverageRequest);


    @POST("/api/mix/v1/account/setMargin")
    Call<ResponseResult> margin(@Body MixAdjustMarginFixRequest mixAdjustMarginFixRequest);

    @POST("/api/mix/v1/account/setMarginMode")
    Call<ResponseResult> marginMode(@Body AdjustMarginModeRequest adjustMarginModeRequest);

    @POST("/api/mix/v1/account/setPositionMode")
    Call<ResponseResult> positionMode(@Body AdjustHoldModeRequest adjustHoldModeRequest);

    @POST("/api/mix/v1/account/open-count")
    Call<ResponseResult> openCount(@Body MixOpenCountRequest mixOpenCountRequest);
}
