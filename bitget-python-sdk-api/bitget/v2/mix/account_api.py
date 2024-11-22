#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def account(self, params):
        return self._request_with_params(GET, '/api/v2/mix/account/account', params)

    def accounts(self, params):
        return self._request_with_params(GET, '/api/v2/mix/account/accounts', params)

    def setLeverage(self, params):
        return self._request_with_params(POST, '/api/v2/mix/account/set-leverage', params)

    def setMargin(self, params):
        return self._request_with_params(POST, '/api/v2/mix/account/set-margin', params)

    def setMarginMode(self, params):
        return self._request_with_params(POST, '/api/v2/mix/account/set-margin-mode', params)

    def setPositionMode(self, params):
        return self._request_with_params(POST, '/api/v2/mix/account/set-position-mode', params)

    def openCount(self, params):
        return self._request_with_params(GET, '/api/v2/mix/account/open-count', params)

    def singlePosition(self, params):
        return self._request_with_params(GET, '/api/v2/mix/position/single-position', params)

    def allPosition(self, params):
        return self._request_with_params(GET, '/api/v2/mix/position/all-position', params)
