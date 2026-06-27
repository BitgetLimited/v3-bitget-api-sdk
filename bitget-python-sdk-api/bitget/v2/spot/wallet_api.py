#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class WalletApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def transfer(self, params):
        return self._request_with_params(POST, '/api/v2/spot/wallet/transfer', params)

    def depositAddress(self, params):
        return self._request_with_params(GET, '/api/v2/spot/wallet/deposit-address', params)

    def withdrawal(self, params):
        return self._request_with_params(POST, '/api/v2/spot/wallet/withdrawal', params)

    def withdrawalRecords(self, params):
        return self._request_with_params(GET, '/api/v2/spot/wallet/withdrawal-records', params)

    def depositRecords(self, params):
        return self._request_with_params(GET, '/api/v2/spot/wallet/deposit-records', params)
