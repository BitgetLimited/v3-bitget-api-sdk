<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;

class FiatMarketApi
{
    const BASE_URL = "/api/fiat/v1/market";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function fiatCurrencyRate(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/exchange-rate", $params);
    }

}