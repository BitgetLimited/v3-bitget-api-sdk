package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersReq;
import com.bitget.openapi.dto.request.mix.MixCancelOrderReq;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderReq;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface MixOrderService {


    ResponseResult placeOrder(MixPlaceOrderReq mixPlaceOrderReq) throws IOException;

    ResponseResult proportionOrder(MixPlaceOrderReq mixPlaceOrderReq) throws IOException;


    ResponseResult batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException;

    ResponseResult cancelOrder(MixCancelOrderReq mixCancelOrderReq) throws IOException;

    ResponseResult cancelBatchOrder(MixCancelBatchOrdersReq mixCancelBatchOrdersReq) throws IOException;

    ResponseResult history(String symbol, String startTime, String endTime, int pageSize, String lastEndId, boolean isPre) throws IOException;

    ResponseResult current(String symbol) throws IOException;

    ResponseResult detail(String symbol, String orderId) throws IOException;

    ResponseResult fills(String symbol, String orderId) throws IOException;
}
