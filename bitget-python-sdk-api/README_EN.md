### How to use Python SDK？

`python version：3.6+`

`WebSocketAPI：advice websockets library 1.4.2+`

#### First：Download SDK，install Library

1.1 Download `python SDK`
* Clone or Download the SDK directory locally and choose to use bitget-python-sdk-api

1.2 Install required libraries
```python
pip install requests
pip install websocket-client
```

#### Second：Configure Apikey information

2.1 If there is no API yet, you can [click](https://www.bitget.com/zh-CN/account/newapi) to go to the official website to apply.

2.2 Put all information in`example_*.py（RestAPI）`and `example_ws_contract.py（WebSocketAPI）`
```python
api_key = ""
secret_key = ""
passphrase = ""
```
#### Third：Use example

* RestAPI

  * run`example.py`

  * Unlock the annotations of the corresponding methods, pass parameters, and call each interface.

  * If your apikey is of RSA type, actively set the signature type to RSA: set the value of SIGN_TYPE to RSA in the `constans.py` file, such as SIGN_TYPE = RSA
```php
import bitget.v1.mix.order_api as maxOrderApi
import bitget.bitget_api as baseApi

from bitget.exceptions import BitgetAPIException

if __name__ == '__main__':
    apiKey = ""
    secretKey = '''your'''
    passphrase = ""

    # Demo 1:place order
    maxOrderApi = maxOrderApi.OrderApi(apiKey, secretKey, passphrase)
    try:
        params = {}
        params["symbol"] = "BTCUSDT_UMCBL"
        params["marginCoin"] = "USDT"
        params["side"] = "open_long"
        params["orderType"] = "limit"
        params["price"] = "27012"
        params["size"] = "0.01"
        params["timInForceValue"] = "normal"
        response = maxOrderApi.placeOrder(params)
        print(response)
    except BitgetAPIException as e:
        print("error:" + e.message)

    # Demo 2:place order by post directly
    baseApi = baseApi.BitgetApi(apiKey, secretKey, passphrase)
    try:
        params = {}
        params["symbol"] = "BTCUSDT_UMCBL"
        params["marginCoin"] = "USDT"
        params["side"] = "open_long"
        params["orderType"] = "limit"
        params["price"] = "27012"
        params["size"] = "0.01"
        params["timInForceValue"] = "normal"
        response = baseApi.post("/api/mix/v1/order/placeOrder", params)
        print(response)
    except BitgetAPIException as e:
        print("error:" + e.message)

    # Demo 3:send get request
    try:
        params = {}
        params["productType"] = "umcbl"
        response = baseApi.get("/api/mix/v1/market/contracts", params)
        print(response)
    except BitgetAPIException as e:
        print("error:" + e.message)

    # Demo 4:send get request with no params
    try:
        response = baseApi.get("/api/spot/v1/account/getInfo", {})
        print(response)
    except BitgetAPIException as e:
        print("error:" + e.message)
```

* WebSocketAPI

  * run `example_ws_contract.py`

  * Select the corresponding startup method according to the personal/public channel, and unlock the annotation of the corresponding channel.

  * If your apikey is of RSA type, actively set the signature type to RSA: set the value of SIGN_TYPE to RSA in the `constans.py` file, such as SIGN_TYPE = RSA

    ```python
    # Public channel does not require login (market, K-line, transaction data, depth data, mark price and other channels)
    client = BitgetWsClient(CONTRACT_WS_URL, need_login=False) \
        .api_key(api_key) \
        .api_secret_key(secret_key) \
        .passphrase(passphrase) \
        .error_listener(handel_error) \
        .build()

    channles = [SubscribeReq("mc", "ticker", "BTCUSD"), SubscribeReq("SP", "candle1W", "BTCUSDT")]
    client.subscribe(channles,handle)
    
    # private channel need login（account，orders，position channels）
    client = BitgetWsClient(CONTRACT_WS_URL, need_login=True) \
        .api_key(api_key) \
        .api_secret_key(secret_key) \
        .passphrase(passphrase) \
        .error_listener(handel_error) \
        .build()

    channles = [SubscribeReq("umcbl", "order", "BTCUSDT")]
    client.subscribe(channles,handle)  
  
    ```

Tips：

* If you don’t know the API yet, it is recommended to refer to the `Bitget` official [API document](https://bitgetlimited.github.io/apidoc/zh/spot/)

