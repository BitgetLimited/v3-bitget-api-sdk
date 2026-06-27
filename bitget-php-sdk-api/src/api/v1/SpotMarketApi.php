<?php


namespace bitget\api\v1;


use bitget\internal\BitgetApiClient;

class SpotMarketApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function currencies($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/public/currencies", $params);
    }

    public function products($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/public/products", $params);
    }

    public function product($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/public/product", $params);
    }

    public function fills($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/market/fills", $params);
    }

    public function depth($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/market/depth", $params);
    }

    public function ticker($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/market/ticker", $params);
    }

    public function tickers($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/market/tickers", $params);
    }

    public function candles($params): string
    {
        return $this->BitgetApiClient->doGet("/api/spot/v1/market/candles", $params);
    }
}