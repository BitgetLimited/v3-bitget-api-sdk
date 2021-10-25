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

    public function time():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/time", null);
    }

    public function currencies():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/currencies", null);
    }

    public function products():string
    {
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/products", null);
    }

    public function product(string $symbol):string
    {
        $params = array("symbol" => $symbol);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/product", $params);
    }

}