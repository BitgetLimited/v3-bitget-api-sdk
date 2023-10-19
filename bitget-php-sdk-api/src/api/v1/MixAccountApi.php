<?php


namespace bitget\api\v1;


use bitget\internal\BitgetApiClient;

class MixAccountApi
{
    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function account($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/account/account", $params);
    }

    public function accounts($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/account/accounts", $params);
    }

    public function setLeverage($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/account/setLeverage", $params);
    }

    public function setMargin($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/account/setMargin", $params);
    }

    public function setMarginMode($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/account/setMarginMode", $params);
    }

    public function setPositionMode($params): string
    {
        return $this->BitgetApiClient->doPost("/api/mix/v1/account/setPositionMode", $params);
    }


    // position
    public function singlePosition($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/position/singlePosition", $params);
    }

    public function allPosition($params): string
    {
        return $this->BitgetApiClient->doGet("/api/mix/v1/position/allPosition", $params);
    }
}