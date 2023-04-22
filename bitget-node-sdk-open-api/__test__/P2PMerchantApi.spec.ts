import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {P2pMerchantApi, P2pMerchantApiApiKeys} from "../api/P2pMerchantApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new P2pMerchantApi(Config.BASE_PATH);
    apiInstance.setApiKey(P2pMerchantApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(P2pMerchantApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(P2pMerchantApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('merchantAdvList', () => {
        return apiInstance.merchantAdvList("1676260773000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.advList) {
                console.log(item);
                expect(item.advId).not.toBeNull();
                expect(item.type).not.toBeNull();
                expect(item.advNo).not.toBeNull();
                expect(item.amount).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('merchantList', () => {
        return apiInstance.merchantList("no").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.nickName).not.toBeNull();
                expect(item.merchantId).not.toBeNull();
                expect(item.isOnline).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('merchantOrderList', () => {
        return apiInstance.merchantOrderList("1680598302000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.orderList) {
                console.log(item);
                expect(item.orderId).not.toBeNull();
                expect(item.orderNo).not.toBeNull();
                expect(item.advNo).not.toBeNull();
                expect(item.price).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('merchantInfo', () => {
        return apiInstance.merchantInfo().then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.nickName).not.toBeNull();
            expect(data.body.data.merchantId).not.toBeNull();
            expect(data.body.data.email).not.toBeNull();
            expect(data.body.data.mobile).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});