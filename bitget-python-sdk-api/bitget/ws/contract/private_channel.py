#!/usr/bin/python
from bitget.ws.websocket_server import WebsocketServer
import bitget.ws.utils.ws_url as ws_url
import bitget.ws.utils.sign_utils as utils
import time


class PrivateChannel(WebsocketServer):
    def __init__(self, url, api_key, api_secret_key, passphrase):
        super(PrivateChannel, self).__init__(url, api_key, api_secret_key, passphrase, isLogin=True)
        self.api_key = api_key
        self.passphrase = passphrase
        self.api_secret_key = api_secret_key

    def login(self):
        timestamp = int(round(time.time()))
        sign = utils.sign(utils.pre_hash(timestamp, ws_url.GET, ws_url.REQUEST_PATH), self.api_secret_key)
        args = [self.api_key, self.passphrase, str(timestamp), str(sign)]
        super().set_login(ws_url.LOGIN, args)

    def account(self, symbol):
        self.login()
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_ACCOUNT+":"+symbol])
        super().connect()

    def position(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_POSITION+":"+symbol])
        super().connect()

    def order(self, symbol):
        super().set_args(ws_url.SUBSCRIBE, [ws_url.SWAP_ORDER+":"+symbol])
        super().connect()