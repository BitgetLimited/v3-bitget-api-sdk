<?php


namespace bitget\api\v1;


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
        return $this->BitgetApiClient->doPost("/api/spot/v1/wallet/transfer", $params);
    }

    public function depositAddress($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/wallet/deposit-address", $params);
    }

    public function withdrawal($params): string
    {
        return $this->BitgetApiClient->doPost("/api/spot/v1/wallet/withdrawal", $params);
    }

    public function withdrawalRecords($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/wallet/withdrawal-list", $params);
    }

    public function depositRecords($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/wallet/deposit-list", $params);
    }

}