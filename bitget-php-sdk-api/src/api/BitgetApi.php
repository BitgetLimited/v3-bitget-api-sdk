<?php


namespace bitget\api;


use bitget\internal\BitgetApiClient;

class BitgetApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function get($url, $params): string
    {
        return $this->BitgetApiClient->doGet($url, $params);
    }

    public function post($url, $params): string
    {
        return $this->BitgetApiClient->doPost($url, $params);
    }
}