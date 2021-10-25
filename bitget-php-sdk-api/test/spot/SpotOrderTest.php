<?php


namespace test\spot;


use bitget\api\spot\SpotOrderApi;
use bitget\internal\BitgetRestClient;
use bitget\model\spot\order\BatchOrdersReq;
use bitget\model\spot\order\CancelBatchOrderReq;
use bitget\model\spot\order\CancelOrderReq;
use bitget\model\spot\order\FillsReq;
use bitget\model\spot\order\HistoryReq;
use bitget\model\spot\order\OpenOrdersReq;
use bitget\model\spot\order\OrderInfoReq;
use bitget\model\spot\order\OrdersReq;
use bitget\model\spot\order\SpotOrdersReq;

class SpotOrderTest
{
    var SpotOrderApi $spotOrderApi;

    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->spotOrderApi=$restClient->getSpotClient()->getOrderApi();
    }

    public function testOrders():string
    {
        $ordersReq = new OrdersReq();
        $ordersReq->setSymbol("bftusdt_spbl");
        $ordersReq->setPrice("2.68111");
        $ordersReq->setQuantity("10");
        $ordersReq->setSide("buy");
        $ordersReq->setOrderType("limit");
        $ordersReq->setForce("normal");
        return $this->spotOrderApi->orders($ordersReq);

    }

    public function testBatchOrders():string
    {
        $batchOrdersReq = new BatchOrdersReq();
        $batchOrdersReq->setSymbol("bftusdt_spbl");

        $spotOrdersReqOne = new SpotOrdersReq();
        $spotOrdersReqOne->setForce("normal");
        $spotOrdersReqOne->setOrderType("limit");
        $spotOrdersReqOne->setSide("buy");
        $spotOrdersReqOne->setQuantity("1");
        $spotOrdersReqOne->setPrice("2.60222");
        $spotOrdersReqOne->setClientOrderId("spot#1625039618000");

        $spotOrdersReqTow = new SpotOrdersReq();
        $spotOrdersReqTow->setForce("normal");
        $spotOrdersReqTow->setOrderType("limit");
        $spotOrdersReqTow->setSide("buy");
        $spotOrdersReqTow->setQuantity("1");
        $spotOrdersReqTow->setPrice("2.60111");
        $spotOrdersReqTow->setClientOrderId("spot#1625039618122");

        $orderList = array($spotOrdersReqOne,$spotOrdersReqTow);

        $batchOrdersReq->setOrderList($orderList);
        return $this->spotOrderApi->batchOrders($batchOrdersReq);

    }

    public function testCancelOrder():string
    {
        $cancelOrderReq = new CancelOrderReq();
        $cancelOrderReq->setSymbol("bftusdt_spbl");
        $cancelOrderReq->setOrderId("");
        return $this->spotOrderApi->cancelOrder($cancelOrderReq);
    }

    public function testCancelBatchOrder():string
    {
        $cancelBatchOrderReq = new CancelBatchOrderReq();
        $cancelBatchOrderReq->setSymbol("bftusdt_spbl");
        $cancelBatchOrderReq->setOrderIds(array("",""));
        return $this->spotOrderApi->cancelBatchOrder($cancelBatchOrderReq);

    }

    public function testOrderInfo():string
    {
        $orderInfoReq = new OrderInfoReq();
        $orderInfoReq->setSymbol("bftusdt_spbl");
        $orderInfoReq->setClientOrderId("");
        $orderInfoReq->setOrderId("");
        return $this->spotOrderApi->orderInfo($orderInfoReq);

    }

    public function testOpenOrders():string
    {
        $openOrdersReq = new OpenOrdersReq();
        $openOrdersReq->setSymbol("bftusdt_spbl");

        return $this->spotOrderApi->openOrders($openOrdersReq);

    }

    public function testHistory():string
    {
        $historyReq = new HistoryReq();
        $historyReq->setSymbol("bftusdt_spbl");

        return $this->spotOrderApi->history($historyReq);

    }
    public function testFills():string
    {
        $fillsReq = new FillsReq();
        $fillsReq->setSymbol("bftusdt_spbl");

        return $this->spotOrderApi->fills($fillsReq);

    }
}