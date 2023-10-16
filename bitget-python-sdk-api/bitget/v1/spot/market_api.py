#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET


class MarketApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def currencies(self, params):
        return self._request_with_params(GET, '/api/spot/v1/public/currencies', params)

    def products(self, params):
        return self._request_with_params(GET, '/api/spot/v1/public/products', params)

    def product(self, params):
        return self._request_with_params(GET, '/api/spot/v1/public/product', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/spot/v1/market/fills', params)

    def depth(self, params):
        return self._request_with_params(GET, '/api/spot/v1/market/depth', params)

    def ticker(self, params):
        return self._request_with_params(GET, '/api/spot/v1/market/ticker', params)

    def tickers(self, params):
        return self._request_with_params(GET, '/api/spot/v1/market/tickers', params)

    def candles(self, params):
        return self._request_with_params(GET, '/api/spot/v1/market/candles', params)
