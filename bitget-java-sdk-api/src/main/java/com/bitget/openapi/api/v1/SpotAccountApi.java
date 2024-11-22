package com.bitget.openapi.api.v1;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface SpotAccountApi {

    @GET("/api/spot/v1/account/getInfo")
    Call<ResponseResult> getInfo(@QueryMap Map<String, String> paramMap);

    @GET("/api/spot/v1/account/assets-lite")
    Call<ResponseResult> assetsLite(@QueryMap Map<String, String> paramMap);

    @POST("/api/spot/v1/account/bills")
    Call<ResponseResult> bills(@Body Map<String, String> paramMap);

    @GET("/api/spot/v1/account/transferRecords")
    Call<ResponseResult> transferRecords(@QueryMap Map<String, String> paramMap);
}
