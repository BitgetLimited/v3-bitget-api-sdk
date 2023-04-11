import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {MarginCrossBorrowApi, MarginCrossBorrowApiApiKeys} from "../api/marginCrossBorrowApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new MarginCrossBorrowApi(Config.BASE_PATH);
    apiInstance.setApiKey(MarginCrossBorrowApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(MarginCrossBorrowApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(MarginCrossBorrowApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('crossLiquidationList', () => {
        return apiInstance.crossLoanList("1679133422000").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.loanId).not.toBeNull();
                expect(item.coin).not.toBeNull();
                expect(item.amount).not.toBeNull();
                expect(item.type).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

});