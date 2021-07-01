package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.request.spot.SpotBillQueryReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @Author: bitget-sdk-team
 * @Date: 2021-05-31 11:03
 * @DES:
 */
public interface SpotAccountApi {

    /**
     * 获取币币资产
     *
     * @return
     */
    @GET("/api/spot/v1/account/assets")
    Call<ResponseResult> assets();


    @POST("/api/spot/v1/account/bills")
    Call<ResponseResult> bills(@Body SpotBillQueryReq spotBillQueryReq);
}
