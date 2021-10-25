<?php

namespace bitget\internal;


class BitgetRestClient
{

    public function getMixClient(){
        return new BitgetMixClient();
    }

    public function getSpotClient(){
        return new BitgetSpotClient();
    }

}

