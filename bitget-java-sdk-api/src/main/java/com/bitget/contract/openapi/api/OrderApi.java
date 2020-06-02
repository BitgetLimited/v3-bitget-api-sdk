package com.bitget.contract.openapi.api;

import com.bitget.contract.openapi.dto.request.*;
import com.bitget.contract.openapi.dto.response.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface OrderApi {

    /**
     * 下单
     *
     * @param body
     * @return
     */
    @POST("order/postOrder")
    Call<PlaceOrderResult> postOrder(@Body OrderReq body);

    /**
     * 批量下单
     *
     * @param body
     * @return
     */
    @POST("order/orders")
    Call<PlaceBatchOrderResult> batchOrders(@Body PlaceBatchOrderReq body);

    /**
     * 取消订单
     *
     * @param instrumentId
     * @param orderId
     * @return
     */
    @POST("order/cancel_order/{instrument_id}/{order_id}")
    Call<CancelOrderResult> cancelOrder(@Path("instrument_id") String instrumentId, @Path("order_id") String orderId);

    /**
     * 批量撤单
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @POST("order/cancel_batch_orders/{instrument_id}")
    Call<CancelBatchOrderResult> cancelBathOrders(@Path("instrument_id") String instrumentId, @Body CancelBatchOrdersReq body);

    /**
     * 获取单订单信息
     */
    @GET("order/orders/{instrument_id}/{order_id}")
    Call<Order> getOrderDetail(@Path("instrument_id") String instrumentId, @Path("order_id") String orderId);

    /**
     * 获取订单列表
     */
    @GET("order/orders/{instrument_id}")
    Call<List<Order>> getOrders(@Path("instrument_id") String instrumentId, @Body OrderListReq body);

    /**
     * 查询成交明细
     */
    @GET("order/fills")
    Call<List<Fill>> getFills(@Query("instrument_id") String instrumentId, @Query("order_id") String orderId);

    /**
     * 计划委托下单
     *
     * @param body
     * @return
     */
    @POST("order/postOrder")
    Call<PlanPlaceOrderResult> planOrder(@Body PlanPlaceOrderReq body);

    /**
     * 计划委托撤单
     *
     * @param instrumentId
     * @param orderId
     * @return
     */
    @POST("order/cancel_plan/{instrument_id}/{order_id}")
    Call<CancelPlanResult> cancelPlan(@Path("instrument_id") String instrumentId, @Path("order_id") String orderId);

    /**
     * 查询当前计划委托
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @POST("order/currentPlan/{instrument_id}")
    Call<PlansOrderResult> currentPlan(@Query("instrument_id") String instrumentId, @Body PlanOrderReq body);

    /**
     * 查询计划历史委托
     *
     * @param instrumentId
     * @param body
     * @return
     */
    @POST("order/historyPlan/{instrument_id}")
    Call<PlansOrderResult> historyPlan(@Query("instrument_id") String instrumentId, @Body PlanOrderReq body);

}
