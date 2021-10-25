<?php

namespace bitget\listener;

use bitget\internal\Listener;

require './vendor/autoload.php';


class DefListener extends Listener
{

    public function recevie(string $msg): void
    {
        print_r("handle:".$msg."\n");
    }
}