<?php


namespace bitget\api\mix;


use bitget\internal\BitgetApiClient;
use bitget\model\mix\account\OpenCountReq;
use bitget\model\mix\account\SetLeverageReq;
use bitget\model\mix\account\SetMarginModeReq;
use bitget\model\mix\account\SetMarginReq;
use bitget\model\mix\account\SetPositionModeReq;

class MixAccountApi
{
    const BASE_URL = "/api/mix/v1/account";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }

    public function account(string $symbol, string $marginCoin): string
    {
        $params = array("symbol" => $symbol, "marginCoin" => $marginCoin);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/account", $params);
    }

    public function accounts(string $productType): string
    {
        $params = array("productType" => $productType);

        return $this->BitgetApiClient->doGet(self::BASE_URL . "/accounts", $params);
    }

    public function setLeverage(SetLeverageReq $setLeverageReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setLeverage", $setLeverageReq);
    }

    public function setMargin(SetMarginReq $setMarginReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setMargin", $setMarginReq);
    }

    public function setMarginMode(SetMarginModeReq $setMarginModeReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setMarginMode", $setMarginModeReq);
    }

    public function setPositionMode(SetPositionModeReq $setPositionModeReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setPositionMode", $setPositionModeReq);
    }

    public function openCount(OpenCountReq $openCountReq)
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/open-count", $openCountReq);
    }


}