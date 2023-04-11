import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossInterestApi, MarginCrossInterestApiApiKeys} from "../api/marginCrossInterestApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossInterestApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossInterestApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossInterestApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossInterestApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('crossInterestList', () => {
        return apiInstance.crossInterestList("1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.interestId).not.toBeNull();
                expect(item.loanCoin).not.toBeNull();
                expect(item.amount).not.toBeNull();
                expect(item.type).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});