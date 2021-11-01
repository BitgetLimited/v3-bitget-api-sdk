import * as BitgetApi from '../src';
import Console from 'console';
import { describe, test, expect } from '@jest/globals'
import {toJsonString} from '../src/lib/util';
import {BillsReq} from '../src/lib/model/spot/account/BillsReq';
import {OrdersReq} from '../src/lib/model/spot/order/OrdersReq';
import {BatchOrdersReq} from '../src/lib/model/spot/order/BatchOrdersReq';
import {CancelOrderReq} from '../src/lib/model/spot/order/CancelOrderReq';
import {CancelBatchOrderReq} from '../src/lib/model/spot/order/CancelBatchOrderReq';
import {OrderInfoReq} from '../src/lib/model/spot/order/OrderInfoReq';
import {OpenOrdersReq} from '../src/lib/model/spot/order/OpenOrdersReq';
import {HistoryReq} from '../src/lib/model/spot/order/HistoryReq';
import {FillsReq} from '../src/lib/model/spot/order/FillsReq';

const apiKey = '';
const secretKey = '';
const passphrase = '';

describe('SpotMarketApiTest', () => {
    const spotMarketApi = new BitgetApi.SpotMarketApi(apiKey,secretKey,passphrase);

    test('fills',()=>{
        return spotMarketApi.fills('btcusdt_spbl','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('depth',()=>{
        return spotMarketApi.depth('umcbl','USDT','step0').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('ticker',()=>{
        return spotMarketApi.ticker('btcusdt_spbl').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('tickers',()=>{
        return spotMarketApi.tickers().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('candles',()=>{
        return spotMarketApi.candles('btcusdt_spbl','1min','1624929806000','1624933406000','50').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});


describe('SpotPublicApiTest', () => {
    const spotPublicApi = new BitgetApi.SpotPublicApi(apiKey,secretKey,passphrase);

    test('time',()=>{
        return spotPublicApi.time().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('currencies',()=>{
        return spotPublicApi.currencies().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('products',()=>{
        return spotPublicApi.products().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('product',()=>{
        return spotPublicApi.product('ETHUSDT_SPBL').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});


describe('SpotAccountApiTest', () => {
    const spotAccountApi = new BitgetApi.SpotAccountApi(apiKey,secretKey,passphrase);

    test('assets',()=>{
        return spotAccountApi.assets().then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('bills',()=>{
        const billsReq = new BillsReq();
        return spotAccountApi.bills(billsReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('transferRecords',()=>{
        return spotAccountApi.transferRecords('2','USDT_MIX','10','','').then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});

describe('SpotOrderApiTest', () => {
    const spotOrderApi = new BitgetApi.SpotOrderApi(apiKey,secretKey,passphrase);

    test('orders',()=>{
        const ordersReq = new OrdersReq();
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
    test('batchOrders',()=>{
        const batchOrdersReq = new BatchOrdersReq();
        const orderReqOne = new OrdersReq();
        orderReqOne.price = '2.68111';
        orderReqOne.quantity = '10';
        orderReqOne.side = 'buy';
        orderReqOne.orderType = 'limit';
        orderReqOne.force = 'normal';
        orderReqOne.clientOrderId = Date.now()+'';

        const orderReqTow = new OrdersReq();
        orderReqTow.price = '2.68222';
        orderReqTow.quantity = '10';
        orderReqTow.side = 'buy';
        orderReqTow.orderType = 'limit';
        orderReqTow.force = 'normal';
        orderReqTow.clientOrderId = Date.now()+'';


        const orderList = new Array<OrdersReq>();
        orderList.push(orderReqOne);
        orderList.push(orderReqTow);

        batchOrdersReq.symbol = 'bftusdt_spbl';
        batchOrdersReq.orderList = orderList;
        return spotOrderApi.batchOrders(batchOrdersReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('cancelOrder',()=>{
        const cancelOrderReq = new CancelOrderReq();
        cancelOrderReq.orderId = '';
        cancelOrderReq.symbol = 'bftusdt_spbl';
        return spotOrderApi.cancelOrder(cancelOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('cancelBatchOrder',()=>{
        const cancelBatchOrderReq = new CancelBatchOrderReq();
        cancelBatchOrderReq.symbol = 'bftusdt_spbl';
        const orderIds = new Array<string>();
        orderIds.push('');
        orderIds.push('');
        cancelBatchOrderReq.orderIds = orderIds;
        return spotOrderApi.cancelBatchOrder(cancelBatchOrderReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('orderInfo',()=>{
        const orderInfoReq = new OrderInfoReq();
        orderInfoReq.orderId = '123456';
        return spotOrderApi.orderInfo(orderInfoReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
    test('openOrders',()=>{
        const openOrdersReq = new OpenOrdersReq();
        openOrdersReq.symbol = 'bftusdt_spbl';
        return spotOrderApi.openOrders(openOrdersReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('history',()=>{
        const historyReq = new HistoryReq();
        historyReq.symbol = 'bftusdt_spbl';
        return spotOrderApi.history(historyReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })

    test('fills',()=>{
        const fillsReq = new FillsReq();
        fillsReq.symbol = 'bftusdt_spbl';
        fillsReq.orderId = '791113184589549568';
        return spotOrderApi.fills(fillsReq).then((data)=>{
            Console.info(toJsonString(data));
        });
    })
});