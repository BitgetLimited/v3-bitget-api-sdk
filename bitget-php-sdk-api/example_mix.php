<?php

require './vendor/autoload.php';



use test\mix\MixAccountTest;
use test\mix\MixMarketTest;
use test\mix\MixOrderTest;
use test\mix\MixPlanTest;
use test\mix\MixPositionTest;
use test\mix\MixTraceTest;

date_default_timezone_set('PRC');
//testAccount();
//testMarket();
//testOrder();
//testPosition();
//testPlan();
testTrace();


function testAccount()
{
    $mixAccountTest = new MixAccountTest();

    $testAccount = $mixAccountTest->testAccount();
    print_r($testAccount . "\n");

    $testSetMarginMode = $mixAccountTest->testSetMarginMode();
    print_r($testSetMarginMode . "\n");

    $testOpenCount = $mixAccountTest->testOpenCount();
    print_r($testOpenCount . "\n");
}


function testMarket()
{
    $mixMarketTest = new MixMarketTest();
    $testContracts = $mixMarketTest->testContracts();
    print_r($testContracts . "\n");

    $testDepth = $mixMarketTest->testDepth();
    print_r($testDepth . "\n");

    $testTicker = $mixMarketTest->testTicker();
    print_r($testTicker . "\n");

    $testTickers = $mixMarketTest->testTickers();
    print_r($testTickers . "\n");

    $testFills = $mixMarketTest->testFills();
    print_r($testFills . "\n");

    $testCandles = $mixMarketTest->testCandles();
    print_r($testCandles . "\n");

    $testIndex = $mixMarketTest->testIndex();
    print_r($testIndex . "\n");

    $testFundingTime = $mixMarketTest->testFundingTime();
    print_r($testFundingTime . "\n");

    $testHistoryFundRate = $mixMarketTest->testHistoryFundRate();
    print_r($testHistoryFundRate . "\n");

    $testCurrentFundRate = $mixMarketTest->testCurrentFundRate();
    print_r($testCurrentFundRate . "\n");

    $testOpenInterest = $mixMarketTest->testOpenInterest();
    print_r($testOpenInterest . "\n");

    $testMarkPrice = $mixMarketTest->testMarkPrice();
    print_r($testMarkPrice . "\n");

}

function testOrder()
{
    $mixOrderTest = new MixOrderTest();

    $testPlaceOrder = $mixOrderTest->testPlaceOrder();
    print_r($testPlaceOrder."\n");

    $testBatchOrders = $mixOrderTest->testBatchOrders();
    print_r($testBatchOrders . "\n");

    $testCancelOrder = $mixOrderTest->testCancelOrder();
    print_r($testCancelOrder."\n");

    $testCancelBatchOrder = $mixOrderTest->testCancelBatchOrder();
    print_r($testCancelBatchOrder . "\n");

    $testHistory = $mixOrderTest->testHistory();
    print_r($testHistory . "\n");

    $testCurrent = $mixOrderTest->testCurrent();
    print_r($testCurrent . "\n");

    $testDetail = $mixOrderTest->testDetail();
    print_r($testDetail . "\n");

    $testFills = $mixOrderTest->testFills();
    print_r($testFills . "\n");
}

function testPlan()
{
    $mixPlanTest = new MixPlanTest();
    $testPlacePlan = $mixPlanTest->testPlacePlan();
    print_r($testPlacePlan."\n");

    $testModifyPlan = $mixPlanTest->testModifyPlan();
    print_r($testModifyPlan."\n");

    $testModifyPlanPreset = $mixPlanTest->testModifyPlanPreset();
    print_r($testModifyPlanPreset."\n");

    $testPlaceTPSL = $mixPlanTest->testPlaceTPSL();
    print_r($testPlaceTPSL."\n");

    $testModifyTPSLPlan = $mixPlanTest->testModifyTPSLPlan();
    print_r($testModifyTPSLPlan."\n");

    $testCancelPlan = $mixPlanTest->testCancelPlan();
    print_r($testCancelPlan."\n");

    $testCurrentPlan = $mixPlanTest->testCurrentPlan();
    print_r($testCurrentPlan."\n");

    $testHistoryPlan = $mixPlanTest->testHistoryPlan();
    print_r($testHistoryPlan."\n");

}
function testPosition()
{
    $mixPositionTest = new MixPositionTest();

    $testAllPosition = $mixPositionTest->testAllPosition();
    print_r($testAllPosition."\n");

    $testSinglePosition = $mixPositionTest->testSinglePosition();
    print_r($testSinglePosition."\n");

}

function testTrace()
{
    $mixTraceTest = new MixTraceTest();
//
//    $testCloseTraceOrder = $mixTraceTest->testCloseTraceOrder();
//    print_r($testCloseTraceOrder."\n");
//
//    $testCurrentTrack = $mixTraceTest->testCurrentTrack();
//    print_r($testCurrentTrack."\n");
//
//
//    $testHistoryTrack = $mixTraceTest->testHistoryTrack();
//    print_r($testHistoryTrack."\n");
//
//    $testSummary = $mixTraceTest->testSummary();
//    print_r($testSummary."\n");
//
//    $testProfitSettleTokenIdGroup = $mixTraceTest->testProfitSettleTokenIdGroup();
//    print_r($testProfitSettleTokenIdGroup."\n");
//
//    $testProfitDateGroupList = $mixTraceTest->testProfitDateGroupList();
//    print_r($testProfitDateGroupList."\n");
//
//    $testProfitDateList = $mixTraceTest->testProfitDateList();
//    print_r($testProfitDateList."\n");
//
//    $testWaitProfitDateList = $mixTraceTest->testWaitProfitDateList();
//    print_r($testWaitProfitDateList."\n");

    $testWaitProfitDateList = $mixTraceTest->testFollowerHistoryOrders();
    print_r($testWaitProfitDateList."\n");

}


