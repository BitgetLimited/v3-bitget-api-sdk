<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;

class MixMarketApi
{
    const BASE_URL = "/api/mix/v1/market";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function contracts(string $productType): string
    {
        $params = array("productType" => $productType);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/contracts", $params);
    }

    public function depth(string $symbol, string $limit): string
    {
        $params = array("symbol" => $symbol, "limit" => $limit);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/depth", $params);
    }

    public function ticker(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/ticker", $params);
    }

    public function tickers(string $productType): string
    {
        $params = array("productType" => $productType);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/tickers", $params);
    }

    public function fills(string $symbol, string $limit): string
    {
        $params = array("symbol" => $symbol, "limit" => $limit);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/fills", $params);
    }

    public function candles(string $symbol, string $granularity, string $startTime, string $endTime): string
    {
        $params = array("symbol" => $symbol, "granularity" => $granularity, "startTime" => $startTime, "endTime" => $endTime);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/candles", $params);
    }

    public function index(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/index", $params);
    }

    public function fundingTime(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/funding-time", $params);
    }

    public function historyFundRate(string $symbol, string $pageSize, string $pageNo, string $nextPage): string
    {
        $params = array("symbol" => $symbol, "pageSize" => $pageSize, "pageNo" => $pageNo, "nextPage" => $nextPage);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/history-fundRate", $params);
    }

    public function currentFundRate(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/current-fundRate", $params);
    }

    public function openInterest(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/open-interest", $params);
    }

    public function markPrice(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/mark-price", $params);
    }
}