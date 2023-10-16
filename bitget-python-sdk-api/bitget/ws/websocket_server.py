#!/usr/bin/python
import websocket
import threading
import json

global ws_dict
ws_dict = dict()


def on_open(ws):
    __connection = ws_dict[ws]
    __connection.on_open(ws)


def on_close(ws):
    __connection = ws_dict[ws]
    __connection.on_close(ws)


def on_error(ws):
    print("ws connect error, has been closed")
    ws.close()


def on_message(ws, message):
    __connection = ws_dict[ws]
    __connection.on_message(message)


def ws_server(*args):
    try:
        # websocket.enableTrace(True)
        websocket_server = args[0]
        websocket_server.__connection = websocket.WebSocketApp(websocket_server.url,
                                                               on_open = on_open,
                                                               on_message = on_message,
                                                               on_error = on_error,
                                                               on_close = on_close)
        ws_dict[websocket_server.__connection] = websocket_server
        websocket_server.__connection.run_forever(ping_timeout=30)
    except Exception as ex:
        print(ex)


class WebsocketServer:

    def __init__(self, url, api_key, api_secret_key, passphrase, isLogin=False):
        self.url = url
        self.__api_key = api_key
        self.__api_secret_key = api_secret_key
        self.__passphrase = passphrase
        self.__connection = None
        self.__state_code = 0
        self.__isLogin = isLogin

    def connect(self):
        self.__thread = threading.Thread(target=ws_server, args=[self])
        self.__thread.start()

    def on_open(self, __connection):
        self.__connection = __connection
        if self.__isLogin:
            print(self.__isLogin)
            args = self.get_login()
            print(args)
            self.__connection.send(args)

        args = self.get_args()
        self.__connection.send(args)
        print(args)

    def on_close(self, __connection):
        self.__connection = __connection
        self.__connection.close()

    def on_message(self, message):
        mes_data = json.loads(message)
        print(mes_data)
        if self.__state_code == 200:
            self.rev_message(mes_data)
        else:
            if 'action' in mes_data:
                print("connect success")
                self.__state_code = mes_data['code']

    def rev_message(self, message):
        if 'errorCode' in message:
            print(message)
            self.__connection.close()
        else:
            print(message['data'])

    def set_args(self, __op, __agrs):
        self.__op = __op
        self.__args = __agrs

    def get_args(self):
        return json.dumps({"op": self.__op, "args": self.__args})

    def set_login(self, __login_op, __login_args):
        self.__login_op = __login_op
        self.__login_args = __login_args

    def get_login(self):
        return json.dumps({"op": self.__login_op, "args": self.__login_args})

