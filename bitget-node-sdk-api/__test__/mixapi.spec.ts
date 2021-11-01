import * as BitgetApi from '../src';
import { describe, test, expect } from '@jest/globals';

import {toJsonString} from '../src/lib/util';

import * as Console from 'console';



const apiKey = '';
const secretKey = '';
const passphrase = '';
describe('', () => {


    const mixAccountApi = new BitgetApi.MixAccountApi(apiKey,secretKey,passphrase);

    test('account', () => {
        return mixAccountApi.account('BTCUSDT_UMCBL','USDT').then((data) => {
            Console.info(toJsonString(data));
        });
    });

    test('accounts', () => {
        return mixAccountApi.accounts('umcbl').then((data) => {
            Console.info(toJsonString(data));
        });
    });

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
    test('setPositionMode', () => {
        const setPositionModeReq = new BitgetApi.SetPositionModeReq();
        setPositionModeReq.symbol = 'BTCUSDT_UMCBL';
        setPositionModeReq.marginCoin = 'USDT';
        setPositionModeReq.holdMode = 'double_hold';
        return mixAccountApi.setPositionMode(setPositionModeReq).then((data) => {
            Console.info(toJsonString(data));
        })
    })
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
    const mixMarketApi = new BitgetApi.MixMarketApi(apiKey,secretKey,passphrase);
    test('contracts',()=>{
        return mixMarketApi.contracts('sdmcbl').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('depth',()=>{
        return mixMarketApi.depth('BTCUSDT_UMCBL','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('ticker',()=>{
        return mixMarketApi.ticker('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('tickers',()=>{
        return mixMarketApi.tickers('umcbl').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('fills',()=>{
        return mixMarketApi.fills('BTCUSDT_UMCBL','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('candles',()=>{
        return mixMarketApi.candles('BTCUSDT_UMCBL','60','1629177891000','1629181491000').then((data)=>{
            Console.info(toJsonString(data));
        });
    })


    test('index',()=>{
        return mixMarketApi.index('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('fundingTime',()=>{
        return mixMarketApi.index('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('historyFundRate',()=>{
        return mixMarketApi.historyFundRate('BTCUSDT_UMCBL','20','1',false).then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('currentFundRate',()=>{
        return mixMarketApi.currentFundRate('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('openInterest',()=>{
        return mixMarketApi.openInterest('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('markPrice',()=>{
        return mixMarketApi.markPrice('BTCUSDT_UMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('MixOrderApiTest', () => {
    const mixOrderApi = new BitgetApi.MixOrderApi(apiKey,secretKey,passphrase);
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

    test('cancelOrder',()=>{
        const cancelOrderReq = new BitgetApi.CancelOrderReq();
        cancelOrderReq.symbol = 'SBTCSUSDT_SUMCBL';
        cancelOrderReq.marginCoin = 'SUSDT';
        cancelOrderReq.orderId = '811489712408248322';
        return mixOrderApi.cancelOrder(cancelOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })

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

    test('history',()=>{

        return mixOrderApi.history('SBTCSUSDT_SUMCBL','1629113823000','1629513368000',50,'',false).then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('current',()=>{

        return mixOrderApi.current('SBTCSUSDT_SUMCBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('detail',()=>{

        return mixOrderApi.detail('SBTCSUSDT_SUMCBL','811489712408248322').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('fills',()=>{

        return mixOrderApi.fills('SBTCSUSDT_SUMCBL','811489712408248322').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('MixPlanApiTest', () => {
    const mixPlanApi = new BitgetApi.MixPlanApi(apiKey,secretKey,passphrase);

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

    test('currentPlan',()=>{

        return mixPlanApi.currentPlan('BTCUSDT_UMCBL','plan').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('historyPlan',()=>{

        return mixPlanApi.historyPlan('BTCUSDT_UMCBL','1627210955000','1627383755000','100',false,'').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

});


describe('MixPositionApiTest', () => {
    const mixPositionApi = new BitgetApi.MixPositionApi(apiKey,secretKey,passphrase);

    test('singlePosition',()=>{
        return mixPositionApi.singlePosition('BTCUSDT_UMCBL','USDT').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('allPosition',()=>{
        return mixPositionApi.allPosition('umcbl','USDT').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('MixTraceApiTest', () => {
    const mixTraceApi = new BitgetApi.MixTraceApi(apiKey,secretKey,passphrase);

    test('closeTraceOrder',()=>{
        const closeTrackOrderReq = new BitgetApi.CloseTrackOrderReq();
        closeTrackOrderReq.symbol = 'BTCUSDT_UMCBL';
        closeTrackOrderReq.trackingNo = '0';
        return mixTraceApi.closeTrackOrder(closeTrackOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('currentTrack',()=>{

        return mixTraceApi.currentTrack('BTCUSDT_UMCBL','umcbl','50','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('historyTrack',()=>{

        return mixTraceApi.historyTrack('','','50','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('summary',()=>{

        return mixTraceApi.summary().then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('profitSettleTokenIdGroup',()=>{

        return mixTraceApi.profitSettleTokenIdGroup().then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('profitDateGroupList',()=>{

        return mixTraceApi.profitDateGroupList('20','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('profitDateList',()=>{

        return mixTraceApi.profitDateList('BTCUSDT_UMCBL','1','','').then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('waitProfitDateList',()=>{

        return mixTraceApi.waitProfitDateList('10','1').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});