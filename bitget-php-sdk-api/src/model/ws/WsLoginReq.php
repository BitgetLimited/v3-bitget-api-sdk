<?php


namespace bitget\model\ws;


class WsLoginReq
{
    var string $apiKey;
    var string $passphrase;
    var string $timestamp;
    var string $sign;

    /**
     * WsLoginReq constructor.
     * @param string $apiKey
     * @param string $passphrase
     * @param string $timestamp
     * @param string $sign
     */
    public function __construct(string $apiKey, string $passphrase, string $timestamp, string $sign)
    {
        $this->apiKey = $apiKey;
        $this->passphrase = $passphrase;
        $this->timestamp = $timestamp;
        $this->sign = $sign;
    }


}