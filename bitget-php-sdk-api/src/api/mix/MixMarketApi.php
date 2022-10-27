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
    /**
     * Contract information
     * @param $productType
     * @return string
     */
    public function contracts(string $productType): string
    {
        $params = array("productType" => $productType);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/contracts", $params);
    }
    /**
     * Deep market
     * @param $symbol
     * @param $limit
     * @return string
     */
    public function depth(string $symbol, string $limit): string
    {
        $params = array("symbol" => $symbol, "limit" => $limit);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/depth", $params);
    }
    /**
     * Deep market
     * @param $symbol
     * @return string
     */
    public function ticker(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/ticker", $params);
    }
    /**
     * Acquisition of single ticker market
     * @param $productType
     * @return string
     */
    public function tickers(string $productType): string
    {
        $params = array("productType" => $productType);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/tickers", $params);
    }
    /**
     * Obtain transaction details
     * @param $symbol
     * @param $limit
     * @return string
     */
    public function fills(string $symbol, string $limit): string
    {
        $params = array("symbol" => $symbol, "limit" => $limit);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/fills", $params);
    }
    /**
     * Obtain K line data
     * @param $symbol
     * @param $granularity (Category of k line)
     * @param $startTime
     * @param $endTime
     * @return string
     */
    public function candles(string $symbol, string $granularity, string $startTime, string $endTime): string
    {
        $params = array("symbol" => $symbol, "granularity" => $granularity, "startTime" => $startTime, "endTime" => $endTime);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/candles", $params);
    }
    /**
     * Get currency index
     * @param $symbol
     * @return string
     */
    public function index(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/index", $params);
    }
    /**
     * Get the next settlement time of the contract
     * @param $symbol
     * @return string
     */
    public function fundingTime(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/funding-time", $params);
    }
    /**
     * Get historical fund rate
     * @param $symbol
     * @param $pageSize
     * @param $pageNo
     * @param $nextPage
     * @return string
     */
    public function historyFundRate(string $symbol, string $pageSize, string $pageNo, string $nextPage): string
    {
        $params = array("symbol" => $symbol, "pageSize" => $pageSize, "pageNo" => $pageNo, "nextPage" => $nextPage);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/history-fundRate", $params);
    }
    /**
     * Get the current fund rate
     * @param $symbol
     * @return string
     */
    public function currentFundRate(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/current-fundRate", $params);
    }
    /**
     * Obtain the total position of the platform
     * @param $symbol
     * @return string
     */
    public function openInterest(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/open-interest", $params);
    }
    /**
     * Get contract tag price
     * @param $symbol
     * @return string
     */
    public function markPrice(string $symbol): string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/mark-price", $params);
    }
}