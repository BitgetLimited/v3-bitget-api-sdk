#!/usr/bin/python
import json
import threading
import time
from datetime import datetime
from threading import Timer

import websocket

from bitget.ws.utils import ws_url
from bitget.ws.utils import sign_utils

WS_OP_LOGIN = 'login'
WS_OP_SUBSCRIBE = "subscribe"
WS_OP_UNSUBSCRIBE = "unsubscribe"


def handle(message):
    print("default:" + message)


def handel_error(message):
    print("default_error:" + message)


class BitgetWsClient:

    def __init__(self, url, need_login=False):
        sign_utils.check_none(url, "url")
        self.__need_login = need_login
        self.__connection = False
        self.__login_status = False
        self.__reconnect_status = False
        self.__api_key = None
        self.__api_secret_key = None
        self.__passphrase = None
        self.__all_suribe = set()
        self.__listener = handle
        self.__error_listener = handel_error
        self.__url = url
        self.__scribe_map = {}

    def build(self):
        self.__ws_client = self.__init_client()
        __thread = threading.Thread(target=self.connect)
        __thread.start()

        while not self.has_connect():
            print("start connecting... url: ", self.__url)
            time.sleep(1)

        if self.__need_login:
            self.__login()

        self.__keep_connected(25)

        return self

    def api_key(self, api_key):
        self.__api_key = api_key
        return self

    def api_secret_key(self, api_secret_key):
        self.__api_secret_key = api_secret_key
        return self

    def passphrase(self, passphrase):
        self.__passphrase = passphrase
        return self

    def listener(self, listener):
        self.__listener = listener
        return self

    def error_listener(self, error_listener):
        self.__error_listener = error_listener
        return self

    def has_connect(self):
        return self.__connection

    def __init_client(self):
        try:
            return websocket.WebSocketApp(self.__url,
                                          on_open=self.__on_open,
                                          on_message=self.__on_message,
                                          on_error=self.__on_error,
                                          on_close=self.__on_close)

        except Exception as ex:
            print(ex)

    def __login(self):
        sign_utils.check_none(self.__api_key, "api key")
        sign_utils.check_none(self.__api_secret_key, "api secret key")
        sign_utils.check_none(self.__passphrase, "passphrase")
        timestamp = int(round(time.time()))
        sign = sign_utils.sign(sign_utils.pre_hash(timestamp, ws_url.GET, ws_url.REQUEST_PATH), self.__api_secret_key)
        ws_login_req = WsLoginReq(self.__api_key, self.__passphrase, str(timestamp), sign)
        self.send_message(WS_OP_LOGIN, [ws_login_req])
        print("logging in......")
        while not self.__login_status:
            time.sleep(1)

    def connect(self):
        try:
            self.__ws_client.run_forever(ping_timeout=10)
        except Exception as ex:
            print(ex)

    def __keep_connected(self, interval):
        try:
            __timer_thread = Timer(interval, self.__keep_connected, (interval,))
            __timer_thread.start()
            self.__ws_client.send("ping")
        except Exception as ex:
            print(ex)

    def send_message(self, op, args):
        message = json.dumps(BaseWsReq(op, args), default=lambda o: o.__dict__)
        print("send message:" + message)
        self.__ws_client.send(message)

    def subscribe(self, channels, listener=None):

        if listener:
            for chanel in channels:
                self.__scribe_map[chanel] = listener

        for channel in channels:
            self.__all_suribe.add(channel)

        self.send_message(WS_OP_SUBSCRIBE, channels)

    def __on_open(self, ws):
        print('connection is success....')
        self.__connection = True
        self.__reconnect_status = False

    def __on_message(self, ws, message):

        if message == 'pong':
            print("Keep connected:" + message)
            return
        json_obj = json.loads(message)
        if "code" in json_obj and json_obj.get("code") != 0:
            if self.__error_listener:
                self.__error_listener(message)
                return

        if "event" in json_obj and json_obj.get("event") == "login":
            print("login msg:" + message)
            self.__login_status = True
            return

        listenner = None
        if "data" in json_obj:
            listenner = self.get_listener(json_obj)

        if listenner:
            listenner(message)
            return

        self.__listener(message)

    def __dict_to_subscribe_req(self, dict):
        return SubscribeReq(dict['instType'], dict['channel'], dict['instId'])

    def get_listener(self, json_obj):
        try:
            if json_obj.get('arg'):
                json_str = str(json_obj.get('arg')).replace("\'", "\"")
                subscribe_req = json.loads(json_str, object_hook=self.__dict_to_subscribe_req)
                return self.__scribe_map.get(subscribe_req)
        except Exception as e:
            print(json_obj.get('arg'), e)
            pass

    def __on_error(self, ws, msg):
        print("error:", msg)
        self.__close()
        if not self.__reconnect_status:
            self.__re_connect()

    def __on_close(self, ws, close_status_code, close_msg):
        print("ws is closeing ......close_status:{},close_msg:{}".format(close_status_code, close_msg))
        self.__close()
        if not self.__reconnect_status:
            self.__re_connect()

    def __re_connect(self):
        #重连
        self.__reconnect_status = True
        print("start reconnection ...")
        self.build()
        pass

    def __close(self):
        self.__login_status=False
        self.__connection = False
        self.__ws_client.close()

class SubscribeReq:

    def __init__(self, inst_type, channel, instId):
        self.inst_type = inst_type
        self.channel = channel
        self.inst_id = instId

    def __eq__(self, other) -> bool:
        return self.__dict__ == other.__dict__

    def __hash__(self) -> int:
        return hash(self.inst_type + self.channel + self.inst_id)


class BaseWsReq:

    def __init__(self, op, args):
        self.op = op
        self.args = args


class WsLoginReq:

    def __init__(self, api_key, passphrase, timestamp, sign):
        self.api_key = api_key
        self.passphrase = passphrase
        self.timestamp = timestamp
        self.sign = sign
