<?php


namespace test\spot;


use bitget\api\spot\SpotPublicApi;
use bitget\internal\BitgetRestClient;

class SpotPublicTest
{
    var SpotPublicApi $spotPublicApi;

    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->spotPublicApi = $restClient->getSpotClient()->getPublicApi();
    }

    public function testTime(): string
    {
        return $this->spotPublicApi->time();
    }

    public function testCurrencies(): string
    {
        return $this->spotPublicApi->currencies();
    }

    public function testProducts(): string
    {
        return $this->spotPublicApi->products();
    }

    public function testProduct(): string
    {
        return $this->spotPublicApi->product("ETHUSDT_SPBL");
    }

}