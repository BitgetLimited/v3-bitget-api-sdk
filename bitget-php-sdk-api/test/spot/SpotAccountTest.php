<?php


namespace test\spot;


use bitget\api\spot\SpotAccountApi;
use bitget\internal\BitgetRestClient;
use bitget\model\spot\account\BillsReq;

class SpotAccountTest
{
    var SpotAccountApi $spotAccountApi;

    public function __construct()
    {
        $restClient = new BitgetRestClient();

        $this->spotAccountApi=$restClient->getSpotClient()->getAccountApi();

    }

    public function testAssets():string
    {
        return $this->spotAccountApi->assets();
    }

    public function testBills():string
    {
        $billsReq = new BillsReq();
        $billsReq->setAfter("");
        $billsReq->setBefore("");
        $billsReq->setBizType("");
        $billsReq->setCoinId("");
        $billsReq->setGroupType("");
        $billsReq->setLimit("");
        return $this->spotAccountApi->bills($billsReq);
    }
    public function testTransferRecords():string
    {
        return $this->spotAccountApi->transferRecords("2","USDT_MIX","10","","");
    }


}