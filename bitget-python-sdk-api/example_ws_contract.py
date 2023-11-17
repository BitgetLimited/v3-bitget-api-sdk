#!/usr/bin/python
import bitget.ws.contract.public_channel as public_ws
import bitget.ws.contract.private_channel as private_ws
import bitget.ws.utils as ws_url
from bitget.ws.bitget_ws_client import BitgetWsClient, SubscribeReq
from bitget.ws.utils.ws_url import CONTRACT_WS_URL


def handle(message):
    print("handle:" + message)


def handel_error(message):
    print("handle_error:" + message)


def handel_btcusd(message):
    print("handel_btcusd:" + message)


if __name__ == '__main__':
    api_key = ""
    secret_key = ""
    passphrase = ""  # 口令
    symbol = 'btcusd'

    client = BitgetWsClient(CONTRACT_WS_URL, need_login=True) \
        .api_key(api_key) \
        .api_secret_key(secret_key) \
        .passphrase(passphrase) \
        .error_listener(handel_error) \
        .build()

    channles = [SubscribeReq("SP", "candle1W", "BTCUSDT")]
    client.subscribe(channles,handle)

    # channles = [SubscribeReq("mc", "ticker", "ETHUSD")]
    # client.subscribe(channles, handel_btcusd)

# channle2 = ["swap/ticker:btcusd"];
    # client.subscribe(channle,handel_btcusd)
    # publicWs = public_ws.PublicChannel(ws_url.CONTRACT_WS_URL, api_key, secret_key, passphrase)
    #
    # publicWs.ticker(symbol)

    # publicWs.candle(symbol,ws_url.SWAP_CANDLES_1M )

    # publicWs.trade(symbol)

    # publicWs.depth(symbol)

    # publicWs.mark_price(symbol)

    # publicWs.funding_rate(symbol)

    # publicWs.price_range(symbol)

    # 私有订阅
    # privateWs = private_ws.PrivateChannel(ws_url.CONTRACT_WS_URL, api_key, secret_key, passphrase)

    # privateWs.login()

    # privateWs.account(symbol)

    # privateWs.position(symbol)

    # privateWs.order(symbol)
