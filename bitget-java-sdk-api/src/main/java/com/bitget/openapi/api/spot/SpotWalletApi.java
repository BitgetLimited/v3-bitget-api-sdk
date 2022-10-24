package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.request.spot.SpotSubTransferReq;
import com.bitget.openapi.dto.request.spot.SpotTransferReq;
import com.bitget.openapi.dto.request.spot.SpotWithdrawalInnerReq;
import com.bitget.openapi.dto.request.spot.SpotWithdrawalReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface SpotWalletApi {

    /**
     * transfer
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/wallet/transfer")
    Call<ResponseResult> transfer(@Body SpotTransferReq body);


    /**
     * subTransfer
     * @param body
     * @return ResponseResult
     */
    @POST("/api/spot/v1/wallet/subTransfer")
    Call<ResponseResult> subTransfer(@Body SpotSubTransferReq body);

    /**
     * get deposit address
     * @return ResponseResult
     */
    @GET("/api/spot/v1/wallet/deposit-address")
    Call<ResponseResult> depositAddress(@Query("coin")String coin,
                                        @Query("chain")String chain);

    /**
     * withdrawal
     * @return ResponseResult
     */
    @POST("/api/spot/v1/wallet/withdrawal")
    Call<ResponseResult> withdrawal(@Body SpotWithdrawalReq body);

    /**
     * withdrawal-inner
     * @return ResponseResult
     */
    @POST("/api/spot/v1/wallet/withdrawal-inner")
    Call<ResponseResult> withdrawalInner(@Body SpotWithdrawalInnerReq body);


    /**
     * get withdrawal record list
     * @return ResponseResult
     */
    @GET("/api/spot/v1/wallet/withdrawal-list")
    Call<ResponseResult> withdrawalList(@Query("coin")String coin,
                                        @Query("startTime") String startTime,
                                        @Query("endTime") String endTime,
                                        @Query("pageNo") Integer pageNo,
                                        @Query("pageSize") Integer pageSize);

    /**
     * get deposit record list
     * @return ResponseResult
     */
    @GET("/api/spot/v1/wallet/deposit-list")
    Call<ResponseResult> depositList(@Query("coin")String coin,
                                        @Query("startTime") String startTime,
                                        @Query("endTime") String endTime,
                                        @Query("pageNo") Integer pageNo,
                                        @Query("pageSize") Integer pageSize);


}
