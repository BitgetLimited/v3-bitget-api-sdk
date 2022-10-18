<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;

class MixPositionApi
{
    const BASE_URL = "/api/mix/v1/position";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }
    /**
     * Obtain single contract position information
     * @param $symbol
     * @param $marginCoin
     * @return string
     */
    public function singlePosition(string $symbol,string $marginCoin):string
    {
        $params = array("symbol" => $symbol, "marginCoin" => $marginCoin);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/singlePosition", $params);
    }
    /**
     * Obtain all contract position information
     * @param $productType
     * @param $marginCoin
     * @return string
     */
    public function allPosition(string $productType,string $marginCoin):string
    {
        $params = array("productType" => $productType, "marginCoin" => $marginCoin);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/allPosition", $params);
    }

}