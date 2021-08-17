package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersRequest;
import com.bitget.openapi.dto.request.mix.MixCancelOrderRequest;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderRequest;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface MixOrderService {


    ResponseResult placeOrder(MixPlaceOrderRequest mixPlaceOrderRequest) throws IOException;

    ResponseResult batchOrders(PlaceBatchOrderRequest placeBatchOrderRequest) throws IOException;

    ResponseResult cancelOrder(MixCancelOrderRequest mixCancelOrderRequest) throws IOException;

    ResponseResult cancelBatchOrder(MixCancelBatchOrdersRequest mixCancelBatchOrdersRequest) throws IOException;

    ResponseResult history(String symbol, String startTime, String endTime, int pageSize, String lastEndId, boolean isPre) throws IOException;

    ResponseResult current(String symbol) throws IOException;

    ResponseResult detail(String symbol, String orderId) throws IOException;

    ResponseResult fills(String symbol, String orderId) throws IOException;
}
