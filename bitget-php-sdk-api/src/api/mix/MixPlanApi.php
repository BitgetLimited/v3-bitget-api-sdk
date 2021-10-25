<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;
use bitget\model\mix\plan\CancelPlanReq;
use bitget\model\mix\plan\ModifyPlanPresetReq;
use bitget\model\mix\plan\ModifyPlanReq;
use bitget\model\mix\plan\ModifyTPSLPlanReq;
use bitget\model\mix\plan\PlacePlanReq;
use bitget\model\mix\plan\PlaceTPSLReq;

class MixPlanApi
{
    const BASE_URL = "/api/mix/v1/plan";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function placePlan(PlacePlanReq $placePlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placePlan", $placePlanReq);
    }

    public function modifyPlan(ModifyPlanReq $modifyPlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyPlan", $modifyPlanReq);
    }

    public function modifyPlanPreset(ModifyPlanPresetReq $modifyPlanPresetReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyPlanPreset", $modifyPlanPresetReq);
    }

    public function modifyTPSLPlan(ModifyTPSLPlanReq $modifyTPSLPlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyTPSLPlan", $modifyTPSLPlanReq);
    }

    public function placeTPSL(PlaceTPSLReq $placeTPSLReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placeTPSL", $placeTPSLReq);
    }

    public function cancelPlan(CancelPlanReq $cancelPlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancelPlan", $cancelPlanReq);
    }

    public function currentPlan(string $symbol, string $isPlan): string
    {
        $params = array("symbol" => $symbol, "isPlan" => $isPlan);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currentPlan", $params);
    }

    public function historyPlan(string $symbol, string $startTime, string $endTime, string $pageSize, string $isPre, string $isPlan): string
    {
        $params = array("symbol" => $symbol, "startTime" => $startTime, "endTime" => $endTime, "pageSize" => $pageSize, "isPre" => $isPre, "isPlan" => $isPlan);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currentPlan", $params);
    }

}