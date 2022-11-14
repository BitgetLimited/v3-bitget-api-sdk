package com.bitget.openapi.service.broker;

import com.bitget.openapi.dto.request.broker.BrokerSubApiReq;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.io.IOException;

public interface BrokerManageService {

    /**
     * sub create api
     *
     * @return ResponseResult
     */
    ResponseResult subApiCreate( BrokerSubApiReq req) throws IOException;

    /**
     * sub api list
     *
     * @return ResponseResult
     */
    ResponseResult subApiList( String subUid) throws IOException;


    /**
     * sub modify api
     *
     * @return ResponseResult
     */
    ResponseResult subApiModify(BrokerSubApiReq req) throws IOException;
}
