import * as BitgetApi from '../src';
import { describe, test, expect } from '@jest/globals';

import {toJsonString} from '../src/lib/util';

import * as Console from 'console';
import {LOCAL} from "../src/lib/config";



const apiKey = '';
const secretKey = '';
const passphrase = '';
const locale = LOCAL.ZH_CH;
describe('MixAccountApiTest', () => {


    const mixAccountApi = new BitgetApi.MixAccountApi(apiKey,secretKey,passphrase,locale);
    /**
     * Get account  information
     * @param symbol
     * @param marginCoin
     */
    test('account', () => {
        return mixAccountApi.account('BTCUSDT_UMCBL','USDT').then((data) => {
            Console.info(toJsonString(data));
        });
    });
    /**
     * Get account  information list
     * @param productType
     */
    test('accounts', () => {
        return mixAccountApi.accounts('umcbl').then((data) => {
            Console.info(toJsonString(data));
        });
    });
    /**
     * set lever
     * @param mixChangeLeverageReq
     */
    test('setLeverage', () => {
        const setLeverageReq = new BitgetApi.SetLeverageReq();
        setLeverageReq.symbol = 'BTCUSDT_UMCBL';
        setLeverageReq.marginCoin = 'USDT';
        setLeverageReq.leverage = '25';
        setLeverageReq.holdSide = 'long';
        return mixAccountApi.setLeverage(setLeverageReq).then((data) => {
            Console.info(toJsonString(data));
        });
    });
    /**
     * Adjustment margin
     * @param mixAdjustMarginFixReq
     */
    test('setMargin', () => {
        const setMarginReq = new BitgetApi.SetMarginReq();
        setMarginReq.symbol = 'BTCUSDT_UMCBL';
        setMarginReq.marginCoin = 'USDT';
        setMarginReq.amount = '10';
        setMarginReq.holdSide = 'long';
        return mixAccountApi.setMargin(setMarginReq).then((data) => {
            Console.info(toJsonString(data));
        })
    })
    /**
     * Adjust margin mode
     * @param adjustMarginModeReq
     */
    test('setMarginMode', () => {
        const setMarginModeReq = new BitgetApi.SetMarginModeReq();
        setMarginModeReq.symbol = 'BTCUSDT_UMCBL';
        setMarginModeReq.marginCoin = 'USDT';
        setMarginModeReq.marginMode = 'fixed';
        return mixAccountApi.setMarginMode(setMarginModeReq).then((data) => {
            // tslint:disable-next-line:no-console
            Console.info(toJsonString(data));
        })
    })
    /**
     * Adjust hold mode
     * @param adjustHoldModeReq
     */
    test('setPositionMode', () => {
        const setPositionModeReq = new BitgetApi.SetPositionModeReq();
        setPositionModeReq.symbol = 'BTCUSDT_UMCBL';
        setPositionModeReq.marginCoin = 'USDT';
        setPositionModeReq.holdMode = 'double_hold';
        return mixAccountApi.setPositionMode(setPositionModeReq).then((data) => {
            Console.info(toJsonString(data));
        })
    })
    /**
     * Get the openable quantity
     * @param mixOpenCountReq
     */
    test('openCount', () => {
        const openCountReq = new BitgetApi.OpenCountReq();
        openCountReq.symbol = 'BTCUSDT_UMCBL';
        openCountReq.marginCoin = 'USDT';
        openCountReq.openPrice = '30000';
        openCountReq.leverage = '20';
        openCountReq.openAmount = '99999';
        return mixAccountApi.openCount(openCountReq).then((data) => {
            Console.info(toJsonString(data));
        })
    })
});

