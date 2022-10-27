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

    /**
     * Get account  information
     * @param  $symbol
     * @param $marginCoin
     * @return string
     */
    public function account(string $symbol, string $marginCoin): string
    {
        $params = array("symbol" => $symbol, "marginCoin" => $marginCoin);
        return $this->BitgetApiClient->doGet(self::BASE_URL . "/account", $params);
    }
    /**
     * Get account  information list
     * @param $productType
     * @return string
     */
    public function accounts(string $productType): string
    {
        $params = array("productType" => $productType);

        return $this->BitgetApiClient->doGet(self::BASE_URL . "/accounts", $params);
    }
    /**
     * set lever
     * @param $setLeverageReq
     * @return string
     */
    public function setLeverage(SetLeverageReq $setLeverageReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setLeverage", $setLeverageReq);
    }
    /**
     * Adjustment margin
     * @param $setMarginReq
     * @return string
     */
    public function setMargin(SetMarginReq $setMarginReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setMargin", $setMarginReq);
    }
    /**
     * Adjust margin mode
     * @param $setMarginModeReq
     * @return string
     */
    public function setMarginMode(SetMarginModeReq $setMarginModeReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setMarginMode", $setMarginModeReq);
    }
    /**
     * Adjust hold mode
     * @param $setPositionModeReq
     * @return string
     */
    public function setPositionMode(SetPositionModeReq $setPositionModeReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/setPositionMode", $setPositionModeReq);
    }
    /**
     * Get the openable quantity
     * @param $openCountReq
     * @return string
     */
    public function openCount(OpenCountReq $openCountReq)
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/open-count", $openCountReq);
    }


}