<?php

namespace bitget\model\ws;

class SubscribeReq
{
    var string $instType;
    var string $channel;
    var string $instId;

    /**
     * @param string $instType
     * @param string $channel
     * @param string $instId
     */
    public function __construct(string $instType, string $channel, string $instId)
    {
        $this->instType = $instType;
        $this->channel = $channel;
        $this->instId = $instId;
    }

    public function toString():string{
        return $this->instType.",".$this->channel.",".$this->instId;
    }



}