describe('MixMarketApiTest', () => {
    const mixMarketApi = new BitgetApi.MixMarketApi(apiKey,secretKey,passphrase,locale);
    /**
     * Contract information
     * @param productType
     */
    test('contracts',()=>{
        return mixMarketApi.contracts('sdmcbl').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Deep market
     * @param symbol
     * @param limit
     */
    test('depth',()=>{
        return mixMarketApi.depth('BTCUSDT_UMCBL','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Deep market
     * @param symbol
     */
    test('ticker',()=>{
        return mixMarketApi.ticker('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Acquisition of single ticker market
     * @param productType
     */
    test('tickers',()=>{
        return mixMarketApi.tickers('umcbl').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain transaction details
     * @param symbol
     * @param limit
     */
    test('fills',()=>{
        return mixMarketApi.fills('BTCUSDT_UMCBL','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain K line data
     * @param symbol
     * @param granularity (Category of k line)
     * @param startTime
     * @param endTime
     */
    test('candles',()=>{
        return mixMarketApi.candles('BTCUSDT_UMCBL','60','1629177891000','1629181491000').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    /**
     * Get currency index
     * @param symbol
     */
    test('index',()=>{
        return mixMarketApi.index('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    }, 30000)
    /**
     * Get the next settlement time of the contract
     * @param symbol
     */
    test('fundingTime',()=>{
        return mixMarketApi.index('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get historical fund rate
     * @param symbol
     * @param pageSize
     * @param pageNo
     * @param nextPage
     */
    test('historyFundRate',()=>{
        return mixMarketApi.historyFundRate('BTCUSDT_UMCBL','20','1',false).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get the current fund rate
     * @param symbol
     */
    test('currentFundRate',()=>{
        return mixMarketApi.currentFundRate('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain the total position of the platform
     * @param symbol
     */
    test('openInterest',()=>{
        return mixMarketApi.openInterest('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get contract tag price
     * @param symbol
     */
    test('markPrice',()=>{
        return mixMarketApi.markPrice('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('MixOrderApiTest', () => {
    const mixOrderApi = new BitgetApi.MixOrderApi(apiKey,secretKey,passphrase,locale);
    /**
     * place an order
     * @param placeOrderReq
     */
    test('placeOrder',()=>{
        const placeOrderReq = new BitgetApi.PlaceOrderReq();
        placeOrderReq.clientOid='RFIut#'+Date.now();
        placeOrderReq.symbol = 'SBTCSUSDT_SUMCBL';
        placeOrderReq.price = '44067';
        placeOrderReq.size = '1';
        placeOrderReq.marginCoin = 'SUSDT';
        placeOrderReq.side = 'open_long';
        placeOrderReq.timeInForceValue = 'normal';
        placeOrderReq.orderType = 'limit';
        return mixOrderApi.placeOrder(placeOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Place orders in batches
     * @param batchOrdersReq
     */
    test('batchOrders',()=>{
        const batchOrdersReq = new BitgetApi.BatchOrdersReq();
        batchOrdersReq.symbol = 'SBTCSUSDT_SUMCBL';
        batchOrdersReq.marginCoin = 'SUSDT';

        const placeOrderBaseParamOne = new BitgetApi.PlaceOrderBaseParam();
        placeOrderBaseParamOne.clientOid='RFIut#'+Date.now();
        placeOrderBaseParamOne.price = '23789.3';
        placeOrderBaseParamOne.size = '1';
        placeOrderBaseParamOne.side = 'open_long';
        placeOrderBaseParamOne.timeInForceValue = 'normal';
        placeOrderBaseParamOne.orderType = 'limit';

        const placeOrderBaseParamTow = new BitgetApi.PlaceOrderBaseParam();
        placeOrderBaseParamTow.clientOid='RFIut#'+Date.now();
        placeOrderBaseParamTow.price = '23888.3';
        placeOrderBaseParamTow.size = '1';
        placeOrderBaseParamTow.side = 'open_long';
        placeOrderBaseParamTow.timeInForceValue = 'normal';
        placeOrderBaseParamTow.orderType = 'limit';

        const orderDataList = new Array();
        orderDataList.push(placeOrderBaseParamOne);
        orderDataList.push(placeOrderBaseParamTow);

        batchOrdersReq.orderDataList = orderDataList;
        return mixOrderApi.batchOrders(batchOrdersReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * cancel the order
     * @param cancelOrderReq
     */
    test('cancelOrder',()=>{
        const cancelOrderReq = new BitgetApi.CancelOrderReq();
        cancelOrderReq.symbol = 'SBTCSUSDT_SUMCBL';
        cancelOrderReq.marginCoin = 'SUSDT';
        cancelOrderReq.orderId = '811489712408248322';
        return mixOrderApi.cancelOrder(cancelOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Batch cancellation
     * @param cancelBatchOrderReq
     */
    test('cancelBatchOrder',()=>{
        const cancelBatchOrderReq = new BitgetApi.CancelBatchOrderReq();
        cancelBatchOrderReq.symbol = 'SBTCSUSDT_SUMCBL';
        cancelBatchOrderReq.marginCoin = 'SUSDT';
        const orderIds = new Array<string>();
        orderIds.push('802382049422487552');
        orderIds.push('811489712408248322');
        cancelBatchOrderReq.orderIds = orderIds;
        return mixOrderApi.cancelBatchOrder(cancelBatchOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get Historical Delegation
     * @param symbol
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param lastEndId
     * @param isPre
     */
    test('history',()=>{

        return mixOrderApi.history('SBTCSUSDT_SUMCBL','1629113823000','1629513368000',50,'',false).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get the current delegate
     * @param symbol
     */
    test('current',()=>{

        return mixOrderApi.current('SBTCSUSDT_SUMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get order details
     * @param symbol
     * @param orderId
     */
    test('detail',()=>{

        return mixOrderApi.detail('SBTCSUSDT_SUMCBL','811489712408248322').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Query transaction details
     * @param symbol
     * @param orderId
     */
    test('fills',()=>{

        return mixOrderApi.fills('SBTCSUSDT_SUMCBL','811489712408248322').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('MixPlanApiTest', () => {
    const mixPlanApi = new BitgetApi.MixPlanApi(apiKey,secretKey,passphrase,locale);
    /**
     * Plan Entrusted Order
     * @param placePlanReq
     */
    test('placePlan',()=>{
        const placePlanReq = new BitgetApi.PlacePlanReq();
        placePlanReq.clientOid = '#'+Date.now();
        placePlanReq.symbol = 'BTCUSDT_UMCBL';
        placePlanReq.triggerPrice = '45000.3';
        placePlanReq.executePrice = '38923.1';
        placePlanReq.size = '1';
        placePlanReq.marginCoin = 'USDT';
        placePlanReq.side = 'open_long';
        placePlanReq.orderType = 'limit';
        placePlanReq.triggerType = 'fill_price';
        return mixPlanApi.placePlan(placePlanReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Modify Plan Delegation
     * @param modifyPlanReq
     */
    test('modifyPlan',()=>{
        const modifyPlanReq = new BitgetApi.ModifyPlanReq();
        modifyPlanReq.orderId = '833883177497890816';
        modifyPlanReq.symbol = 'BTCUSDT_UMCBL';
        modifyPlanReq.triggerPrice = '45012.1';
        modifyPlanReq.executePrice = '39423.1';
        modifyPlanReq.marginCoin = 'USDT';
        modifyPlanReq.triggerType = 'fill_price';
        modifyPlanReq.orderType = 'limit';
        return mixPlanApi.modifyPlan(modifyPlanReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Modify the preset profit and loss stop of plan entrustment
     * @param modifyPlanPresetReq
     * @return ResponseResult
     */
    test('modifyPlanPreset',()=>{
        const modifyPlanPresetReq = new BitgetApi.ModifyPlanPresetReq();
        modifyPlanPresetReq.orderId = '833883177497890816';
        modifyPlanPresetReq.symbol = 'BTCUSDT_UMCBL';
        modifyPlanPresetReq.marginCoin = 'USDT';
        modifyPlanPresetReq.presetTakeProfitPrice = '55012.1';
        return mixPlanApi.modifyPlanPreset(modifyPlanPresetReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Stop profit and stop loss Order
     * @param placeTPSLReq
     */
    test('placeTPSL',()=>{
        const placeTPSLReq = new BitgetApi.PlaceTPSLReq();
        placeTPSLReq.symbol = 'BTCUSDT_UMCBL';
        placeTPSLReq.marginCoin = 'USDT';
        placeTPSLReq.planType = 'profit_plan';
        placeTPSLReq.triggerPrice = '36888.0';
        placeTPSLReq.holdSide = 'short';
        return mixPlanApi.placeTPSL(placeTPSLReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Modify profit and loss stop
     * @param modifyTPSLPlanReq
     */
    test('modifyTPSLPlan',()=>{
        const modifyTPSLPlanReq = new BitgetApi.ModifyTPSLPlanReq();
        modifyTPSLPlanReq.symbol = 'BTCUSDT_UMCBL';
        modifyTPSLPlanReq.marginCoin = 'USDT';
        modifyTPSLPlanReq.planType = 'profit_plan';
        modifyTPSLPlanReq.triggerPrice = '36888.0';
        modifyTPSLPlanReq.orderId = '833883177497890816';
        return mixPlanApi.modifyTPSLPlan(modifyTPSLPlanReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Planned entrustment (profit and loss stop) cancellation
     * @param cancelPlanReq
     */
    test('cancelPlan',()=>{
        const cancelPlanReq = new BitgetApi.CancelPlanReq();
        cancelPlanReq.symbol = 'BTCUSDT_UMCBL';
        cancelPlanReq.marginCoin = 'USDT';
        cancelPlanReq.planType = 'profit_plan';
        cancelPlanReq.orderId = '833883177497890816';
        return mixPlanApi.cancelPlan(cancelPlanReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get the current plan commission (profit stop and loss stop) list
     * @param symbol
     * @param isPlan
     */
    test('currentPlan',()=>{

        return mixPlanApi.currentPlan('BTCUSDT_UMCBL','plan').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain the list of historical plan commissions (profit and loss stop)
     * @param symbol
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param isPre
     * @param isPlan
     */
    test('historyPlan',()=>{

        return mixPlanApi.historyPlan('BTCUSDT_UMCBL','1627210955000','1627383755000','100',false,'').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

});

describe('MixPositionApiTest', () => {
    const mixPositionApi = new BitgetApi.MixPositionApi(apiKey,secretKey,passphrase,locale);
    /**
     * Obtain single contract position information
     * @param symbol
     * @param marginCoin
     */
    test('singlePosition',()=>{
        return mixPositionApi.singlePosition('BTCUSDT_UMCBL','USDT').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain all contract position information
     * @param productType
     * @param marginCoin
     */
    test('allPosition',()=>{
        return mixPositionApi.allPosition('umcbl','USDT').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('MixTraceApiTest', () => {
    const mixTraceApi = new BitgetApi.MixTraceApi(apiKey,secretKey,passphrase,locale);
    /**
     * Dealer closing interface
     * @param mixCloseTrackOrderReq
     */
    test('closeTraceOrder',()=>{
        const closeTrackOrderReq = new BitgetApi.CloseTrackOrderReq();
        closeTrackOrderReq.symbol = 'BTCUSDT_UMCBL';
        closeTrackOrderReq.trackingNo = '0';
        return mixTraceApi.closeTrackOrder(closeTrackOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * The trader obtains the current order
     * @param symbol
     * @param productType
     * @param pageSize
     * @param pageNo
     */
    test('currentTrack',()=>{

        return mixTraceApi.currentTrack('BTCUSDT_UMCBL','umcbl','50','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * The trader obtains the historical order
     * @param startTime
     * @param endTime
     * @param pageSize
     * @param pageNo
     */
    test('historyTrack',()=>{

        return mixTraceApi.historyTrack('','','50','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Summary of traders' profit sharing
     */
    test('summary',()=>{

        return mixTraceApi.summary().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Historical profit sharing summary of traders (by settlement currency)
     */
    test('profitSettleTokenIdGroup',()=>{

        return mixTraceApi.profitSettleTokenIdGroup().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Historical profit sharing summary of traders (by settlement currency and date)
     * @param pageSize
     * @param pageNo
     */
    test('profitDateGroupList',()=>{

        return mixTraceApi.profitDateGroupList('20','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Historical profit distribution details of traders
     * @param marginCoin
     * @param date
     * @param pageSize
     * @param pageNo
     */
    test('profitDateList',()=>{

        return mixTraceApi.profitDateList('USDT','1636532513987','10','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Details of traders to be distributed
     * @param pageSize
     * @param pageNo
     */
    test('waitProfitDateList',()=>{

        return mixTraceApi.waitProfitDateList('10','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Followers obtain documentary information
     * @param pageSize
     * @param pageNo
     * @param startTime
     * @param endTime
     */
    test('followerHistoryOrders',()=>{

        return mixTraceApi.followerHistoryOrders('10','1','1635782400000','1635852263953').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});