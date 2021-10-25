<?php

namespace bitget\internal;

class BitgetClientBuilder
{
    var bool $isLogin;
    var Listener $listener;
    var Listener $errorListener;

    function isLogin(bool $isLogin):BitgetClientBuilder
    {
        $this->isLogin = $isLogin;
        return $this;
    }

    function listener(Listener $listener):BitgetClientBuilder
    {
        $this->listener = $listener;
        return $this;
    }

    function errorListener(Listener $errorListener):BitgetClientBuilder
    {
        $this->listener = $errorListener;
        return $this;
    }

    function build():BitgetWsClient{
        return new BitgetWsHandle($this);
    }
}