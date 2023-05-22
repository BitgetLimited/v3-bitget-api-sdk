<?php


namespace bitget\api\spot;


use bitget\internal\BitgetApiClient;

class SpotWalletApi
{
    const BASE_URL = "/api/spot/v1/wallet";

    var BitgetApiClient $BitgetApiClient;

    public function __construct($BitgetApiClient)
    {
        $this->BitgetApiClient = $BitgetApiClient;
    }
    /**
     * withdrawal
     * @param $withdrawalReq
     * @return string
     */
    public function withdrawal(WithdrawalReq $withdrawalReq): string
    {
        return $this->BitgetApiClient->doPost(self::BASE_URL . "/withdrawal", $withdrawalReq);
    }

}