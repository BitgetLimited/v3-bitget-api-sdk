<?php


namespace bitget\api\v2;


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
        return $this->BitgetApiClient->doGet("/api/v2/spot/account/info", $params);
    }

    public function assets($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/account/assets", $params);
    }

    public function bills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/account/bills", $params);
    }

    public function transferRecords($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/account/transferRecords", $params);
    }

}