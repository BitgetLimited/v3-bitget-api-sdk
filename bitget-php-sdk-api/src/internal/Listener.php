<?php


namespace bitget\internal;


use WebSocket\Exception;

abstract class Listener
{

    /**
     * Reveice constructor.
     */
    public function __construct()
    {
    }
    abstract public function recevie(string $msg):void;
}