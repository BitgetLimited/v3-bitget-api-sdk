<?php

namespace bitget\internal;

class DataRecevie extends Listener
{

    public function recevie(string $msg): void
    {
        $time=date("Y-m-d H:i:s");
        print_r($time.">>".$msg."\n");
    }
}