import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossFinflowApi, MarginCrossFinflowApiApiKeys} from "../api/marginCrossFinflowApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossFinflowApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossFinflowApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossFinflowApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossFinflowApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('crossFinList', () => {
        return apiInstance.crossFinList("1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.marginId).not.toBeNull();
                expect(item.coin).not.toBeNull();
                expect(item.marginType).not.toBeNull();
                expect(item.balance).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});