import {describe, expect, test} from '@jest/globals';

import * as Console from 'console';

import {SpotTraceProfitApi, SpotTraceProfitApiApiKeys} from "../api/SpotTraceProfitApi";
import {Config} from "../api/Config";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    const apiInstance = new SpotTraceProfitApi(Config.BASE_PATH);
    apiInstance.setApiKey(SpotTraceProfitApiApiKeys.ACCESS_KEY, Config.API_KEY);
    apiInstance.setApiKey(SpotTraceProfitApiApiKeys.SECRET_KEY, Config.SECRET_KEY);
    apiInstance.setApiKey(SpotTraceProfitApiApiKeys.ACCESS_PASSPHRASE, Config.PASSPHRASE);

    test('spotTraceTotalProfitInfo', () => {
        return apiInstance.spotTraceTotalProfitInfo().then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceTotalProfitList', () => {
        return apiInstance.spotTraceTotalProfitList({}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.productCode).not.toBeNull();
                expect(item.profit).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceProfitHisList', () => {
        return apiInstance.spotTraceProfitHisList({}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data) {
                console.log(item);
                expect(item.coinName).not.toBeNull();
                expect(item.date).not.toBeNull();
                expect(item.profit).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceProfitHisDetailList', () => {
        return apiInstance.spotTraceProfitHisDetailList({date: "1681985100000", coinName: "USDT"}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
            for (let item of data.body.data.resultList) {
                console.log(item);
                expect(item.coinName).not.toBeNull();
                expect(item.profit).not.toBeNull();
                expect(item.distributeRatio).not.toBeNull();
            }
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('spotTraceWaitProfitDetailList', () => {
        return apiInstance.spotTraceWaitProfitDetailList({}).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
            expect(data).not.toBeNull();
            expect(data.body).not.toBeNull();
            expect(data.body.data).not.toBeNull();
            expect(data.body.code).toBe("00000");
            expect(data.body.msg).toBe("success");
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});