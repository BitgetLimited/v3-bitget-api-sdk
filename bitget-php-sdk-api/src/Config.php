<?php


namespace bitget;


class Config extends Constant
{
    const websocketUrl = "wss://ws.bitget.com/mix/v1/stream";
    const restApiUrl = "https://api.bitget.com";
    const apiSecret = "";
    const apiKey = "";
    const passphrase = "";
    const signType = self::SHA256;
}