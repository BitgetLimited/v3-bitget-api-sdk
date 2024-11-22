<?php


namespace bitget\api\v1;


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
        return $this->BitgetApiClient->doPost("/api/mix/v1/order/placeOrder", $params);
    }

    public function batchPlaceOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/order/batch-orders", $params);
    }

    public function cancelOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/order/cancel-order", $params);
    }

    public function batchCancelOrders($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/order/cancel-batch-orders", $params);
    }

    public function ordersHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/order/history", $params);
    }

    public function ordersPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/order/current", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/order/fills", $params);
    }


    // plan
    public function placePlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/plan/placePlan", $params);
    }

    public function cancelPlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/plan/cancelPlan", $params);
    }

    public function ordersPlanPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/plan/currentPlan", $params);
    }

    public function ordersPlanHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/plan/historyPlan", $params);
    }


    // trader
    public function traderOrderClosePositions($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/trace/closeTrackOrder", $params);
    }

    public function traderOrderCurrentTrack($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/trace/currentTrack", $params);
    }

    public function traderOrderHistoryTrack($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/trace/historyTrack", $params);
    }

}