#!/usr/bin/python

from ..client import Client
from ..consts import *


class MarketApi(Client):

    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    获取实时成交
    :return:
    '''
    def fills(self, symbol, limit=100):
        params = {}
        if symbol and limit:
            params["symbol"] = symbol
            params["limit"] = limit
            return self._request_with_params(GET, SPOT_MARKET_V1_URL + '/fills', params)
        else:
            return "pls check args"

    '''
    获取深度数据
    
    深度合并类型
    type: step0(default) step1 step2 step3 step4 step5
    :return:
    '''
    def depth(self, symbol, limit='150', type='step0'):
        params = {}
        if symbol and limit and type:
            params["symbol"] = symbol
            params["limit"] = limit
            params["type"] = type
            return self._request_with_params(GET, SPOT_MARKET_V1_URL + '/depth', params)
        else:
            return "pls check args"

    '''
    根据币对获取ticker信息
    :return:
    '''
    def ticker(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, SPOT_MARKET_V1_URL + '/ticker', params)
        else:
            return "pls check args"

    '''
    获取全部交易对 ticker 信息
    :return:
    '''
    def tickers(self):

        return self._request_without_params(GET, SPOT_MARKET_V1_URL + '/tickers')

    '''
    获取 k 线信息
    params
    
    period: 1min, 5min, 15min, 30min, 1h,4h,12h, 1day, 1week
    after: 时间之前的
    before: 时间之后
    :return:
    '''
    def candles(self, symbol, period, after='', before='', limit=100):
        params = {}
        if symbol and period:
            params["symbol"] = symbol
            params["period"] = period
            params["after"] = after
            params["before"] = before
            params["limit"] = limit
            return self._request_with_params(GET, SPOT_MARKET_V1_URL + '/candles', params)
        else:
            return "pls check args"