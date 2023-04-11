import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossOrderApi, MarginCrossOrderApiApiKeys} from "../api/marginCrossOrderApi";
import {Config} from "../api/Config";
import {MarginOrderRequest} from "../model/marginOrderRequest";
import {MarginBatchOrdersRequest} from "../model/marginBatchOrdersRequest";
import {MarginCancelOrderRequest} from "../model/marginCancelOrderRequest";
import {MarginBatchCancelOrderRequest} from "../model/marginBatchCancelOrderRequest";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossOrderApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossOrderApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossOrderApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossOrderApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('marginCrossPlaceOrder', () => {
        let body: MarginOrderRequest = {
            symbol: "BTCUSDT",
            side: "buy",
            orderType: "market",
            timeInForce: "gtc",
            quoteAmount: "10",
            loanType: "normal",
        };
        return apiInstance.marginCrossPlaceOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.orderId).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossBatchPlaceOrder', () => {
        let item: MarginOrderRequest = {
            symbol: "BTCUSDT",
            side: "buy",
            orderType: "market",
            timeInForce: "gtc",
            quoteAmount: "10",
            loanType: "normal",
        };
        let body: MarginBatchOrdersRequest = {
            symbol: "BTCUSDT",
            orderList: [item]
        }
        return apiInstance.marginCrossBatchPlaceOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.resultList).not.toBeNull();
            expect(data.body.data.resultList[0].orderId).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossCancelOrder', () => {
        let body: MarginOrderRequest = {
            symbol: "BTCUSDT",
            side: "buy",
            orderType: "limit",
            price: "1600",
            timeInForce: "gtc",
            baseQuantity: "0.625",
            quoteAmount: "1000",
            loanType: "normal",
        };
        return apiInstance.marginCrossPlaceOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.orderId).not.toBeNull();

            let body: MarginCancelOrderRequest = {
                symbol: "BTCUSDT",
                orderId: data.body.data.orderId,
            };
            return apiInstance.marginCrossCancelOrder(body).then((data: any) => {
                Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
                expect(data).not.toBeNull();
                expect(data.body).not.toBeNull();
                expect(data.body.data).not.toBeNull();
                expect(data.body.code).toBe("00000");
                expect(data.body.msg).toBe("success");
                expect(data.body.data.orderId).not.toBeNull();
            }).catch((error: any) => {
                Console.log('API called error.', JSON.stringify(error));
                Console.error(error);
            });
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossBatchCancelOrder', () => {
        let body: MarginOrderRequest = {
            symbol: "BTCUSDT",
            side: "buy",
            orderType: "limit",
            price: "1600",
            timeInForce: "gtc",
            baseQuantity: "0.625",
            quoteAmount: "1000",
            loanType: "normal",
        };
        return apiInstance.marginCrossPlaceOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.orderId).not.toBeNull();

            let body: MarginBatchCancelOrderRequest = {
                symbol: "BTCUSDT",
                orderIds: [data.body.data.orderId],
            };
            return apiInstance.marginCrossBatchCancelOrder(body).then((data: any) => {
                Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
                expect(data).not.toBeNull();
                expect(data.body).not.toBeNull();
                expect(data.body.data).not.toBeNull();
                expect(data.body.code).toBe("00000");
                expect(data.body.msg).toBe("success");
                expect(data.body.data.resultList).not.toBeNull();
                expect(data.body.data.resultList[0].orderId).not.toBeNull();
            }).catch((error: any) => {
                Console.log('API called error.', JSON.stringify(error));
                Console.error(error);
            });
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossFills', () => {
        return apiInstance.marginCrossFills("BTCUSDT", "1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.orderList).not.toBeNull();
            for (let item of data.body.data.fills) {
                console.log(item);
                expect(item).not.toBeNull();
                expect(item.side).not.toBeNull();
                expect(item.source).not.toBeNull();
                expect(item.orderId).not.toBeNull();
                expect(item.fillId).not.toBeNull();
                expect(item.fees).not.toBeNull();
                expect(item.feeCcy).not.toBeNull();
                expect(item.fillPrice).not.toBeNull();
                expect(item.fillTotalAmount).not.toBeNull();
                expect(item.fillQuantity).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })


    test('marginCrossOpenOrders', () => {
        return apiInstance.marginCrossOpenOrders("BTCUSDT", "1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.orderList).not.toBeNull();
            for (let item of data.body.data.orderList) {
                console.log(item);
                expect(item.symbol).toBe("BTCUSDT");
                expect(item.orderType).not.toBeNull();
                expect(item.source).not.toBeNull();
                expect(item.orderId).not.toBeNull();
                expect(item.loanType).not.toBeNull();
                expect(item.price).not.toBeNull();
                expect(item.side).not.toBeNull();
                expect(item.status).not.toBeNull();
                expect(item.baseQuantity).not.toBeNull();
                expect(item.quoteAmount).not.toBeNull();
                expect(item.fillPrice).not.toBeNull();
                expect(item.fillTotalAmount).not.toBeNull();
                expect(item.fillQuantity).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossHistoryOrders', () => {
        return apiInstance.marginCrossHistoryOrders("BTCUSDT", "1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.orderList).not.toBeNull();
            for (let item of data.body.data.orderList) {
                console.log(item);
                expect(item).not.toBeNull();
                expect(item.symbol).toBe("BTCUSDT");
                expect(item.orderType).not.toBeNull();
                expect(item.source).not.toBeNull();
                expect(item.orderId).not.toBeNull();
                expect(item.loanType).not.toBeNull();
                expect(item.price).not.toBeNull();
                expect(item.side).not.toBeNull();
                expect(item.status).not.toBeNull();
                expect(item.baseQuantity).not.toBeNull();
                expect(item.quoteAmount).not.toBeNull();
                expect(item.fillPrice).not.toBeNull();
                expect(item.fillTotalAmount).not.toBeNull();
                expect(item.fillQuantity).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});