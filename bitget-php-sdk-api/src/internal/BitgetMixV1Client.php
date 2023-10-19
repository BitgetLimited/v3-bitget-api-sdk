<?php


namespace bitget\internal;


use bitget\api\v1\MixAccountApi;
use bitget\api\v1\MixMarketApi;
use bitget\api\v1\MixOrderApi;

class BitgetMixV1Client
{

    public function getAccountApi()
    {
        return new MixAccountApi(new BitgetApiClient());
    }

    public function getMarketApi()
    {
        return new MixMarketApi(new BitgetApiClient());
    }

    public function getOrderApi()
    {
        return new MixOrderApi(new BitgetApiClient());
    }
}