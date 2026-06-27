<?php


namespace bitget\api\v2;


use bitget\internal\BitgetApiClient;

class MixOrderApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    // normal order
    public function placeOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/order/place-order", $params);
    }

    public function batchPlaceOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/order/batch-place-order", $params);
    }

    public function cancelOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/order/cancel-order", $params);
    }

    public function batchCancelOrders($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/order/batch-cancel-orders", $params);
    }

    public function ordersHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/order/orders-history", $params);
    }

    public function ordersPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/order/orders-pending", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/order/fills", $params);
    }


    // plan
    public function placePlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/order/place-plan-order", $params);
    }

    public function cancelPlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/order/cancel-plan-order", $params);
    }

    public function ordersPlanPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/order/orders-plan-pending", $params);
    }

    public function ordersPlanHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/order/orders-plan-history", $params);
    }


    // trader
    public function traderOrderClosePositions($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/copy/mix-trader/order-close-positions", $params);
    }

    public function traderOrderCurrentTrack($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/copy/mix-trader/order-current-track", $params);
    }

    public function traderOrderHistoryTrack($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/copy/mix-trader/order-history-track", $params);
    }

    public function followerClosePositions($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/copy/mix-follower/close-positions", $params);
    }

    public function followerQueryCurrentOrders($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/copy/mix-follower/query-current-orders", $params);
    }

    public function followerQueryHistoryOrders($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/copy/mix-follower/query-history-orders", $params);
    }

}