package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.request.spot.*;
import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: spot order service
 */
public interface SpotOrderService {

    /**
     * place an order
     * @param spotOrderReq
     * @return ResponseResult
     */
    ResponseResult orders(SpotOrderReq spotOrderReq) throws IOException;

    /**
     * Place orders in batches
     * @param spotBatchOrdersReq
     * @return ResponseResult
     */
    ResponseResult batchOrders(SpotBatchOrdersReq spotBatchOrdersReq) throws IOException;

    /**
     * cancel the order
     * @param spotCancelOrderReq
     * @return ResponseResult
     */
    ResponseResult cancelOrder(SpotCancelOrderReq spotCancelOrderReq) throws IOException;

    /**
     * Batch cancellation
     * @param spotCancelBatchOrderReq
     * @return ResponseResult
     */
    ResponseResult cancelBatchOrder(SpotCancelBatchOrderReq spotCancelBatchOrderReq) throws IOException;

    /**
     * Get order details
     * @param spotOrderInfoReq
     * @return ResponseResult
     */
    ResponseResult orderInfo(SpotOrderInfoReq spotOrderInfoReq) throws IOException;

    /**
     * Obtain orders that have not been closed or partially closed but not cancelled
     * @param spotOpenOrderReq
     * @return ResponseResult
     */
    ResponseResult openOrders(SpotOpenOrderReq spotOpenOrderReq) throws IOException;

    /**
     * Get historical delegation list
     * @param spotHistoryOrderReq
     * @return ResponseResult
     */
    ResponseResult history(SpotHistoryOrderReq spotHistoryOrderReq) throws IOException;

    /**
     * Obtain transaction details
     * @param spotFillsOrderReq
     * @return ResponseResult
     */
    ResponseResult fills(SpotFillsOrderReq spotFillsOrderReq) throws IOException;
}
