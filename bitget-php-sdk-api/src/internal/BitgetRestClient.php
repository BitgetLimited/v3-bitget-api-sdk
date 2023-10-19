<?php

namespace bitget\internal;


class BitgetRestClient
{

    public function getMixClient()
    {
        return new BitgetMixV1Client();
    }

    public function getSpotClient()
    {
        return new BitgetSpotV1Client();
    }

    public function getMixV1Client()
    {
        return new BitgetMixV1Client();
    }

    public function getSpotV1Client()
    {
        return new BitgetSpotV1Client();
    }

    public function getMixV2Client()
    {
        return new BitgetMixV2Client();
    }

    public function getSpotV2Client()
    {
        return new BitgetSpotV2Client();
    }

}

