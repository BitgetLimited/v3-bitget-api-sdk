<?php

use bitget\internal\BitgetWsHandle;
use bitget\internal\Listener;
use bitget\listener\DefListener;
use bitget\model\ws\SubscribeReq;

require './vendor/autoload.php';




$bitgetWsClient = BitgetWsHandle::builder()->isLogin(true)->listener(new class extends Listener{

    public function recevie(string $msg): void
    {
        print_r("def:\n".$msg."\n");
    }
})->build();

$sub = array(new SubscribeReq("mc","trade","BTCUSDT"));
$bitgetWsClient->subscribeDef($sub);


$sub2 = array(new SubscribeReq("mc","trade","ETHUSDT"));
$bitgetWsClient->subscribe($sub2,new class extends Listener {
    public function recevie(string $msg): void
    {
        print_r("appoint:\n".$msg."\n");
    }
});

// Bitget Websocket server domain is "wss://ws.bitget.com/spot/v1/stream"
// which in PHP it automatically connect to "wss://ws.bitget.com:443/spot/v1/stream"
// and so got connection rejected because the port 443 is not enabled in Bitget's websocket server
// Please try an alternative or, switch to another Dev language
// $bitgetWsClient->startWorker();



