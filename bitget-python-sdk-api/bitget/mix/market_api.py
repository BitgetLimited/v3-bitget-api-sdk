#!/usr/bin/python

from ..client import Client
from ..consts import *


class MarketApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    Get contract list
    productType: Umcbl (USDT professional contract) dmcbl (mixed contract) sumcbl (USDT professional contract simulation disk) sdmcbl (mixed contract simulation disk)
    :return:
    '''
    def contracts(self, productType):
        params = {}
        if productType:
            params['productType'] = productType
        return self._request_with_params(GET, MIX_MARKET_V1_URL + '/contracts', params)

    '''
    Get depth data
    symbol：Contract transaction pair
    :return:
    '''
    def depth(self, symbol, limit='150'):
        params = {}
        if symbol and limit and type:
            params["symbol"] = symbol
            params["limit"] = limit
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/depth', params)
        else:
            return "pls check args"

    '''
    Get ticker information according to the currency pair
    symbol：Contract transaction pair
    :return:
    '''
    def ticker(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/ticker', params)
        else:
            return "pls check args"

    '''
    Get all ticket information
    productType: Umcbl (USDT professional contract) dmcbl (mixed contract) sumcbl (USDT professional contract simulation disk) sdmcbl (mixed contract simulation disk)
    :return:
    '''
    def tickers(self,productType):
        params = {}
        if productType:
            params['productType'] = productType
        return self._request_with_params(GET, MIX_MARKET_V1_URL + '/tickers', params)

    '''
    Get real-time transaction
    symbol：Contract transaction pair
    :return:
    '''
    def fills(self, symbol, limit=100):
        params = {}
        if symbol and limit:
            params["symbol"] = symbol
            params["limit"] = limit
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/fills', params)
        else:
            return "pls check args"

    '''
    Obtain K line information
    params
    period: 60, 300, 900, 1800, 3600,14400,43200, 86400, 604800
    startTime: start time
    endTime: end time
    :return:
    '''
    def candles(self, symbol, granularity, startTime='', endTime='',limit=''):
        params = {}
        if symbol and granularity:
            params["symbol"] = symbol
            params["granularity"] = granularity
            params["startTime"] = startTime
            params["endTime"] = endTime
            params["limit"] = limit
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/candles', params)
        else:
            return "pls check args"

    '''
    Currency index price
    symbol：Contract transaction pair
    :return:
    '''
    def index(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/index', params)
        else:
            return "pls check args"

    '''
    Next settlement time
    symbol：Contract transaction pair
    :return:
    '''
    def funding_time(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/funding-time', params)
        else:
            return "pls check args"

    '''
    Contract Mark Price
    symbol：Contract transaction pair
    :return:
    '''
    def market_price(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/mark-price', params)
        else:
            return "pls check args"

    '''
    Historical fund rate
    symbol：Contract transaction pair
    pageSize: Number of queries
    pageNo: Number of query pages
    nextPage: Whether to query the next page
    :return:F
    '''
    def history_fund_rate(self, symbol, pageSize=20, pageNo=1, nextPage=False):
        params = {}
        if symbol:
            params["symbol"] = symbol
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            params["nextPage"] = nextPage
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/history-fundRate', params)
        else:
            return "pls check args"

    '''
    Current fund rate
    symbol：Contract transaction pair
    :return:F
    '''
    def current_fund_rate(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/current-fundRate', params)
        else:
            return "pls check args"

    '''
    Obtain the total position of the platform
    symbol：Contract transaction pair
    :return:
    '''
    def open_interest(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/open-interest', params)
        else:
            return "pls check args"
