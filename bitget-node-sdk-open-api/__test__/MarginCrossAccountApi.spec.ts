import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossAccountApi, MarginCrossAccountApiApiKeys} from "../api/marginCrossAccountApi";
import {Config} from "../api/Config";
import {MarginCrossLimitRequest} from "../model/marginCrossLimitRequest";
import {MarginCrossMaxBorrowRequest} from "../model/marginCrossMaxBorrowRequest";
import {MarginCrossRepayRequest} from "../model/marginCrossRepayRequest";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossAccountApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossAccountApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossAccountApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossAccountApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('marginCrossAccountAssets', () => {
        return apiInstance.marginCrossAccountAssets("USDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.coin).toBe("USDT");
                expect(item.totalAmount).not.toBeNull();
                expect(item.available).not.toBeNull();
                expect(item.frozen).not.toBeNull();
                expect(item.borrow).not.toBeNull();
                expect(item.interest).not.toBeNull();
                expect(item.net).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossAccountBorrow', () => {
        let body: MarginCrossLimitRequest = {
            coin: "USDT",
            borrowAmount: '1',
        };
        return apiInstance.marginCrossAccountBorrow(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.coin).toBe("USDT");
            expect(data.body.data.borrowAmount).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossAccountMaxBorrowableAmount', () => {
        let body: MarginCrossMaxBorrowRequest = {
            coin: "USDT",
        };
        return apiInstance.marginCrossAccountMaxBorrowableAmount(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.coin).toBe("USDT");
            expect(data.body.data.maxBorrowableAmount).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossAccountMaxTransferOutAmount', () => {
        return apiInstance.marginCrossAccountMaxTransferOutAmount("USDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.coin).toBe("USDT");
            expect(data.body.data.maxTransferOutAmount).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossAccountRepay', () => {
        let body: MarginCrossRepayRequest = {
            coin: "USDT",
            repayAmount: "1"
        };
        return apiInstance.marginCrossAccountRepay(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.coin).toBe("USDT");
            expect(data.body.data.repayAmount).not.toBeNull();
            expect(data.body.data.remainDebtAmount).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossAccountRiskRate', () => {
        return apiInstance.marginCrossAccountRiskRate().then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.riskRate).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});