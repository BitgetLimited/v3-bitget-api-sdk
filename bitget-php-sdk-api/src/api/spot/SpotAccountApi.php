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

    public function assets(): string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/assets", null);
    }

    public function bills(BillsReq $billsReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/bills", $billsReq);
    }

    public function transferRecords(string $coinId, string $fromType,string $limit,string $after,string $before): string
    {
        $params = array("coinId" => $coinId, "fromType" => $fromType, "limit" => $limit, "after" => $after, "before" => $before);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/transferRecords", $params);
    }


}