<?php


namespace test\mix;


use bitget\api\mix\MixPositionApi;
use bitget\internal\BitgetRestClient;

class MixPositionTest
{
    var MixPositionApi $mixPositionApi;
    /**
     * MixAccountTest constructor.
     */
    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->mixPositionApi=$restClient->getMixClient()->getMixPositionApi();

    }

    public function testSinglePosition():string
    {
        return $this->mixPositionApi->singlePosition("BTCUSDT_UMCBL","USDT");
    }

    public function testAllPosition():string
    {
        return $this->mixPositionApi->allPosition("umcbl","USDT");
    }


}