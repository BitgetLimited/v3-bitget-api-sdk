import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossPublicApi, MarginCrossPublicApiApiKeys} from "../api/marginCrossPublicApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossPublicApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossPublicApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossPublicApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossPublicApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('marginCrossPublicInterestRateAndLimit', () => {
        return apiInstance.marginCrossPublicInterestRateAndLimit("USDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.coin).toBe("USDT");
                expect(item.leverage).not.toBeNull();
                expect(item.transferInAble).not.toBeNull();
                expect(item.borrowAble).not.toBeNull();
                expect(item.dailyInterestRate).not.toBeNull();
                expect(item.yearlyInterestRate).not.toBeNull();
                expect(item.maxBorrowableAmount).not.toBeNull();
                expect(item.vips).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('marginCrossPublicTierData', () => {
        return apiInstance.marginCrossPublicTierData("USDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.coin).toBe("USDT");
                expect(item.tier).not.toBeNull();
                expect(item.leverage).not.toBeNull();
                expect(item.maxBorrowableAmount).not.toBeNull();
                expect(item.maintainMarginRate).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});