package com.bitget.openapi.api.spot;

import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SpotOrderApi {


    @POST("/api/spot/v1/trade/orders")
    Call<ResponseResult> orders(@Body SpotOrderReq body);

    @POST("/api/spot/v1/trade/batch-orders")
    Call<ResponseResult> batchOrders(@Body SpotBatchOrdersReq body);

    @POST("/api/spot/v1/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body SpotCancelOrderReq body);

    @POST("/api/spot/v1/trade/cancel-batch-orders")
    Call<ResponseResult> cancelBatchOrder(@Body SpotCancelBatchOrderReq body);

    @POST("/api/spot/v1/trade/orderInfo")
    Call<ResponseResult> orderInfo(@Body SpotOrderInfoReq body);

    @POST("/api/spot/v1/trade/open-orders")
    Call<ResponseResult> openOrders(@Body SpotOpenOrderReq body);

    @POST("/api/spot/v1/trade/history")
    Call<ResponseResult> history(@Body SpotHistoryOrderReq body);

    @POST("/api/spot/v1/trade/fills")
    Call<ResponseResult> fills(@Body SpotFillsOrderReq body);
}
