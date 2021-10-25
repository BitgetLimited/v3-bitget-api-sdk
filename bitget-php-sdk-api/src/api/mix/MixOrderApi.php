<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;
use bitget\model\mix\order\BatchOrdersReq;
use bitget\model\mix\order\CancelBatchOrderReq;
use bitget\model\mix\order\CancelOrderReq;
use bitget\model\mix\order\PlaceOrderReq;

class MixOrderApi
{
    const BASE_URL = "/api/mix/v1/order";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function placeOrder(PlaceOrderReq $placeOrderReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placeOrder", $placeOrderReq);
    }

    public function batchOrders(BatchOrdersReq $batchOrdersReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/batch-orders", $batchOrdersReq);
    }

    public function cancelOrder(CancelOrderReq $cancelOrderReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancel-order", $cancelOrderReq);
    }

    public function cancelBatchOrder(CancelBatchOrderReq $cancelBatchOrderReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancel-batch-orders", $cancelBatchOrderReq);
    }

    public function history(string $symbol, string $startTime, string $endTime, string $pageSize, string $lastEndId, string $isPre): string
    {
        $params = array("symbol" => $symbol, "startTime" => $startTime, "endTime" => $endTime, "pageSize" => $pageSize, "lastEndId" => $lastEndId, "isPre" => $isPre);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/history", $params);
    }

    public function current(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/current", $params);
    }

    public function detail(string $symbol, string $orderId): string
    {
        $params = array("symbol" => $symbol, "orderId" => $orderId);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/detail", $params);
    }

    public function fills(string $symbol, string $orderId): string
    {
        $params = array("symbol" => $symbol, "orderId" => $orderId);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/fills", $params);
    }


}