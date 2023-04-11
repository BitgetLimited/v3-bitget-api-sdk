import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginPublicApi, MarginPublicApiApiKeys} from "../api/marginPublicApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginPublicApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginPublicApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginPublicApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginPublicApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('marginPublicCurrencies', () => {
        return apiInstance.marginPublicCurrencies().then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.symbol).not.toBeNull();
                expect(item.quoteCoin).not.toBeNull();
                expect(item.baseCoin).not.toBeNull();
                expect(item.maxCrossLeverage).not.toBeNull();
                expect(item.liquidationRiskRatio).not.toBeNull();
                expect(item.maxTradeAmount).not.toBeNull();
                expect(item.makerFeeRate).not.toBeNull();
                expect(item.quantityScale).not.toBeNull();
                expect(item.isBorrowable).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});