package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface SpotOrderService {

    ResponseResult orders(SpotOrderReq spotOrderReq) throws IOException;

    ResponseResult batchOrders(SpotBatchOrdersReq spotBatchOrdersReq) throws IOException;

    ResponseResult cancelOrder(SpotCancelOrderReq spotCancelOrderReq) throws IOException;

    ResponseResult cancelBatchOrder(SpotCancelBatchOrderReq spotCancelBatchOrderReq) throws IOException;

    ResponseResult orderInfo(SpotOrderInfoReq spotOrderInfoReq) throws IOException;

    ResponseResult openOrders(SpotOpenOrderReq spotOpenOrderReq) throws IOException;

    ResponseResult history(SpotHistoryOrderReq spotHistoryOrderReq) throws IOException;

    ResponseResult fills(SpotFillsOrderReq spotFillsOrderReq) throws IOException;
}
