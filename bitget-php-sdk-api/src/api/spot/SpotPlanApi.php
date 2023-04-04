<?php


namespace bitget\api\spot;


use bitget\internal\BitgetApiClient;
use bitget\model\spot\plan\SpotPlanReq;
use bitget\model\spot\plan\SpotModifyPlanReq;
use bitget\model\spot\plan\SpotCancelPlanReq;
use bitget\model\spot\plan\SpotQueryPlanReq;

class SpotPlanApi
{
    const BASE_URL = "/api/spot/v1/plan";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function placePlan(SpotPlanReq $req): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/placePlan", $req);
    }

    public function modifyPlan(SpotModifyPlanReq $req): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/modifyPlan", $req);
    }

    public function cancelPlan(SpotCancelPlanReq $req): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/cancelPlan", $req);
    }

    public function currentPlan(SpotQueryPlanReq $req): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/currentPlan", $req);
    }

    public function historyPlan(SpotQueryPlanReq $req): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/historyPlan", $req);
    }

}