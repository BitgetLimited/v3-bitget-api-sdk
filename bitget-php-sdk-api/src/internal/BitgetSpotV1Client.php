<?php


namespace bitget\internal;


use bitget\api\v1\SpotAccountApi;
use bitget\api\v1\SpotMarketApi;
use bitget\api\v1\SpotOrderApi;
use bitget\api\v1\SpotWalletApi;

class BitgetSpotV1Client
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