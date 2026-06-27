#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET


class MarketApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def coins(self, params):
        return self._request_with_params(GET, '/api/v2/spot/market/coins', params)

    def symbols(self, params):
        return self._request_with_params(GET, '/api/v2/spot/market/symbols', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/v2/spot/market/fills', params)

    def orderbook(self, params):
        return self._request_with_params(GET, '/api/v2/spot/market/orderbook', params)

    def tickers(self, params):
        return self._request_with_params(GET, '/api/v2/spot/market/tickers', params)

    def candles(self, params):
        return self._request_with_params(GET, '/api/v2/spot/market/candles', params)
