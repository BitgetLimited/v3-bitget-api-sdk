<?php


namespace bitget\api\v2;


use bitget\internal\BitgetApiClient;

class SpotWalletApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function transfer($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/wallet/transfer", $params);
    }

    public function depositAddress($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/wallet/deposit-address", $params);
    }

    public function withdrawal($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/spot/wallet/withdrawal", $params);
    }

    public function withdrawalRecords($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/wallet/withdrawal-records", $params);
    }

    public function depositRecords($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/wallet/deposit-records", $params);
    }

}