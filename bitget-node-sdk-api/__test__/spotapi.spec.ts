import * as BitgetApi from '../src';
import Console from 'console';
import { describe, test, expect } from '@jest/globals'
import {toJsonString} from '../src/lib/util';
import {SpotBillsReq} from '../src';
import {SpotOrdersReq} from '../src';
import {SpotBatchOrdersReq} from '../src';
import {SpotCancelOrderReq} from '../src';
import {SpotCancelBatchOrderReq} from '../src';
import {SpotOrderInfoReq} from '../src';
import {SpotOpenOrdersReq} from '../src';
import {SpotHistoryReq} from '../src';
import {SpotFillsReq} from '../src';
import {LOCAL} from '../src/lib/config';

const apiKey = '';
const secretKey = '';
const passphrase = '';
const locale = LOCAL.ZH_CH;
describe('SpotMarketApiTest', () => {
    const spotMarketApi = new BitgetApi.SpotMarketApi(apiKey,secretKey,passphrase,locale);
    /**
     * Obtain transaction data
     * @param symbol
     * @param limit
     */
    test('fills',()=>{
        return spotMarketApi.fills('btcusdt_spbl','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    },30000)
    /**
     * Get depth data
     * @param symbol
     * @param limit
     * @param type
     */
    test('depth',()=>{
        return spotMarketApi.depth('umcbl','USDT','step0').then((data)=>{
            Console.info(toJsonString(data));
        });
    },30000)
    /**
     * Get a Ticker Information
     * @param symbol
     */
    test('ticker',()=>{
        return spotMarketApi.ticker('btcusdt_spbl').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get all Ticker information
     */
    test('tickers',()=>{
        return spotMarketApi.tickers().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain K line data
     * @param symbol
     * @param period (Time unit and granularity of K line (refer to the following list for values))
     * @param after
     * @param before
     * @param limit
     */
    test('candles',()=>{
        return spotMarketApi.candles('btcusdt_spbl','1min','1624929806000','1624933406000','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});


describe('SpotPublicApiTest', () => {
    const spotPublicApi = new BitgetApi.SpotPublicApi(apiKey,secretKey,passphrase,locale);
    /**
     * Get server time
     */
    test('time',()=>{
        return spotPublicApi.time().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Basic information of currency
     */
    test('currencies',()=>{
        return spotPublicApi.currencies().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get all product information
     */
    test('products',()=>{
        return spotPublicApi.products().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get single product information
     * @param symbol
     */
    test('product',()=>{
        return spotPublicApi.product('ETHUSDT_SPBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});


describe('SpotAccountApiTest', () => {
    const spotAccountApi = new BitgetApi.SpotAccountApi(apiKey,secretKey,passphrase,locale);
    /**
     * Obtain account assets
     */
    test('assets',()=>{
        return spotAccountApi.assets().then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    /**
     * Get the bill flow
     * @param spotBillQueryReq
     */
    test('bills',()=>{
        const billsReq = new SpotBillsReq();
        return spotAccountApi.bills(billsReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain transfer records
     * @param coinId
     * @param fromType
     * @param limit
     * @param after
     * @param before
     */
    test('transferRecords',()=>{
        return spotAccountApi.transferRecords('2','USDT_MIX','10','','').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('SpotOrderApiTest', () => {
    const spotOrderApi = new BitgetApi.SpotOrderApi(apiKey,secretKey,passphrase,locale);
    /**
     * place an order
     * @param ordersReq
     */
    test('orders',()=>{
        const ordersReq = new SpotOrdersReq();
        ordersReq.symbol = 'bftusdt_spbl';
        ordersReq.price = '2.68222';
        ordersReq.quantity = '10';
        ordersReq.side = 'buy';
        ordersReq.orderType = 'limit';
        ordersReq.force = 'normal';
        return spotOrderApi.orders(ordersReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Place orders in batches
     * @param batchOrdersReq
     */
    test('batchOrders',()=>{
        const batchOrdersReq = new SpotBatchOrdersReq();
        const orderReqOne = new SpotOrdersReq();
        orderReqOne.price = '2.68111';
        orderReqOne.quantity = '10';
        orderReqOne.side = 'buy';
        orderReqOne.orderType = 'limit';
        orderReqOne.force = 'normal';
        orderReqOne.clientOrderId = Date.now()+'';

        const orderReqTow = new SpotOrdersReq();
        orderReqTow.price = '2.68222';
        orderReqTow.quantity = '10';
        orderReqTow.side = 'buy';
        orderReqTow.orderType = 'limit';
        orderReqTow.force = 'normal';
        orderReqTow.clientOrderId = Date.now()+'';


        const orderList = new Array<SpotOrdersReq>();
        orderList.push(orderReqOne);
        orderList.push(orderReqTow);

        batchOrdersReq.symbol = 'bftusdt_spbl';
        batchOrdersReq.orderList = orderList;
        return spotOrderApi.batchOrders(batchOrdersReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * cancel the order
     * @param cancelOrderReq
     */
    test('cancelOrder',()=>{
        const cancelOrderReq = new SpotCancelOrderReq();
        cancelOrderReq.orderId = '';
        cancelOrderReq.symbol = 'bftusdt_spbl';
        return spotOrderApi.cancelOrder(cancelOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Batch cancellation
     * @param cancelBatchOrderReq
     */
    test('cancelBatchOrder',()=>{
        const cancelBatchOrderReq = new SpotCancelBatchOrderReq();
        cancelBatchOrderReq.symbol = 'bftusdt_spbl';
        const orderIds = new Array<string>();
        orderIds.push('');
        orderIds.push('');
        cancelBatchOrderReq.orderIds = orderIds;
        return spotOrderApi.cancelBatchOrder(cancelBatchOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get order details
     * @param orderInfoReq
     */
    test('orderInfo',()=>{
        const orderInfoReq = new SpotOrderInfoReq();
        orderInfoReq.orderId = '123456';
        return spotOrderApi.orderInfo(orderInfoReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain orders that have not been closed or partially closed but not cancelled
     * @param openOrdersReq
     */
    test('openOrders',()=>{
        const openOrdersReq = new SpotOpenOrdersReq();
        openOrdersReq.symbol = 'bftusdt_spbl';
        return spotOrderApi.openOrders(openOrdersReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Get historical delegation list
     * @param historyReq
     */
    test('history',()=>{
        const historyReq = new SpotHistoryReq();
        historyReq.symbol = 'bftusdt_spbl';
        return spotOrderApi.history(historyReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    /**
     * Obtain transaction details
     * @param fillsReq
     */
    test('fills',()=>{
        const fillsReq = new SpotFillsReq();
        fillsReq.symbol = 'bftusdt_spbl';
        fillsReq.orderId = '791113184589549568';
        return spotOrderApi.fills(fillsReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});