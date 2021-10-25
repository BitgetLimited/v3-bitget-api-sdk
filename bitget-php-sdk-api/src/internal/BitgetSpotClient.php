<?php


namespace bitget\internal;


use bitget\api\spot\SpotAccountApi;
use bitget\api\spot\SpotMarketApi;
use bitget\api\spot\SpotOrderApi;
use bitget\api\spot\SpotPublicApi;

class BitgetSpotClient
{
    public function getAccountApi(){
        return new SpotAccountApi(new BitgetApiClient());
    }

    public function getMarketApi(){
        return new SpotMarketApi(new BitgetApiClient());
    }

    public function getOrderApi(){
        return new SpotOrderApi(new BitgetApiClient());
    }

    public function getPublicApi()
    {
        return new SpotPublicApi(new BitgetApiClient());
    }

}