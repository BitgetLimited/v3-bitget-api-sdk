package com.bitget.openapi.service.mix;

import com.bitget.openapi.dto.request.mix.MixCancelBatchOrdersReq;
import com.bitget.openapi.dto.request.mix.MixCancelOrderReq;
import com.bitget.openapi.dto.request.mix.MixPlaceOrderReq;
import com.bitget.openapi.dto.request.mix.PlaceBatchOrderReq;
import com.bitget.openapi.dto.response.ResponseResult;
import java.io.IOException;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Contract order service
 */
public interface MixOrderService {

    /**
     * place an order
     * @param mixPlaceOrderReq
     * @return ResponseResult
     */
    ResponseResult placeOrder(MixPlaceOrderReq mixPlaceOrderReq) throws IOException;

    /**
     * place an order
     * @param mixPlaceOrderReq
     * @return ResponseResult
     */
    ResponseResult proportionOrder(MixPlaceOrderReq mixPlaceOrderReq) throws IOException;

    /**
     * Place orders in batches
     * @param placeBatchOrderReq
     * @return ResponseResult
     */
    ResponseResult batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException;

    /**
     * cancel the order
     * @param mixCancelOrderReq
     * @return ResponseResult
     */
    ResponseResult cancelOrder(MixCancelOrderReq mixCancelOrderReq) throws IOException;

    /**
     * Batch cancellation
     * @param mixCancelBatchOrdersReq
     * @return ResponseResult
     */
    ResponseResult cancelBatchOrder(MixCancelBatchOrdersReq mixCancelBatchOrdersReq) throws IOException;

    /**
     * Get Historical Delegation
     * @param symbol
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param lastEndId
     * @param isPre
     * @return ResponseResult
     */
    ResponseResult history(String symbol, String startTime, String endTime, int pageSize, String lastEndId, boolean isPre) throws IOException;

    /**
     * Get the current delegate
     * @param symbol
     * @return ResponseResult
     */
    ResponseResult current(String symbol) throws IOException;

    /**
     * Get order details
     * @param symbol
     * @param orderId
     * @return ResponseResult
     */
    ResponseResult detail(String symbol, String orderId) throws IOException;

    /**
     * Query transaction details
     * @param symbol
     * @param orderId
     * @return ResponseResult
     */
    ResponseResult fills(String symbol, String orderId) throws IOException;
}
