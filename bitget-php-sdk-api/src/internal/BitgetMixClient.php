<?php


namespace bitget\internal;


use bitget\api\mix\MixAccountApi;
use bitget\api\mix\MixMarketApi;
use bitget\api\mix\MixOrderApi;
use bitget\api\mix\MixPlanApi;
use bitget\api\mix\MixPositionApi;
use bitget\api\mix\MixTraceApi;

class BitgetMixClient
{

    public function getAccountApi(){
        return new MixAccountApi(new BitgetApiClient());
    }

    public function getMarketApi(){
        return new MixMarketApi(new BitgetApiClient());
    }

    public function getOrderApi(){
        return new MixOrderApi(new BitgetApiClient());
    }

    public function getMixPlanApi()
    {
        return new MixPlanApi(new BitgetApiClient());
    }

    public function getMixPositionApi()
    {
        return new MixPositionApi(new BitgetApiClient());
    }

    public function getMixTraceApi()
    {
        return new MixTraceApi(new BitgetApiClient());
    }
}