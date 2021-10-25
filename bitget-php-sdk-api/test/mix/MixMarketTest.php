<?php


namespace test\mix;


use bitget\api\mix\MixMarketApi;
use bitget\internal\BitgetRestClient;

class MixMarketTest
{

    var MixMarketApi $mixMarketApi;

    /**
     * MixMarketTest constructor.
     */
    public function __construct()
    {
        $restClient = new BitgetRestClient();
        $this->mixMarketApi=$restClient->getMixClient()->getMarketApi();
    }

    public function testContracts(){
        return $this->mixMarketApi->contracts("sdmcbl");
    }

    public function testDepth(){
        return $this->mixMarketApi->depth("BTCUSDT_UMCBL","50");
    }

    public function testTicker(){
        return $this->mixMarketApi->ticker("BTCUSDT_UMCBL");
    }

    public function testTickers(){
        return $this->mixMarketApi->tickers("sdmcbl");
    }
    public function testFills(){
        return $this->mixMarketApi->fills("BTCUSDT_UMCBL","");
    }

    public function testCandles(){
        return $this->mixMarketApi->candles("BTCUSDT_UMCBL","60","1629177891000","1629181491000");
    }

    public function testIndex(){
        return $this->mixMarketApi->index("BTCUSDT_UMCBL");
    }

    public function testFundingTime(){
        return $this->mixMarketApi->fundingTime("BTCUSDT_UMCBL");
    }

    public function testHistoryFundRate(){
        return $this->mixMarketApi->historyFundRate("BTCUSDT_UMCBL","20","1","false");
    }

    public function testCurrentFundRate(){
        return $this->mixMarketApi->currentFundRate("BTCUSDT_UMCBL");
    }

    public function testOpenInterest(){
        return $this->mixMarketApi->openInterest("BTCUSDT_UMCBL");
    }

    public function testMarkPrice(){
        return $this->mixMarketApi->markPrice("BTCUSDT_UMCBL");
    }
}