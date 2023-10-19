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


##Example

```javascript
const bitgetApi = require('bitget-openapi');
const { test, describe, expect } = require('@jest/globals')
const Console = require('console')

const apiKey = '';
const secretKey = '';
const passphrase = '';
describe('test order', () => {
   test('order', () => {
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
})
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