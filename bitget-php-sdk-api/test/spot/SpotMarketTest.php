<?php


namespace test\spot;


use bitget\api\spot\SpotMarketApi;
use bitget\internal\BitgetRestClient;

class SpotMarketTest
{
    var SpotMarketApi $spotMarketApi;

    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->spotMarketApi=$restClient->getSpotClient()->getMarketApi();
    }

    public function testFills():string
    {
        return $this->spotMarketApi->fills("btcusdt_spbl","50");
    }

    public function testDepth():string
    {
        return $this->spotMarketApi->depth("btcusdt_spbl","50","step0");
    }

    public function testTicker():string
    {
        return $this->spotMarketApi->ticker("btcusdt_spbl");
    }

    public function testTickers():string
    {
        return $this->spotMarketApi->tickers();
    }
    public function testCandles():string
    {
        $startTime  = strtotime(date('Y-m-d 00:00:00', time()))*1000;
        $endTime  = strtotime(date('Y-m-d 23:59:59', time()))*1000;
        return $this->spotMarketApi->candles("btcusdt_spbl","1min",$startTime,$endTime,"50");
    }
}