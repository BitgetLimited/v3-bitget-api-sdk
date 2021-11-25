<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;
use bitget\model\mix\trace\CloseTrackOrderReq;

class MixTraceApi
{
    const BASE_URL = "/api/mix/v1/trace";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function closeTraceOrder(CloseTrackOrderReq $closeTrackOrderReq):string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/closeTrackOrder", $closeTrackOrderReq);
    }

    public function currentTrack(string $symbol,string $productType,string $pageSize,string $pageNo):string
    {
        $params = array("symbol" => $symbol, "productType" => $productType, "pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currentTrack", $params);
    }

    public function historyTrack(string $startTime,string $endTime,string $pageSize,string $pageNo):string
    {
        $params = array("startTime" => $startTime, "endTime" => $endTime, "pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/historyTrack", $params);
    }

    public function summary():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/summary", null);
    }

    public function profitSettleTokenIdGroup():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/profitSettleTokenIdGroup", null);
    }

    public function profitDateGroupList(string $pageSize,string $pageNo):string
    {
        $params = array("pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/profitDateGroupList", $params);
    }

    public function profitDateList(string $marginCoin,string $date,string $pageSize,string $pageNo):string
    {
        $params = array("marginCoin" => $marginCoin, "date" => $date, "pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/profitDateList", $params);
    }

    public function waitProfitDateList(string $pageSize,string $pageNo):string
    {
        $params = array("pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/waitProfitDateList", $params);
    }
    public function followerHistoryOrders(string $pageSize,string $pageNo,string $startTime,string $endTime):string
    {
        $params = array("pageSize" => $pageSize, "pageNo" => $pageNo,"startTime"=>$startTime,"endTime"=>$endTime);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/followerHistoryOrders", $params);
    }
}