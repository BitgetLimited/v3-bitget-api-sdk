import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginIsolatedPublicApi, MarginIsolatedPublicApiApiKeys} from "../api/marginIsolatedPublicApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginIsolatedPublicApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginIsolatedPublicApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginIsolatedPublicApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginIsolatedPublicApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('marginIsolatedPublicInterestRateAndLimit', () => {
        return apiInstance.marginIsolatedPublicInterestRateAndLimit("BTCUSDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.symbol).toBe("BTCUSDT");
                expect(item.leverage).not.toBeNull();
                expect(item.baseCoin).not.toBeNull();
                expect(item.baseBorrowAble).not.toBeNull();
                expect(item.baseDailyInterestRate).not.toBeNull();
                expect(item.baseYearlyInterestRate).not.toBeNull();
                expect(item.baseMaxBorrowableAmount).not.toBeNull();
                expect(item.baseVips).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginIsolatedPublicTierDatatier', () => {
        return apiInstance.marginIsolatedPublicTierData("BTCUSDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.symbol).toBe("BTCUSDT");
                expect(item.tier).not.toBeNull();
                expect(item.leverage).not.toBeNull();
                expect(item.baseCoin).not.toBeNull();
                expect(item.quoteCoin).not.toBeNull();
                expect(item.baseMaxBorrowableAmount).not.toBeNull();
                expect(item.quoteMaxBorrowableAmount).not.toBeNull();
                expect(item.maintainMarginRate).not.toBeNull();
                expect(item.initRate).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});