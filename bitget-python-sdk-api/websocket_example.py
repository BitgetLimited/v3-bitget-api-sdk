import time
import websockets
import asyncio
import hmac
import json
import base64


#获取当前时间的秒数时间戳 
def get_timestamp():
    t=time.time()
    return str(int(t))



#登录的时候进行签名
def login_params(timestamp,apiKey,passphrase,secretKey):
    message=timestamp+"GET"+"/user/verify"
    mac=hmac.new(bytes(secretKey, encoding='utf8'), bytes(message, encoding='utf-8'), digestmod='sha256')
    d = mac.digest()
    sign = base64.b64encode(d)
    login_param = {"op": "login", "args": [apiKey, passphrase, timestamp, sign.decode("utf-8")]}
    login_str = json.dumps(login_param)
    return login_str




# subscribe channels un_need login
async def subscribe_without_login(url, channels):
    l = []
    while True:
        try:
            async with websockets.connect(url) as ws:
                sub_param = {"op": "subscribe", "args": channels}
                sub_str = json.dumps(sub_param)
                await ws.send(sub_str)
                while True:
                    try:
                        res_b = await asyncio.wait_for(ws.recv(), timeout=25)
                    except (asyncio.TimeoutError, websockets.exceptions.ConnectionClosed) as e:
                        try:
                            await ws.send('ping')
                            res_b = await ws.recv()
                            timestamp = get_timestamp()
                            print(timestamp + res_b)
                            continue
                        except Exception as e:
                            timestamp = get_timestamp()
                            print(timestamp + "正在重连……")
                            print(e)
                            break
                    timestamp = get_timestamp()
                    print(timestamp + res_b)
        except Exception as e:
            timestamp = get_timestamp()
            print(timestamp + "连接断开，正在重连……")
            print(e)
            continue



# subscribe channels need login
async def subscribe(url, api_key, passphrase, secret_key, channels):
    while True:
        try:
            async with websockets.connect(url) as ws:
                # login
                timestamp = str(get_timestamp())
                login_str = login_params(timestamp, api_key, passphrase, secret_key)
                await ws.send(login_str)
                # time = get_timestamp()
                # print(time + f"send: {login_str}")
                res_b = await ws.recv()
                time = get_timestamp()
                print(time + res_b)

                # subscribe
                sub_param = {"op": "subscribe", "args": channels}
                sub_str = json.dumps(sub_param)
                await ws.send(sub_str)
                time = get_timestamp()
                print(time + f"send: {sub_str}")

                while True:
                    try:
                        res_b = await asyncio.wait_for(ws.recv(), timeout=25)
                    except (asyncio.TimeoutError, websockets.exceptions.ConnectionClosed) as e:
                        try:
                            await ws.send('ping')
                            res_b = await ws.recv()
                            time = get_timestamp()
                            print(time + res_b)
                            continue
                        except Exception as e:
                            time = get_timestamp()
                            print(time + "正在重连……")
                            print(e)
                            break

                    time = get_timestamp()
                    print(time + res_b)

        except Exception as e:
            time = get_timestamp()
            print(time + "连接断开，正在重连……")
            print(e)
            continue


# unsubscribe channels----login
async def unsubscribe(url, api_key, passphrase, secret_key, channels):
    async with websockets.connect(url) as ws:
        # login
        timestamp = str(get_timestamp())
        login_str = login_params(str(timestamp), api_key, passphrase, secret_key)
        await ws.send(login_str)
        res_1 = await ws.recv()
        time = get_timestamp()
        print(time + res_1)

        # unsubscribe
        sub_param = {"op": "unsubscribe", "args": channels}
        sub_str = json.dumps(sub_param)
        await ws.send(sub_str)
        time = get_timestamp()
        print(time + f"send: {sub_str}")

        res_1 = await ws.recv()
        time = get_timestamp()
        print(time + res_1)


# unsubscribe channels
async def unsubscribe_without_login(url, channels, timestamp):
    async with websockets.connect(url) as ws:
        # unsubscribe
        sub_param = {"op": "unsubscribe", "args": channels}
        sub_str = json.dumps(sub_param)
        await ws.send(sub_str)
        print(timestamp + f"send: {sub_str}")

        res_1 = await ws.recv()
        print(timestamp + f"recv: {res_1}")



api_key = "xxxxx"
secret_key = "xxxx"
passphrase = "xxxx"

url = 'wss://csocketapi.bitgetapi.com/ws/v1'


# 永续合约
# 用户持仓频道
# channels = ["swap/position:btcusd"]
# 用户账户频道
channels = ["swap/account:cmt_btcusdt"]
# 用户交易频道
# channels = ["swap/order:btcusd"]
# 用户当前计划委托频道
# channels=["swap/current_plans:btcusd"]
# 用户历史计划委托频道
# channels=["swap/history_plans:btcusd"]
# 公共-Ticker频道
# channels = ["swap/ticker:cmt_btcusdt"]
# 公共-K线频道
# channels = ["swap/candle60s:btcusd"]
# 公共-交易频道
# channels = ["swap/trade:btcusd"]
# 公共-资金费率频道
# channels = ["swap/funding_rate:btcusd"]
# 公共-限价频道
# channels = ["swap/price_range:btcusd"]
# 公共-5档深度频道
# channels = ["swap/depth5:btcusd"]
# 公共-深度频道
# channels = ["swap/depth:btcusd"]
# 公共-标记价格频道
# channels = ["swap/mark_price:btcusd"]


loop = asyncio.get_event_loop()

# 公共数据 不需要登录（行情，K线，交易数据，资金费率，限价范围，深度数据，标记价格等频道）
#loop.run_until_complete(subscribe_without_login(url, channels))

# 个人数据 需要登录（用户账户，用户交易，用户持仓,用户计划委托等频道）
loop.run_until_complete(subscribe(url, api_key, passphrase, secret_key, channels))

loop.close()

