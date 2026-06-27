<?php


namespace bitget\api\v1;


use bitget\internal\BitgetApiClient;

class SpotOrderApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    // normal order
    public function placeOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trade/orders", $params);
    }

    public function batchPlaceOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trade/batch-orders", $params);
    }

    public function cancelOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trade/cancel-order", $params);
    }

    public function batchCancelOrders($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trade/cancel-batch-orders", $params);
    }

    public function ordersHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/trade/history", $params);
    }

    public function ordersPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/trade/open-orders", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/trade/fills", $params);
    }


    // plan
    public function placePlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/plan/placePlan", $params);
    }

    public function cancelPlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/plan/cancelPlan", $params);
    }

    public function ordersPlanPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/plan/currentPlan", $params);
    }

    public function ordersPlanHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/plan/historyPlan", $params);
    }


    // trader
    public function traderOrderCloseTracking($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trace/order/closeTrackingOrder", $params);
    }

    public function traderOrderCurrentTrack($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trace/order/orderCurrentList", $params);
    }

    public function traderOrderHistoryTrack($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/trace/order/orderHistoryList", $params);
    }

}