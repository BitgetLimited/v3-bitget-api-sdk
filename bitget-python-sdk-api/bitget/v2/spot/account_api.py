#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def info(self, params):
        return self._request_with_params(GET, '/api/v2/spot/account/info', params)

    def assets(self, params):
        return self._request_with_params(GET, '/api/v2/spot/account/assets', params)

    def bills(self, params):
        return self._request_with_params(GET, '/api/v2/spot/account/bills', params)

    def transferRecords(self, params):
        return self._request_with_params(GET, '/api/v2/spot/account/transferRecords', params)
