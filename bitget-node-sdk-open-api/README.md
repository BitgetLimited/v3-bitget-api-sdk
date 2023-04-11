## bitget@1.0.0

This generator creates TypeScript-Node/JavaScript client that utilizes fetch-api.

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Publishing

First build the package then run ```npm publish```

### Consuming

navigate to the folder of your consuming project and run one of the following commands.

_published:_

```
npm install bitget@1.0.0 --save
```

_unPublished (not recommended):_

```
npm install PATH_TO_GENERATED_PACKAGE --save


```

### Demo
```JavaScript
import {describe, test} from '@jest/globals';

import * as Console from 'console';
import {MixOrderApi, MixOrderApiApiKeys} from "../api/mixOrderApi";
import {MixPlaceOrderRequest} from "../model/mixPlaceOrderRequest";

export * from '../api/apis';
export * from '../model/models';

describe('ApiTest', () => {
    test('placeOrder', () => {
        Console.info("ApiTest start");
        const apiInstance = new MixOrderApi("https://api.bitget.com");
        apiInstance.setApiKey(MixOrderApiApiKeys.ACCESS_KEY, "your value");
        apiInstance.setApiKey(MixOrderApiApiKeys.SECRET_KEY, "your value");
        apiInstance.setApiKey(MixOrderApiApiKeys.ACCESS_PASSPHRASE, "your value");

        let body: MixPlaceOrderRequest = {
            symbol: "BTCUSDT_UMCBL",
            marginCoin: "USDT",
            orderType: "market",
            side: "open_long",
            size: 0.01,
            timeInForceValue: "normal",
        };
        return apiInstance.placeOrder(body).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('getMarginCoinCurrent', () => {
        Console.info("ApiTest start");
        const apiInstance = new MixOrderApi("https://api.bitget.com");
        apiInstance.setApiKey(MixOrderApiApiKeys.ACCESS_KEY, "your value");
        apiInstance.setApiKey(MixOrderApiApiKeys.SECRET_KEY, "your value");
        apiInstance.setApiKey(MixOrderApiApiKeys.ACCESS_PASSPHRASE, "your value");
        return apiInstance.marginCoinCurrent("umcbl", "USDT").then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })

    test('history', () => {
        Console.info("ApiTest start");
        const apiInstance = new MixOrderApi("https://api.bitget.com");
        apiInstance.setApiKey(MixOrderApiApiKeys.ACCESS_KEY, "your value");
        apiInstance.setApiKey(MixOrderApiApiKeys.SECRET_KEY, "your value");
        apiInstance.setApiKey(MixOrderApiApiKeys.ACCESS_PASSPHRASE, "your value");
        return apiInstance.historyProductType("umcbl", "1671493129000", "1673517445000", "10", undefined, undefined).then((data: any) => {
            Console.log('API called successfully. Returned data: ' + JSON.stringify(data));
        }).catch((error: any) => {
            Console.log('API called error.', JSON.stringify(error));
            Console.error(error);
        });
    })
});
```