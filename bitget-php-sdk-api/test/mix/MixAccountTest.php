<?php

namespace test\mix;

use bitget\api\mix\MixAccountApi;
use bitget\internal\BitgetRestClient;
use bitget\model\mix\account\OpenCountReq;
use bitget\model\mix\account\SetLeverageReq;
use bitget\model\mix\account\SetMarginModeReq;
use bitget\model\mix\account\SetMarginReq;
use bitget\model\mix\account\SetPositionModeReq;

require "./vendor/autoload.php";


class MixAccountTest
{

    var MixAccountApi $mixAccountApi;
    /**
     * MixAccountTest constructor.
     */
    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->mixAccountApi=$restClient->getMixClient()->getAccountApi();

    }

    public function testAccount(){
       return $this->mixAccountApi->account("BTCUSDT_UMCBL","USDT");
    }

    public function testAccounts(){
        return  $this->mixAccountApi->accounts("umcbl");

    }

    public function testSetLeverage(): string
    {
        $setLeverageReq = new SetLeverageReq();
        $setLeverageReq->setLeverage("");
        $setLeverageReq->setSymbol("");
        $setLeverageReq->setMarginCoin("");
        $setLeverageReq->setHoldSide("");
        return $this->mixAccountApi->setLeverage($setLeverageReq);
    }
    public function testSetMargin(): string
    {
        $setMarginReq = new SetMarginReq();
        $setMarginReq->setSymbol("BTCUSDT_UMCBL");
        $setMarginReq->setHoldSide("long");
        $setMarginReq->setMarginCoin("USDT");
        $setMarginReq->setAmount("10");
        return $this->mixAccountApi->setMargin($setMarginReq);
    }

    public function testSetMarginMode(): string
    {
        $setMarginModeReq = new SetMarginModeReq();
        $setMarginModeReq->setSymbol("BTCUSDT_UMCBL");
        $setMarginModeReq->setMarginCoin("USDT");
        $setMarginModeReq->setMarginMode("fixed");
        return $this->mixAccountApi->setMarginMode($setMarginModeReq);
    }

    public function testSetPositionMode(): string
    {
        $setPositionModeReq = new SetPositionModeReq();
        $setPositionModeReq->setSymbol("BTCUSDT_UMCBL");
        $setPositionModeReq->setMarginCoin("USDT");
        $setPositionModeReq->setHoldMode("double_hold");
        return $this->mixAccountApi->setPositionMode($setPositionModeReq);
    }

    public function testOpenCount(): string
    {
        $openCountReq = new OpenCountReq();
        $openCountReq->setSymbol("BTCUSDT_UMCBL");
        $openCountReq->setMarginCoin("USDT");
        $openCountReq->setOpenPrice("30000");
        $openCountReq->setOpenAmount("99999");
        $openCountReq->setLeverage("20");
        return $this->mixAccountApi->openCount($openCountReq);
    }
}