<?php


namespace bitget\api\v2;


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
        return $this->BitgetApiClient->doGet("/api/v2/mix/market/contracts", $params);
    }

    public function orderbook($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/market/orderbook", $params);
    }

    public function ticker($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/market/ticker", $params);
    }

    public function tickers($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/market/tickers", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/market/fills", $params);
    }

    public function candles($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/market/candles", $params);
    }
}