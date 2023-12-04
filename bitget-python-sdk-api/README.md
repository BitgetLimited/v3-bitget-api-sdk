### 如何使用？

`python版本：3.6+`

`WebSocketAPI：建议websockets库版本为1.4.2+`

#### 第一步：下载SDK，安装相关所需库

1.1 下载`python SDK`
* 将SDK目录`Clone`或者`Download`到本地，选择使用`bitget-python-sdk-api`即可

1.2 安装所需库
```python
pip install requests
pip install websocket-client
```

#### 第二步：配置个人信息

2.1 如果还未有API，可[点击](https://www.bitget.com/zh-CN/account/newapi)前往官网进行申请

2.2 将各项信息在`example_*.py（RestAPI）`和`example_ws_contract.py（WebSocketAPI）`中填写
```python
api_key = ""
secret_key = ""
passphrase = ""
```
#### 第三步：调用接口

* RestAPI

    * 运行`example.py`

    * 解开相应方法的注释传参调用各接口即可

    * 如果你的apikey是RSA类型则主动设置签名类型为RSA：在`constans.py`文件中设置SIGN_TYPE的值为RSA 如 SIGN_TYPE = RSA

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

    * 运行`example_ws_contract.py`

    * 根据个人/公共频道选择对应启动方法，解开相应频道的注释即可

    * 如果你的apikey是RSA类型则主动设置签名类型为RSA：在`constans.py`文件中设置SIGN_TYPE的值为RSA 如 SIGN_TYPE = RSA

    ```python
    # 公共数据 不需要登录（行情，K线，交易数据，资金费率，限价范围，深度数据，标记价格等频道）
    client = BitgetWsClient(CONTRACT_WS_URL, need_login=False) \
        .api_key(api_key) \
        .api_secret_key(secret_key) \
        .passphrase(passphrase) \
        .error_listener(handel_error) \
        .build()

    channles = [SubscribeReq("mc", "ticker", "BTCUSD"), SubscribeReq("SP", "candle1W", "BTCUSDT")]
    client.subscribe(channles,handle)
    
    # 个人数据 需要登录（用户账户，用户交易，用户持仓等频道）
    client = BitgetWsClient(CONTRACT_WS_URL, need_login=True) \
        .api_key(api_key) \
        .api_secret_key(secret_key) \
        .passphrase(passphrase) \
        .error_listener(handel_error) \
        .build()

    channles = [SubscribeReq("umcbl", "order", "BTCUSDT")]
    client.subscribe(channles,handle)  
  
    ```

附言：

* 如果对API尚不了解，建议参考`Bitget`官方[API文档](https://bitgetlimited.github.io/apidoc/zh/spot/)

* 若使用`WebSocketAPI`遇到问题建议参考相关链接

    * `asyncio`、`websockets`文档/`github`：

            https://docs.python.org/3/library/asyncio-dev.html
            https://websockets.readthedocs.io/en/stable/intro.html
            https://github.com/aaugustin/websockets

    * 关于`code=1006`：

            https://github.com/Rapptz/discord.py/issues/1996
            https://github.com/aaugustin/websockets/issues/587