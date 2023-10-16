#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def account(self, params):
        return self._request_with_params(GET, '/api/mix/v1/account/account', params)

    def accounts(self, params):
        return self._request_with_params(GET, '/api/mix/v1/account/accounts', params)

    def setLeverage(self, params):
        return self._request_with_params(POST, '/api/mix/v1/account/setLeverage', params)

    def setMargin(self, params):
        return self._request_with_params(POST, '/api/mix/v1/account/setMargin', params)

    def setMarginMode(self, params):
        return self._request_with_params(POST, '/api/mix/v1/account/setMarginMode', params)

    def setPositionMode(self, params):
        return self._request_with_params(POST, '/api/mix/v1/account/setPositionMode', params)

    def singlePosition(self, params):
        return self._request_with_params(GET, '/api/mix/v1/position/singlePosition', params)

    def allPosition(self, params):
        return self._request_with_params(GET, '/api/mix/v1/position/allPosition', params)
