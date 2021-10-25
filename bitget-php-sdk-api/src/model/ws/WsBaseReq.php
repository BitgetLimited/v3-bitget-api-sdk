<?php

namespace bitget\model\ws;

class WsBaseReq
{
    var string $op;
    var array $args;

    /**
     * WsBaseReq constructor.
     * @param string $op
     * @param array $args
     */
    public function __construct(string $op, array $args)
    {
        $this->op = $op;
        $this->args = $args;
    }


}