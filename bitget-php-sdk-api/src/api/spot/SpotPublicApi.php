<?php


namespace bitget\api\spot;


use bitget\internal\BitgetApiClient;

class SpotPublicApi
{
    const BASE_URL = "/api/spot/v1/public";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    /**
     * Get server time
     * @return string
     */
    public function time():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/time", null);
    }

    /**
     * Basic information of currency
     * @return string
     */
    public function currencies():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currencies", null);
    }

    /**
     * Get all product information
     * @return string
     */
    public function products():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/products", null);
    }

    /**
     * Get single product information
     * @param $symbol
     * @return string
     */
    public function product(string $symbol):string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/product", $params);
    }

}