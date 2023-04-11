import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginIsolatedAccountApi, MarginIsolatedAccountApiApiKeys} from "../api/marginIsolatedAccountApi";
import {Config} from "../api/Config";
import {MarginIsolatedLimitRequest} from "../model/marginIsolatedLimitRequest";
import {MarginIsolatedMaxBorrowRequest} from "../model/marginIsolatedMaxBorrowRequest";
import {MarginIsolatedRepayRequest} from "../model/marginIsolatedRepayRequest";
import {MarginIsolatedAssetsRiskRequest} from "../model/marginIsolatedAssetsRiskRequest";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginIsolatedAccountApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginIsolatedAccountApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginIsolatedAccountApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginIsolatedAccountApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('marginIsolatedAccountAssets', () => {
        return apiInstance.marginIsolatedAccountAssets("BTCUSDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.symbol).toBe("BTCUSDT");
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

    test('marginIsolatedAccountBorrow', () => {
        let body: MarginIsolatedLimitRequest = {
            coin: "USDT",
            symbol: "BTCUSDT",
            borrowAmount: '1',
        };
        return apiInstance.marginIsolatedAccountBorrow(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.coin).toBe("USDT");
            expect(data.body.data.symbol).toBe("BTCUSDT");
            expect(data.body.data.borrowAmount).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginIsolatedAccountMaxBorrowableAmount', () => {
        let body: MarginIsolatedMaxBorrowRequest = {
            coin: "USDT",
            symbol: "BTCUSDT",
        };
        return apiInstance.marginIsolatedAccountMaxBorrowableAmount(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            expect(data.body.data.coin).toBe("USDT");
            expect(data.body.data.symbol).toBe("BTCUSDT");
            expect(data.body.data.maxBorrowableAmount).not.toBeNull();
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginIsolatedAccountMaxTransferOutAmount', () => {
        return apiInstance.marginIsolatedAccountMaxTransferOutAmount("USDT","BTCUSDT").then((data: any) => {
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

    test('marginIsolatedAccountRepay', () => {
        let body: MarginIsolatedRepayRequest = {
            coin: "USDT",
            symbol: "BTCUSDT",
            repayAmount: "1"
        };
        return apiInstance.marginIsolatedAccountRepay(body).then((data: any) => {
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

    test('marginIsolatedAccountRiskRate', () => {
        let body: MarginIsolatedAssetsRiskRequest = {
            symbol: "BTCUSDT",
        };
        return apiInstance.marginIsolatedAccountRiskRate(body).then((data: any) => {
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