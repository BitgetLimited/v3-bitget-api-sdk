<?php


namespace bitget\internal;


use bitget\api\v2\SpotAccountApi;
use bitget\api\v2\SpotMarketApi;
use bitget\api\v2\SpotOrderApi;
use bitget\api\v2\SpotWalletApi;

class BitgetSpotV2Client
{
    public function getAccountApi()
    {
        return new SpotAccountApi(new BitgetApiClient());
    }

    public function getMarketApi()
    {
        return new SpotMarketApi(new BitgetApiClient());
    }

    public function getOrderApi()
    {
        return new SpotOrderApi(new BitgetApiClient());
    }

    public function getWalletApi()
    {
        return new SpotWalletApi(new BitgetApiClient());
    }

}