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
    /**
     * place an order
     * @param $placeOrderReq
     * @return string
     */
    public function placeOrder(PlaceOrderReq $placeOrderReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placeOrder", $placeOrderReq);
    }
    /**
     * Place orders in batches
     * @param $batchOrdersReq
     * @return string
     */
    public function batchOrders(BatchOrdersReq $batchOrdersReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/batch-orders", $batchOrdersReq);
    }
    /**
     * cancel the order
     * @param $cancelOrderReq
     * @return string
     */
    public function cancelOrder(CancelOrderReq $cancelOrderReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancel-order", $cancelOrderReq);
    }
    /**
     * Batch cancellation
     * @param $cancelBatchOrderReq
     * @return string
     */
    public function cancelBatchOrder(CancelBatchOrderReq $cancelBatchOrderReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancel-batch-orders", $cancelBatchOrderReq);
    }
    /**
     * Get Historical Delegation
     * @param $symbol
     * @param $startTime
     * @param $endTime
     * @param $pageSize
     * @param $lastEndId
     * @param $isPre
     * @return string
     */
    public function history(string $symbol, string $startTime, string $endTime, string $pageSize, string $lastEndId, string $isPre): string
    {
        $params = array("symbol" => $symbol, "startTime" => $startTime, "endTime" => $endTime, "pageSize" => $pageSize, "lastEndId" => $lastEndId, "isPre" => $isPre);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/history", $params);
    }

    /**
     * Get the current delegate
     * @param $symbol
     * @return string
     */
    public function current(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/current", $params);
    }
    /**
     * Get order details
     * @param $symbol
     * @param $orderId
     * @return string
     */
    public function detail(string $symbol, string $orderId): string
    {
        $params = array("symbol" => $symbol, "orderId" => $orderId);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/detail", $params);
    }
    /**
     * Query transaction details
     * @param $symbol
     * @param $orderId
     * @return string
     */
    public function fills(string $symbol, string $orderId): string
    {
        $params = array("symbol" => $symbol, "orderId" => $orderId);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/fills", $params);
    }


}