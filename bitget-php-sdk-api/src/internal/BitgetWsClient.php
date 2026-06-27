<?php

namespace bitget\internal;

use bitget\model\ws\WsBaseReq;

interface BitgetWsClient
{
    public function sendMessage(WsBaseReq $baseReq): void;

    public function sendTextMessage(string $message): void;

    public function unsubscribe(array $req): void;

    public function subscribeDef(array $req): void;

    public function subscribe(array $req,Listener $listener): void;

}