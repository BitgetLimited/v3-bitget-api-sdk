#!/usr/bin/python
from bitget.ws.websocket_server import WebsocketServer
import bitget.ws.utils.ws_url as ws_url


class PublicChannel(WebsocketServer):
    def __init__(self, url, api_key, api_secret_key, passphrase):
        super(PublicChannel, self).__init__(url, api_key, api_secret_key, passphrase, isLogin=False)

    def ticker(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_TICKER+":"+symbol])
        super().connect()

    def candle(self, symbol, period):
        super().set_args(ws_url.SUBSCRIBE, [period+":"+symbol])
        super().connect()

    def trade(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_TRADE+":"+symbol])
        super().connect()

    def depth(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_DEPTH+":"+symbol])
        super().connect()

    def funding_rate(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_FUNDING_RATE+":"+symbol])
        super().connect()

    def mark_price(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_MARK_PRICE+":"+symbol])
        super().connect()

    def price_range(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_PRICE_RANGE+":"+symbol])
        super().connect()

