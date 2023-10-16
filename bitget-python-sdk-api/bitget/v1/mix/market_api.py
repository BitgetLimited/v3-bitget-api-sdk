#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET


class MarketApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def contracts(self, params):
        return self._request_with_params(GET, '/api/mix/v1/market/contracts', params)

    def orderbook(self, params):
        return self._request_with_params(GET, '/api/mix/v1/market/depth', params)

    def ticker(self, params):
        return self._request_with_params(GET, '/api/mix/v1/market/ticker', params)

    def tickers(self, params):
        return self._request_with_params(GET, '/api/mix/v1/market/tickers', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/mix/v1/market/fills', params)

    def candles(self, params):
        return self._request_with_params(GET, '/api/mix/v1/market/candles', params)
