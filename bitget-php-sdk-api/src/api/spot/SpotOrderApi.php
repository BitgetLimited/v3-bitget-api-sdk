<?php


namespace bitget\api\spot;


use bitget\internal\BitgetApiClient;
use bitget\model\spot\order\BatchOrdersReq;
use bitget\model\spot\order\CancelBatchOrderReq;
use bitget\model\spot\order\CancelOrderReq;
use bitget\model\spot\order\FillsReq;
use bitget\model\spot\order\HistoryReq;
use bitget\model\spot\order\OpenOrdersReq;
use bitget\model\spot\order\OrderInfoReq;
use bitget\model\spot\order\OrdersReq;

class SpotOrderApi
{
    const BASE_URL = "/api/spot/v1/trade";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function orders(OrdersReq $ordersReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/orders", $ordersReq);
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

    public function orderInfo(OrderInfoReq $orderInfoReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/orderInfo", $orderInfoReq);
    }

    public function openOrders(OpenOrdersReq $openOrdersReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/open-orders", $openOrdersReq);
    }

    public function history(HistoryReq $historyReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/history", $historyReq);
    }

    public function fills(FillsReq $fillsReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/fills", $fillsReq);
    }

}