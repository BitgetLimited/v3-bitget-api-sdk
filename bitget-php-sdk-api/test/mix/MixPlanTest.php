<?php


namespace test\mix;


use bitget\api\mix\MixPlanApi;
use bitget\internal\BitgetRestClient;
use bitget\model\mix\plan\CancelPlanReq;
use bitget\model\mix\plan\ModifyPlanPresetReq;
use bitget\model\mix\plan\ModifyPlanReq;
use bitget\model\mix\plan\ModifyTPSLPlanReq;
use bitget\model\mix\plan\PlacePlanReq;
use bitget\model\mix\plan\PlaceTPSLReq;

class MixPlanTest
{
    var MixPlanApi $mixPlanApi;
    /**
     * MixAccountTest constructor.
     */
    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->mixPlanApi=$restClient->getMixClient()->getMixPlanApi();

    }

    public function testPlacePlan():string
    {
        $placePlanReq = new PlacePlanReq();
        $placePlanReq->setClientOid("RFIut#".(string)(time() * 1000));
        $placePlanReq->setSymbol("BTCUSDT_UMCBL");
        $placePlanReq->setTriggerPrice("45000.3");
        $placePlanReq->setExecutePrice("38923.1");
        $placePlanReq->setSize("1");
        $placePlanReq->setMarginCoin('USDT');
        $placePlanReq->setSide("open_long");
        $placePlanReq->setOrderType("limit");
        $placePlanReq->setTriggerType("fill_price");
        return $this->mixPlanApi->placePlan($placePlanReq);
    }

    public function testModifyPlan():string
    {
        $modifyPlanReq = new ModifyPlanReq();
        $modifyPlanReq->setOrderId("");
        $modifyPlanReq->setSymbol("BTCUSDT_UMCBL");
        $modifyPlanReq->setTriggerPrice("45000.3");
        $modifyPlanReq->setExecutePrice("38923.1");
        $modifyPlanReq->setMarginCoin('USDT');
        $modifyPlanReq->setOrderType("limit");
        $modifyPlanReq->setTriggerType("fill_price");
        return $this->mixPlanApi->modifyPlan($modifyPlanReq);
    }

    public function testModifyPlanPreset():string
    {
        $modifyPlanPresetReq = new ModifyPlanPresetReq();
        $modifyPlanPresetReq->setOrderId("");
        $modifyPlanPresetReq->setSymbol("BTCUSDT_UMCBL");
        $modifyPlanPresetReq->setMarginCoin('USDT');
        $modifyPlanPresetReq->setPresetStopLossPrice("55012.1");
        return $this->mixPlanApi->modifyPlanPreset($modifyPlanPresetReq);
    }

    public function testPlaceTPSL():string
    {
        $placeTPSLReq = new PlaceTPSLReq();
        $placeTPSLReq->setSymbol("BTCUSDT_UMCBL");
        $placeTPSLReq->setMarginCoin('USDT');
        $placeTPSLReq->setPlanType("profit_plan");
        $placeTPSLReq->setTriggerPrice("36888");
        $placeTPSLReq->setHoldSide("short");
        return $this->mixPlanApi->placeTPSL($placeTPSLReq);
    }

    public function testModifyTPSLPlan():string
    {
        $modifyTPSLPlanReq = new ModifyTPSLPlanReq();
        $modifyTPSLPlanReq->setOrderId("");
        $modifyTPSLPlanReq->setSymbol("BTCUSDT_UMCBL");
        $modifyTPSLPlanReq->setMarginCoin('USDT');
        $modifyTPSLPlanReq->setTriggerPrice("36888");
        return $this->mixPlanApi->modifyTPSLPlan($modifyTPSLPlanReq);
    }

    public function testCancelPlan():string
    {
        $cancelPlanReq = new CancelPlanReq();
        $cancelPlanReq->setOrderId("");
        $cancelPlanReq->setSymbol("BTCUSDT_UMCBL");
        $cancelPlanReq->setMarginCoin('USDT');
        $cancelPlanReq->setPlanType("normal_plan");
        return $this->mixPlanApi->cancelPlan($cancelPlanReq);
    }

    public function testCurrentPlan():string
    {
        return $this->mixPlanApi->currentPlan("BTCUSDT_UMCBL","plan");
    }

    public function testHistoryPlan():string
    {
        $startTime  = strtotime(date('Y-m-d 00:00:00', time()))*1000;
        $endTime  = strtotime(date('Y-m-d 23:59:59', time()))*1000;
        return $this->mixPlanApi->historyPlan("BTCUSDT_UMCBL",$startTime,$endTime,"100","false","plan");
    }





}