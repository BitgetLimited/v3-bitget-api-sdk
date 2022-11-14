package com.bitget.openapi.service.broker;

import com.bitget.openapi.dto.request.broker.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.io.IOException;

public interface BrokerAccountService {

    /**
     * get broker info
     * @return ResponseResult
     */
    ResponseResult info()  throws IOException;

    /**
     * sub create
     * @return ResponseResult
     */
    ResponseResult subCreate(BrokerSubCreateReq req)  throws IOException;


    /**
     * get sub info list
     * @return ResponseResult
     */
    ResponseResult subList(int pageSize,
                                  String lastEndId,
                                 String status)  throws IOException;


    /**
     * sub modify
     * @return ResponseResult
     */
    ResponseResult subModify(BrokerSubModifyReq req)  throws IOException;


    /**
     * sub bind email
     * @return ResponseResult
     */
    ResponseResult subModifyEmail( BrokerSubModifyEmailReq req)  throws IOException;


    /**
     * get sub email
     * @return ResponseResult
     */
    ResponseResult subEmail( String subUid)  throws IOException;

    /**
     * get sub spot account list
     * @return ResponseResult
     */
    ResponseResult subSpotAssets( String subUid)  throws IOException;


    /**
     * get sub future account list
     * @return ResponseResult
     */
    ResponseResult subFutureAssets(String subUid,
                                         String productType)  throws IOException;


    /**
     * get sub deposit address
     * @return ResponseResult
     */
    ResponseResult subDepositAddress(BrokerSubAddressReq req)  throws IOException;

    /**
     * sub withdraw
     * @return ResponseResult
     */
    ResponseResult subWithdraw(BrokerSubWithdrawReq req)  throws IOException;

    /**
     * sub config auto transfer
     * @return ResponseResult
     */
    ResponseResult subAutoTransfer( BrokerSubTransferReq req)  throws IOException;
}
