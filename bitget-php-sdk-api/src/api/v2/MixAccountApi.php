<?php


namespace bitget\api\v2;


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
        return $this->BitgetApiClient->doGet("/api/v2/mix/account/account", $params);
    }

    public function accounts($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/account/accounts", $params);
    }

    public function setLeverage($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/account/set-leverage", $params);
    }

    public function setMargin($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/account/set-margin", $params);
    }

    public function setMarginMode($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/account/set-margin-mode", $params);
    }

    public function setPositionMode($params): string
    {
        return $this->BitgetApiClient->doPost("/api/v2/mix/account/set-position-mode", $params);
    }


    // position
    public function singlePosition($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/position/single-position", $params);
    }

    public function allPosition($params): string
    {
        return $this->BitgetApiClient->doGet("/api/v2/mix/position/all-position", $params);
    }
}