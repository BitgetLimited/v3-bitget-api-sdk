package com.bitget.openapi.api.broker;

import com.bitget.openapi.dto.request.broker.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface BrokerAccountApi {

    /**
     * get broker info
     * @return ResponseResult
     */
    @GET("/api/broker/v1/account/info")
    Call<ResponseResult> info();

    /**
     * sub create
     * @return ResponseResult
     */
    @POST("/api/broker/v1/account/sub-create")
    Call<ResponseResult> subCreate(@Body BrokerSubCreateReq req);


    /**
     * get sub info list
     * @return ResponseResult
     */
    @GET("/api/broker/v1/account/sub-list")
    Call<ResponseResult> subList(@Query("pageSize")int pageSize,
                                 @Query("lastEndId") String lastEndId,
                                 @Query("status")String status);


    /**
     * sub modify
     * @return ResponseResult
     */
    @POST("/api/broker/v1/account/sub-modify")
    Call<ResponseResult> subModify(@Body BrokerSubModifyReq req);


    /**
     * sub bind email
     * @return ResponseResult
     */
    @POST("/api/broker/v1/account/sub-modify-email")
    Call<ResponseResult> subModifyEmail(@Body BrokerSubModifyEmailReq req);


    /**
     * get sub email
     * @return ResponseResult
     */
    @GET("/api/broker/v1/account/sub-email")
    Call<ResponseResult> subEmail(@Query("subUid") String subUid);

    /**
     * get sub spot account list
     * @return ResponseResult
     */
    @GET("/api/broker/v1/account/sub-spot-assets")
    Call<ResponseResult> subSpotAssets(@Query("subUid") String subUid);


    /**
     * get sub future account list
     * @return ResponseResult
     */
    @GET("/api/broker/v1/account/sub-future-assets")
    Call<ResponseResult> subFutureAssets(@Query("subUid") String subUid,
                                         @Query("productType") String productType);


    /**
     * get sub deposit address
     * @return ResponseResult
     */
    @POST("/api/broker/v1/account/sub-address")
    Call<ResponseResult> subDepositAddress(@Body BrokerSubAddressReq req);

    /**
     * sub withdraw
     * @return ResponseResult
     */
    @POST("/api/broker/v1/account/sub-withdrawal")
    Call<ResponseResult> subWithdraw(@Body BrokerSubWithdrawReq req);


    /**
     * sub config auto transfer
     * @return ResponseResult
     */
    @POST("/api/broker/v1/account/sub-auto-transfer")
    Call<ResponseResult> subAutoTransfer(@Body BrokerSubTransferReq req);



}
