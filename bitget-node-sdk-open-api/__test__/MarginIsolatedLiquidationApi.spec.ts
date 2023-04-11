import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginIsolatedLiquidationApi, MarginIsolatedLiquidationApiApiKeys} from "../api/marginIsolatedLiquidationApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginIsolatedLiquidationApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginIsolatedLiquidationApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginIsolatedLiquidationApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginIsolatedLiquidationApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('isolatedLiquidationList', () => {
        return apiInstance.isolatedLiquidationList("BTCUSDT", "1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.liqId).not.toBeNull();
                expect(item.liqRisk).not.toBeNull();
                expect(item.totalAssets).not.toBeNull();
                expect(item.LiqFee).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});