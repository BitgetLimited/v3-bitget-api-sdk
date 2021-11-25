<?php


namespace test\mix;


use bitget\api\mix\MixTraceApi;
use bitget\internal\BitgetRestClient;
use bitget\model\mix\trace\CloseTrackOrderReq;

class MixTraceTest
{
    var MixTraceApi $mixTraceApi;
    /**
     * MixAccountTest constructor.
     */
    public function __construct()
    {
        $restClient = new BitgetRestClient();
        $this->mixTraceApi=$restClient->getMixClient()->getMixTraceApi();
    }
    public function testCloseTraceOrder():string
    {
        $closeTraceOrderReq = new CloseTrackOrderReq();
        $closeTraceOrderReq->setSymbol("BTCUSDT_UMCBL");
        $closeTraceOrderReq->setTrackingNo("0");
        return $this->mixTraceApi->closeTraceOrder($closeTraceOrderReq);
    }
    public function testCurrentTrack():string
    {
        return $this->mixTraceApi->currentTrack("BTCUSDT_UMCBL","umcbl","10","1");
    }

    public function testHistoryTrack():string
    {
        $startTime  = strtotime(date('Y-m-d 00:00:00', time()))*1000;
        $endTime  = strtotime(date('Y-m-d 23:59:59', time()))*1000;
        return $this->mixTraceApi->historyTrack($startTime,$endTime,"10","1");
    }

    public function testSummary():string
    {
        return $this->mixTraceApi->summary();
    }

    public function testProfitSettleTokenIdGroup():string
    {
        return $this->mixTraceApi->profitSettleTokenIdGroup();
    }

    public function testProfitDateGroupList():string
    {
        return $this->mixTraceApi->profitDateGroupList("10","1");
    }

    public function testProfitDateList():string
    {
        return $this->mixTraceApi->profitDateList("BTCUSDT_UMCBL","","10","1");
    }

    public function testWaitProfitDateList():string
    {
        return $this->mixTraceApi->waitProfitDateList("10","1");
    }

    public function testFollowerHistoryOrders():string
    {
        return $this->mixTraceApi->followerHistoryOrders("10","1","1635782400000","1635852263953");
    }
}