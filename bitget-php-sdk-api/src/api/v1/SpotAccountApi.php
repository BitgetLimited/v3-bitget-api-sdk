<?php


namespace bitget\api\v1;


use bitget\internal\BitgetApiClient;

class SpotAccountApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function info($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/account/getInfo", $params);
    }

    public function assets($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/account/assets-lite", $params);
    }

    public function bills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/account/bills", $params);
    }

    public function transferRecords($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/account/transferRecords", $params);
    }

}