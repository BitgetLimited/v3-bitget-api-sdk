package com.bitget.openapi.api;

import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;
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
    @POST("order/batchOrders")
    Call<PlaceBatchOrderResult> batchOrders(@Body PlaceBatchOrderReq body);

    /**
     * 取消订单
     *
     * @param symbol
     * @param orderId
     * @return
     */
    @POST("order/cancel_order")
    Call<CancelOrderResult> cancelOrder(@Query("symbol") String symbol, @Path("orderId") String orderId);

    /**
     * 批量撤单
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("order/cancel_batch_orders")
    Call<CancelBatchOrderResult> cancelBathOrders(@Query("symbol") String symbol, @Body CancelBatchOrdersReq body);

    /**
     * 获取单订单信息
     */
    @GET("order/detail")
    Call<Order> getOrderDetail(@Query("symbol") String symbol, @Query("order_id") String orderId);

    /**
     * 获取订单列表
     */
    @GET("order/orders")
    Call<List<Order>> getOrders(@Query("symbol") String symbol, @Body OrderListReq body);

    /**
     * 查询成交明细
     */
    @GET("order/fills")
    Call<List<Fill>> getFills(@Query("symbol") String symbol, @Query("order_id") String orderId);

    /**
     * 计划委托下单
     *
     * @param body
     * @return
     */
    @POST("order/plan_order")
    Call<PlanPlaceOrderResult> planOrder(@Body PlanPlaceOrderReq body);

    /**
     * 计划委托撤单
     *
     * @param symbol
     * @param orderId
     * @return
     */
    @POST("order/cancel_plan")
    Call<CancelPlanResult> cancelPlan(@Query("symbol") String symbol, @Query("orderId") String orderId);

    /**
     * 查询当前计划委托
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("order/currentPlan")
    Call<PlansOrderResult> currentPlan(@Query("symbol") String symbol, @Body PlanOrderReq body);

    /**
     * 查询计划历史委托
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("order/historyPlan")
    Call<PlansOrderResult> historyPlan(@Query("symbol") String symbol, @Body PlanOrderReq body);

}