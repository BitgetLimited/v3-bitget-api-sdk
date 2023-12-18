import BitgetResetApi from '../src';
import Console from 'console';
import {describe, test} from '@jest/globals'
import {toJsonString} from '../src/lib/util';
import {MixOrderApi} from '../src/lib/v2/MixOrderApi';

const apiKey = '';
const secretKey = "";
const passphrase = '';
describe('ApiTest', () => {
    const mixOrderApi = new BitgetResetApi.MixOrderApi(apiKey, secretKey, passphrase);
    const mixOrderV2Api = new MixOrderApi(apiKey, secretKey, passphrase);
    const bitgetApi = new BitgetResetApi.BitgetApi(apiKey, secretKey, passphrase);

    test('place order', () => {
        const qsOrBody = {
            'symbol': 'BTCUSDT_UMCBL',
            'marginCoin': 'USDT',
            'side': 'open_long',
            'orderType': 'limit',
            'price': '27012',
            'size': '0.01',
            'timInForceValue': 'normal'
        };
        return mixOrderApi.placeOrder(qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })

    test('send post request directly If the interface is not defined in the sdk', () => {
        const qsOrBody = {
            'symbol': 'BTCUSDT_UMCBL',
            'marginCoin': 'USDT',
            'side': 'open_long',
            'orderType': 'limit',
            'price': '27012',
            'size': '0.01',
            'timInForceValue': 'normal'
        };
        return bitgetApi.post("/api/mix/v1/order/placeOrder", qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })

    test('send get request directly If the interface is not defined in the sdk', () => {
        const qsOrBody = {'symbol': 'btcusdt_spbl','b':'b','a':'a'};
        return bitgetApi.get("/api/spot/v1/market/depth", qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })

    test('send get request directly If the interface is not defined in the sdk need auth', () => {
        const qsOrBody = {'productType': 'umcbl','b':'b','a':'a'};
        return bitgetApi.get("/api/mix/v1/account/accounts", qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })

    test('send get request directly If the interface is not defined in the sdk need auth spot', () => {
        const qsOrBody = {};
        return bitgetApi.get("/api/spot/v1/account/getInfo", qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })
});

