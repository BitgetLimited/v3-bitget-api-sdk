# Instructions for use

## Install

```bash
npm i bitget-api-node-sdk
```

## Run

```bash
git clone https://github.com/BitgetLimited/v3-bitget-api-sdk.git
cd v3-bitget-api-sdk/bitget-node-sdk-api
npm run install
npm run build
```

## Test

| File name | Description |
| :-----------------------------: | :------------- -----: |
| \_\_test\_\_/api.spec.ts | Spot/contract related test cases |
| \_\_test\_\_/websocketTest.spec.ts | Message push related test cases |


## API Example

```javascript
import BitgetResetApi from '../src';
import Console from 'console';
import {describe, test} from '@jest/globals'
import {toJsonString} from '../src/lib/util';
import {MixOrderApi} from '../src/lib/v2/MixOrderApi';

const apiKey = '';
const secretKey = '';
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
        const qsOrBody = {'symbol': 'btcusdt_spbl'};
        return bitgetApi.get("/api/spot/v1/market/depth", qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })

    test('send get request directly If the interface is not defined in the sdk', () => {
        const qsOrBody = {'productType': 'umcbl'};
        return bitgetApi.get("/api/mix/v1/account/accounts", qsOrBody).then((data) => {
            Console.info(toJsonString(data));
        });
    })
});
```

## websocket example

```javascript
var bitgetApi = require("bitget-openapi")
var Console = require("console")

const apiKey = '';
const secretKey = '';
const passphrase = '';
//Implementation class for processing messages
class ListennerObj extends bitgetApi.Listenner{
     reveice(message){
         Console.info('>>>>'+message);
     }
}

const listenner = new ListennerObj();
const bitgetWsClient = new bitgetApi.BitgetWsClient(listenner,apiKey,secretKey,passphrase);
const subArr = new Array();

const subscribeOne = new bitgetApi.SubscribeReq('mc','ticker','BTCUSD');
const subscribeTow = new bitgetApi.SubscribeReq('SP','candle1W','BTCUSDT');

subArr.push(subscribeOne);
subArr.push(subscribeTow);

bitgetWsClient.subscribe(subArr)
```

## RSA
If your apikey is of RSA type, actively set the signature type to RSA
```node
// config.ts
export let API_CONFIG = {
    WS_URL: 'wss://ws.bitget.com/mix/v1/stream',
    API_URL: 'https://api.bitget.com',
    SIGN_TYPE : BIZ_CONSTANT.RSA // If your apikey is of RSA type, actively set the signature type to RSA
}
```