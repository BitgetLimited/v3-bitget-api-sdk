<?php

require './vendor/autoload.php';



use test\spot\SpotAccountTest;
use test\spot\SpotMarketTest;
use test\spot\SpotOrderTest;
use test\spot\SpotPublicTest;

date_default_timezone_set('PRC');
testAccount();
testMarket();
testOrder();
testPublic();


function testAccount()
{
    $spotAccountTest = new SpotAccountTest();

    $testAssets = $spotAccountTest->testAssets();
    print_r($testAssets . "\n");

    $testBills = $spotAccountTest->testBills();
    print_r($testBills . "\n");

    $testTransferRecords = $spotAccountTest->testTransferRecords();
    print_r($testTransferRecords . "\n");
}


function testMarket()
{
    $spotMarketTest = new SpotMarketTest();
    $testFills = $spotMarketTest->testFills();
    print_r($testFills . "\n");

    $testCandles = $spotMarketTest->testCandles();
    print_r($testCandles . "\n");

    $testTicker = $spotMarketTest->testTicker();
    print_r($testTicker . "\n");

    $testTickers = $spotMarketTest->testTickers();
    print_r($testTickers . "\n");

    $testDepth = $spotMarketTest->testDepth();
    print_r($testDepth . "\n");


}

function testOrder()
{
    $spotOrderTest = new SpotOrderTest();

    $testOrders = $spotOrderTest->testOrders();
    print_r($testOrders . "\n");

    $testBatchOrders = $spotOrderTest->testBatchOrders();
    print_r($testBatchOrders . "\n");

    $testFills = $spotOrderTest->testFills();
    print_r($testFills . "\n");

    $testHistory = $spotOrderTest->testHistory();
    print_r($testHistory . "\n");

    $testCancelBatchOrder = $spotOrderTest->testCancelBatchOrder();
    print_r($testCancelBatchOrder . "\n");

    $testCancelOrder = $spotOrderTest->testCancelOrder();
    print_r($testCancelOrder . "\n");

    $testOrderInfo = $spotOrderTest->testOrderInfo();
    print_r($testOrderInfo . "\n");

    $testOpenOrders = $spotOrderTest->testOpenOrders();
    print_r($testOpenOrders . "\n");

}

function testPublic()
{
    $spotPublicTest = new SpotPublicTest();

    $testCurrencies = $spotPublicTest->testCurrencies();
    print_r($testCurrencies . "\n");

    $testProduct = $spotPublicTest->testProduct();
    print_r($testProduct . "\n");

    $testProducts = $spotPublicTest->testProducts();
    print_r($testProducts . "\n");

    $testTime = $spotPublicTest->testTime();
    print_r($testTime . "\n");

}




