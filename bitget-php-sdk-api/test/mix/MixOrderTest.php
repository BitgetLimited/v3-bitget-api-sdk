<?php


namespace test\mix;


use bitget\api\mix\MixOrderApi;
use bitget\internal\BitgetRestClient;
use bitget\model\mix\order\BatchOrdersReq;
use bitget\model\mix\order\CancelBatchOrderReq;
use bitget\model\mix\order\CancelOrderReq;
use bitget\model\mix\order\PlaceOrderBaseParam;
use bitget\model\mix\order\PlaceOrderReq;

class MixOrderTest
{
    var MixOrderApi $mixOrderApi;

    /**
     * MixMarketTest constructor.
     */
    public function __construct()
    {
        $restClient = new BitgetRestClient();
        $this->mixOrderApi = $restClient->getMixClient()->getOrderApi();
    }

    public function testPlaceOrder()
    {
        $placeOrderReq = new PlaceOrderReq();
        $placeOrderReq->setClientOid("RFIut#15914567782322235");
        $placeOrderReq->setSymbol("SBTCSUSDT_SUMCBL");
        $placeOrderReq->setPrice("44067.0");
        $placeOrderReq->setSize("2");
        $placeOrderReq->setMarginCoin("SUSDT");
        $placeOrderReq->setSide("open_long");
        $placeOrderReq->setTimeInForceValue("normal");
        $placeOrderReq->setOrderType("market");
        return $this->mixOrderApi->placeOrder($placeOrderReq);
    }

    public function testBatchOrders()
    {

        $batchOrdersReq = new BatchOrdersReq();
        $batchOrdersReq->setSymbol("SBTCSUSDT_SUMCBL");
        $batchOrdersReq->setMarginCoin("SUSDT");

        $placeOrderBaseParamOne = new PlaceOrderBaseParam();
        $placeOrderBaseParamOne->setClientOid("RFIut#".(string)(time() * 1000));
        $placeOrderBaseParamOne->setPrice("46596");
        $placeOrderBaseParamOne->setSize("0.5");
        $placeOrderBaseParamOne->setSide("open_long");
        $placeOrderBaseParamOne->setTimeInForceValue("normal");
        $placeOrderBaseParamOne->setOrderType("limit");

        $placeOrderBaseParamTow = new PlaceOrderBaseParam();
        $placeOrderBaseParamTow->setClientOid("RFIut#".(string)(time() * 1000)."123");
        $placeOrderBaseParamTow->setPrice("46596");
        $placeOrderBaseParamTow->setSize("0.5");
        $placeOrderBaseParamTow->setSide("open_long");
        $placeOrderBaseParamTow->setTimeInForceValue("normal");
        $placeOrderBaseParamTow->setOrderType("limit");

        $dataList = array($placeOrderBaseParamOne, $placeOrderBaseParamTow);

        $batchOrdersReq->setOrderDataList($dataList);

        return $this->mixOrderApi->batchOrders($batchOrdersReq);
    }

    public function testCancelOrder(): string
    {
        $cancelOrderReq = new CancelOrderReq();
        $cancelOrderReq->setMarginCoin("SUSDT");
        $cancelOrderReq->setSymbol("SBTCSUSDT_SUMCBL");
        $cancelOrderReq->setOrderId("831289989378224130");
        return $this->mixOrderApi->cancelOrder($cancelOrderReq);
    }

    public function testCancelBatchOrder(): string
    {
        $cancelBatchOrder = new CancelBatchOrderReq();
        $cancelBatchOrder->setSymbol("SBTCSUSDT_SUMCBL");
        $cancelBatchOrder->setMarginCoin("SUSDT");
        $orders = array("831296644891422720","831296644992086017");
        $cancelBatchOrder->setOrderIds($orders);

        return $this->mixOrderApi->cancelBatchOrder($cancelBatchOrder);
    }

    public function testHistory(): string
    {
        $startTime  = strtotime(date('Y-m-d 00:00:00', time()))*1000;
        $endTime  = strtotime(date('Y-m-d 23:59:59', time()))*1000;
        return $this->mixOrderApi->history("SBTCSUSDT_SUMCBL",$startTime,$endTime,"20","","false");
    }

    public function testCurrent():string
    {
        return $this->mixOrderApi->current("SBTCSUSDT_SUMCBL");
    }

    public function testDetail():string
    {
        return $this->mixOrderApi->detail("SBTCSUSDT_SUMCBL","831300699831283713");
    }

    public function testFills():string
    {
        return $this->mixOrderApi->fills("SBTCSUSDT_SUMCBL","831300699831283713");
    }

}