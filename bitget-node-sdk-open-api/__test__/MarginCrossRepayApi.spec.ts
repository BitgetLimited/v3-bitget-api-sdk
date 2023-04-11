import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossRepayApi, MarginCrossRepayApiApiKeys} from "../api/marginCrossRepayApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossRepayApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossRepayApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossRepayApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossRepayApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('crossRepayList', () => {
        return apiInstance.crossRepayList("1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.repayId).not.toBeNull();
                expect(item.coin).not.toBeNull();
                expect(item.totalAmount).not.toBeNull();
                expect(item.type).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});