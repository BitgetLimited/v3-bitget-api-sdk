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
    @POST("/api/swap/v3/order/placeOrder")
    Call<PlaceOrderResult> placeOrder(@Body OrderReq body);

    /**
     * 批量下单
     *
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/batchOrders")
    Call<PlaceBatchOrderResult> batchOrders(@Body PlaceBatchOrderReq body);

    /**
     * 取消订单
     *
     * @param symbol
     * @param orderId
     * @return
     */
    @POST("/api/swap/v3/order/cancel_order")
    Call<CancelOrderResult> cancelOrder(@Query("symbol") String symbol, @Path("orderId") String orderId);

    /**
     * 批量撤单
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/cancel_batch_orders")
    Call<CancelBatchOrderResult> cancelBathOrders(@Query("symbol") String symbol, @Body CancelBatchOrdersReq body);

    /**
     * 获取单订单信息
     * @param symbol    合约code
     * @param orderId   订单ID
     * @return
     */
    @GET("/api/swap/v3/order/detail")
    Call<Order> getOrderDetail(@Query("symbol") String symbol, @Query("orderId") String orderId);

    /**
     * 获取订单列表
     * @param symbol    合约code
     * @param body      查询对象
     * @return
     */
    @GET("/api/swap/v3/order/orders")
    Call<List<Order>> getOrders(@Query("symbol") String symbol, @Body OrderListReq body);

    /**
     * 查询成交明细
     * @param symbol    合约code
     * @param orderId   订单ID
     * @return
     */
    @GET("/api/swap/v3/order/fills")
    Call<List<Fill>> getFills(@Query("symbol") String symbol, @Query("orderId") String orderId);

    /**
     * 计划委托下单
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/plan_order")
    Call<PlanPlaceOrderResult> planOrder(@Body PlanPlaceOrderReq body);

    /**
     * 计划委托撤单
     * @param symbol
     * @param orderId
     * @return
     */
    @POST("/api/swap/v3/order/cancel_plan")
    Call<CancelPlanResult> cancelPlan(@Query("symbol") String symbol, @Query("orderId") String orderId);

    /**
     * 查询当前计划委托
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/currentPlan")
    Call<PlansOrderResult> currentPlan(@Query("symbol") String symbol, @Body PlanOrderReq body);

    /**
     * 查询计划历史委托
     *
     * @param symbol
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/historyPlan")
    Call<PlansOrderResult> historyPlan(@Query("symbol") String symbol, @Body PlanOrderReq body);

}
