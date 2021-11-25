package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersRequest;
import com.bitget.openapi.dto.request.mix.MixCancelOrderRequest;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderRequest;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderRequest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.dto.response.mix.MixDelegateOrderListResult;
import com.bitget.openapi.dto.response.mix.MixDelegateOrderResult;
import com.bitget.openapi.dto.response.mix.MixFillRecordResult;
import com.bitget.openapi.dto.response.mix.PlaceOrderResult;

import java.io.IOException;
import java.util.List;

public interface MixOrderService {


    ResponseResult placeOrder(MixPlaceOrderRequest mixPlaceOrderRequest) throws IOException;

    ResponseResult proportionOrder(MixPlaceOrderRequest mixPlaceOrderRequest) throws IOException;


    ResponseResult batchOrders(PlaceBatchOrderRequest placeBatchOrderRequest) throws IOException;

    ResponseResult cancelOrder(MixCancelOrderRequest mixCancelOrderRequest) throws IOException;

    ResponseResult cancelBatchOrder(MixCancelBatchOrdersRequest mixCancelBatchOrdersRequest) throws IOException;

    ResponseResult history(String symbol, String startTime, String endTime, int pageSize, String lastEndId, boolean isPre) throws IOException;

    ResponseResult current(String symbol) throws IOException;

    ResponseResult detail(String symbol, String orderId) throws IOException;

    ResponseResult fills(String symbol, String orderId) throws IOException;
}
