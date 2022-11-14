package com.bitget.openapi.api.broker;

import com.bitget.openapi.dto.request.broker.BrokerSubApiReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface BrokerManageApi {

    /**
     * sub create api
     * @return ResponseResult
     */
    @POST("/api/broker/v1/manage/sub-api-create")
    Call<ResponseResult> subApiCreate(@Body BrokerSubApiReq req);

    /**
     * sub api list
     * @return ResponseResult
     */
    @GET("/api/broker/v1/manage/sub-api-list")
    Call<ResponseResult> subApiList(@Query("subUid")String subUid);


    /**
     * sub modify api
     * @return ResponseResult
     */
    @POST("/api/broker/v1/manage/sub-api-modify")
    Call<ResponseResult> subApiModify(@Body BrokerSubApiReq req);

}
