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
    /**
     * Plan Entrusted Order
     * @param $placePlanReq
     * @return string
     */
    public function placePlan(PlacePlanReq $placePlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placePlan", $placePlanReq);
    }
    /**
     * Modify Plan Delegation
     * @param $modifyPlanReq
     * @return string
     */
    public function modifyPlan(ModifyPlanReq $modifyPlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyPlan", $modifyPlanReq);
    }
    /**
     * Modify the preset profit and loss stop of plan entrustment
     * @param $modifyPlanPresetReq
     * @return string
     */
    public function modifyPlanPreset(ModifyPlanPresetReq $modifyPlanPresetReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyPlanPreset", $modifyPlanPresetReq);
    }
    /**
     * Modify profit and loss stop
     * @param $modifyTPSLPlanReq
     * @return string
     */
    public function modifyTPSLPlan(ModifyTPSLPlanReq $modifyTPSLPlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyTPSLPlan", $modifyTPSLPlanReq);
    }
    /**
     * Stop profit and stop loss Order
     * @param $placeTPSLReq
     * @return string
     */
    public function placeTPSL(PlaceTPSLReq $placeTPSLReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placeTPSL", $placeTPSLReq);
    }
    /**
     * Planned entrustment (profit and loss stop) cancellation
     * @param $cancelPlanReq
     * @return string
     */
    public function cancelPlan(CancelPlanReq $cancelPlanReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancelPlan", $cancelPlanReq);
    }
    /**
     * Get the current plan commission (profit stop and loss stop) list
     * @param $symbol
     * @param $isPlan
     * @return string
     */
    public function currentPlan(string $symbol, string $isPlan): string
    {
        $params = array("symbol" => $symbol, "isPlan" => $isPlan);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currentPlan", $params);
    }
    /**
     * Obtain the list of historical plan commissions (profit and loss stop)
     * @param $symbol
     * @param $startTime
     * @param $endTime
     * @param $pageSize
     * @param $isPre
     * @param $isPlan
     * @return string
     */
    public function historyPlan(string $symbol, string $startTime, string $endTime, string $pageSize, string $isPre, string $isPlan): string
    {
        $params = array("symbol" => $symbol, "startTime" => $startTime, "endTime" => $endTime, "pageSize" => $pageSize, "isPre" => $isPre, "isPlan" => $isPlan);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currentPlan", $params);
    }

}