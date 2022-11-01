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
|    \_\_test\_\_/mixapi.spec.ts     |   合约相关测试用例   |
|    \_\_test\_\_/spotapi.spec.ts    |   现货相关测试用例   |
| \_\_test\_\_/websocketTest.spec.ts | 消息推送相关测试用例 |
|                                    |                      |

## API示例

```javascript
const bitgetApi = require('bitget-openapi');
const { test, describe, expect } = require('@jest/globals')
const   Console  = require('console')

const apiKey = '';
const secretKey = '';
const passphrase = '';
describe('test accounts', () => {
  test('accounts', () => {
    const mixAccountApi = new bitgetApi.default.MixAccountApi(apiKey,secretKey,passphrase);
    mixAccountApi.accounts('umcbl').then((data) => {
      Console.info(data);
    });
  })
})
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
