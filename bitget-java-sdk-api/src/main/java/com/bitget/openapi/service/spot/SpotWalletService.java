package com.bitget.openapi.service.spot;

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

import java.io.IOException;

public interface SpotWalletService {

    /**
     * transfer
     * @param body
     * @return ResponseResult
     */
    ResponseResult transfer( SpotTransferReq body) throws IOException;;


    /**
     * subTransfer
     * @param body
     * @return ResponseResult
     */
    ResponseResult subTransfer( SpotSubTransferReq body) throws IOException;;

    /**
     * get deposit address
     * @return ResponseResult
     */
    ResponseResult depositAddress(String coin,
                                        String chain) throws IOException;;

    /**
     * withdrawal
     * @return ResponseResult
     */
    ResponseResult withdrawal(SpotWithdrawalReq body) throws IOException;;

    /**
     * withdrawal-inner
     * @return ResponseResult
     */
    ResponseResult withdrawalInner(SpotWithdrawalInnerReq body) throws IOException;;


    /**
     * get withdrawal record list
     * @return ResponseResult
     */
    ResponseResult withdrawalList(String coin,
                                         String startTime,
                                         String endTime,
                                         Integer pageNo,
                                         Integer pageSize) throws IOException;;

    /**
     * get deposit record list
     * @return ResponseResult
     */
    ResponseResult depositList(String coin,
                                      String startTime,
                                      String endTime,
                                      Integer pageNo,
                                      Integer pageSize) throws IOException;;
}
