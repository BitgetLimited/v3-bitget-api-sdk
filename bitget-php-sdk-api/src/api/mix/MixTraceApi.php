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
    /**
     * Dealer closing interface
     * @param $closeTrackOrderReq
     * @return string
     */
    public function closeTraceOrder(CloseTrackOrderReq $closeTrackOrderReq):string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/closeTrackOrder", $closeTrackOrderReq);
    }
    /**
     * The trader obtains the current order
     * @param $symbol
     * @param $productType
     * @param $pageSize
     * @param $pageNo
     * @return string
     */
    public function currentTrack(string $symbol,string $productType,string $pageSize,string $pageNo):string
    {
        $params = array("symbol" => $symbol, "productType" => $productType, "pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currentTrack", $params);
    }

    /**
     * The trader obtains the historical order
     * @param $startTime
     * @param $endTime
     * @param $pageSize
     * @param $pageNo
     * @return string
     */
    public function historyTrack(string $startTime,string $endTime,string $pageSize,string $pageNo):string
    {
        $params = array("startTime" => $startTime, "endTime" => $endTime, "pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/historyTrack", $params);
    }
    /**
     * Summary of traders' profit sharing
     * @return string
     */
    public function summary():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/summary", null);
    }
    /**
     * Historical profit sharing summary of traders (by settlement currency)
     * @return string
     */
    public function profitSettleTokenIdGroup():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/profitSettleTokenIdGroup", null);
    }
    /**
     * Historical profit sharing summary of traders (by settlement currency and date)
     * @param $pageSize
     * @param $pageNo
     * @return string
     */
    public function profitDateGroupList(string $pageSize,string $pageNo):string
    {
        $params = array("pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/profitDateGroupList", $params);
    }
    /**
     * Historical profit distribution details of traders
     * @param $marginCoin
     * @param $date
     * @param $pageSize
     * @param $pageNo
     * @return string
     */
    public function profitDateList(string $marginCoin,string $date,string $pageSize,string $pageNo):string
    {
        $params = array("marginCoin" => $marginCoin, "date" => $date, "pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/profitDateList", $params);
    }
    /**
     * Details of traders to be distributed
     * @param $pageSize
     * @param $pageNo
     * @return string
     */
    public function waitProfitDateList(string $pageSize,string $pageNo):string
    {
        $params = array("pageSize" => $pageSize, "pageNo" => $pageNo);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/waitProfitDateList", $params);
    }

    /**
     * Followers obtain documentary information
     * @param $pageSize
     * @param $pageNo
     * @param $startTime
     * @param $endTime
     * @return string
     */
    public function followerHistoryOrders(string $pageSize,string $pageNo,string $startTime,string $endTime):string
    {
        $params = array("pageSize" => $pageSize, "pageNo" => $pageNo,"startTime"=>$startTime,"endTime"=>$endTime);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/followerHistoryOrders", $params);
    }
}