<?php


namespace bitget\api\v2;


use bitget\internal\BitgetApiClient;

class SpotMarketApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function coins($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/public/coins", $params);
    }

    public function symbols($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/public/symbols", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/market/fills", $params);
    }

    public function orderbook($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/market/orderbook", $params);
    }

    public function tickers($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/market/tickers", $params);
    }

    public function candles($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/spot/market/candles", $params);
    }
}