<?php


namespace bitget\api\spot;


use bitget\internal\BitgetApiClient;
use bitget\model\spot\account\BillsReq;

class SpotAccountApi
{
    const BASE_URL = "/api/spot/v1/account";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }
    /**
     * Obtain account assets
     * @return string
     */
    public function assets(): string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/assets", null);
    }
    /**
     * Get the bill flow
     * @param $billsReq
     * @return string
     */
    public function bills(BillsReq $billsReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/bills", $billsReq);
    }
    /**
     * Obtain transfer records
     * @param $coinId
     * @param $fromType
     * @param $limit
     * @param $after
     * @param $before
     * @return string
     */
    public function transferRecords(string $coinId, string $fromType,string $limit,string $after,string $before): string
    {
        $params = array("coinId" => $coinId, "fromType" => $fromType, "limit" => $limit, "after" => $after, "before" => $before);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/transferRecords", $params);
    }


}