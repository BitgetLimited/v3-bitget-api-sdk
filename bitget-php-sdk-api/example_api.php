<?php

require './vendor/autoload.php';

use test\api\MixOrderTest;

date_default_timezone_set('PRC');

test();

function test()
{
    $mixOrderTest = new MixOrderTest();
    $testPlaceOrder = $mixOrderTest->testPlaceOrder();
    print_r($testPlaceOrder . "\n");

    $testPost = $mixOrderTest->testPost();
    print_r($testPost . "\n");

    $testGet = $mixOrderTest->testGet();
    print_r($testGet . "\n");

    $testGet = $mixOrderTest->testGetWithNoParams();
    print_r($testGet . "\n");

    $testGet = $mixOrderTest->testGetWithEncodeParams();
    print_r($testGet . "\n");

}



