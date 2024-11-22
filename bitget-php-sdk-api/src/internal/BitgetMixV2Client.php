<?php


namespace bitget\internal;


use bitget\api\v2\MixAccountApi;
use bitget\api\v2\MixMarketApi;
use bitget\api\v2\MixOrderApi;

class BitgetMixV2Client
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