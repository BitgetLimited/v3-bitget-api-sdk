# 使用说明

## 安装

```bash
npm i bitget-api-node-sdk
```

## 本地运行

```bash
git clone https://github.com/BitgetLimited/v3-bitget-api-sdk.git
cd v3-bitget-api-sdk/bitget-node-sdk-api
npm run install
npm run build
```

## 测试用例

|               文件名               |         说明         |
| :--------------------------------: | :------------------: |
|    \_\_test\_\_/api.spec.ts     |   现货/合约相关测试用例   |
| \_\_test\_\_/websocketTest.spec.ts | 消息推送相关测试用例 |


## API示例

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

## websocket示例

```javascript
var bitgetApi = require("bitget-openapi")
var Console = require("console")

const apiKey = '';
const secretKey = '';
const passphrase = '';
//处理消息的实现类
class ListennerObj extends bitgetApi.Listenner{
    reveice(message){
        Console.info('>>>'+message);
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
如果你的apikey是RSA类型则主动设置签名类型为RSA
```node
// config.ts
export let API_CONFIG = {
    WS_URL: 'wss://ws.bitget.com/mix/v1/stream',
    API_URL: 'https://api.bitget.com',
    SIGN_TYPE : BIZ_CONSTANT.RSA // 如果你的apikey是RSA类型则主动设置签名类型为RSA
}
```