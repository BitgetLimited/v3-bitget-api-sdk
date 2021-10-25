<?php


namespace bitget\api\spot;


use bitget\internal\BitgetApiClient;

class SpotMarketApi
{
    const BASE_URL = "/api/spot/v1/market";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function fills(string $symbol, string $limit): string
    {
        $params = array("symbol" => $symbol, "limit" => $limit);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/fills", $params);
    }

    public function depth(string $symbol, string $limit, string $type): string
    {
        $params = array("symbol" => $symbol, "limit" => $limit, "type" => $type);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/depth", $params);
    }

    public function ticker(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/ticker", $params);
    }

    public function tickers(): string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/tickers", null);
    }

    public function candles(string $symbol, string $period, string $after, string $before, string $limit): string
    {
        $params = array("symbol" => $symbol, "period" => $period, "after" => $after, "before" => $before, "limit" => $limit);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/candles", $params);
    }

}