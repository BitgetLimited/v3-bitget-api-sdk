<?php


namespace test\spot;


use bitget\api\spot\SpotPlanApi;
use bitget\internal\BitgetRestClient;
use bitget\model\spot\plan\SpotPlanReq;
use bitget\model\spot\plan\SpotModifyPlanReq;
use bitget\model\spot\plan\SpotCancelPlanReq;
use bitget\model\spot\plan\SpotQueryPlanReq;

class SpotPlanTest
{
    var SpotPlanApi $spotPlanApi;

    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->spotPlanApi=$restClient->getSpotClient()->getPlanApi();
    }

    public function testPlacePlan():string
    {
        $req = new SpotPlanReq();
        $req->setSymbol("BTCUSDT_SPBL");
        $req->setSide("buy");
        $req->setTriggerPrice("22031");
        $req->setExecutePrice("22031");
        $req->setSize("100");
        $req->setTriggerType("market_price");
        $req->setOrderType("market");
        $req->setTimeInForceValue("normal");
        return $this->spotPlanApi->placePlan($req);
    }

    public function testModifyPlan():string
    {
        $req = new SpotModifyPlanReq();
        $req->setOrderId("987136018723487744");
        $req->setTriggerPrice("22031");
        $req->setExecutePrice("22031");
        $req->setSize("50");
        $req->setOrderType("limit");
        return $this->spotPlanApi->modifyPlan($req);
    }

    public function testCancelPlan():string
    {
        $req = new SpotCancelPlanReq();
        $req->setOrderId("987136018723487744");
        return $this->spotPlanApi->cancelPlan($req);
    }

    public function testCurrentPlan():string
    {
        $req = new SpotQueryPlanReq();
        $req->setSymbol("BTCUSDT_SPBL");
        $req->setPageSize("5");
        return $this->spotPlanApi->currentPlan($req);
    }

    public function testHistoryPlan():string
    {
        $req = new SpotQueryPlanReq();
        $req->setSymbol("BTCUSDT_SPBL");
        $req->setPageSize("5");
        $req->setStartTime("1671005531000");
        $req->setEndTime("1671085652000");
        return $this->spotPlanApi->historyPlan($req);
    }
}