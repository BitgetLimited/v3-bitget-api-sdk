package com.bitget.openapi.api.mix;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MixPositionApi {


    @GET("/api/mix/v1/position/singlePosition")
    Call<ResponseResult> singlePosition(@Query("symbol") String symbol,
                                        @Query("marginCoin") String marginCoin);

    @GET("/api/mix/v1/position/allPosition")
    Call<ResponseResult> allPosition(@Query("productType") String productType,
                                     @Query("marginCoin") String marginCoin);
}
