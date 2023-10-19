<?php


namespace bitget\api\v2;


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
        return $this->BitgetApiClient->doPost("/api/v2/spot/trade/place-order", $params);
    }

    public function batchPlaceOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/trade/batch-orders", $params);
    }

    public function cancelOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/trade/cancel-order", $params);
    }

    public function batchCancelOrders($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/trade/batch-cancel-order", $params);
    }

    public function ordersHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/trade/history-orders", $params);
    }

    public function ordersPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/trade/unfilled-orders", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/trade/fills", $params);
    }


    // plan
    public function placePlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/trade/place-plan-order", $params);
    }

    public function cancelPlanOrder($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/trade/cancel-plan-order", $params);
    }

    public function ordersPlanPending($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/trade/current-plan-order", $params);
    }

    public function ordersPlanHistory($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/trade/history-plan-order", $params);
    }


    // trader
    public function traderOrderCloseTracking($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/copy/spot-trader/order-close-tracking", $params);
    }

    public function traderOrderCurrentTrack($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/copy/spot-trader/order-current-track", $params);
    }

    public function traderOrderHistoryTrack($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/copy/spot-trader/order-history-track", $params);
    }

}