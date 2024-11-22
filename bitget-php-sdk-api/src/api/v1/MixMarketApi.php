<?php


namespace bitget\api\v1;


use bitget\internal\BitgetApiClient;

class MixMarketApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function contracts($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/market/contracts", $params);
    }

    public function depth($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/market/depth", $params);
    }

    public function ticker($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/market/ticker", $params);
    }

    public function tickers($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/market/tickers", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/market/fills", $params);
    }

    public function candles($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/market/candles", $params);
    }
}