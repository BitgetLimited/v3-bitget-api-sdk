<?php


namespace test\api;

use bitget\api\BitgetApi;
use bitget\api\v1\MixOrderApi;
use bitget\internal\BitgetApiClient;
use bitget\internal\BitgetRestClient;

class MixOrderTest
{
    var MixOrderApi $mixOrderApi;
    var BitgetApi $bitgetApi;

    public function __construct()
    {
        $restClient = new BitgetRestClient();
        $this->mixOrderApi = $restClient->getMixClient()->getOrderApi();
        $this->bitgetApi = new BitgetApi(new BitgetApiClient());
    }

    public function testPlaceOrder()
    {
        $params = array("symbol" => "BTCUSDT_UMCBL",
            "marginCoin" => "USDT",
            "side" => "open_long",
            "orderType" => "limit",
            "price" => "27012",
            "size" => "0.01",
            "timInForceValue" => "normal");
        return $this->mixOrderApi->placeOrder($params);
    }

    public function testPost()
    {
        $params = array("symbol" => "BTCUSDT_UMCBL",
            "marginCoin" => "USDT",
            "side" => "open_long",
            "orderType" => "limit",
            "price" => "27012",
            "size" => "0.01",
            "timInForceValue" => "normal");
        return $this->bitgetApi->post("/api/mix/v1/order/placeOrder", $params);
    }

    public function testGet()
    {
        $params = array("productType" => "umcbl");
        return $this->bitgetApi->get("/api/mix/v1/account/accounts", $params);
    }

    public function testGetWithNoParams()
    {
        $params = array();
        return $this->bitgetApi->get("/api/spot/v1/account/getInfo", $params);
    }
}