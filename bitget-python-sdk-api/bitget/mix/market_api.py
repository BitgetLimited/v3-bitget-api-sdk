#!/usr/bin/python

from ..client import Client
from ..consts import *


class MarketApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    获取合约列表
    productType: umcbl(USDT专业合约) dmcbl(混合合约) sumcbl(USDT专业合约模拟盘)  sdmcbl(混合合约模拟盘)
    :return:
    '''
    def contracts(self, productType):
        params = {}
        if productType:
            params['productType'] = productType
        return self._request_with_params(GET, MIX_MARKET_V1_URL + '/contracts', params)

    '''
    获取深度数据
    symbol：合约交易对
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
    根据币对获取ticker信息
    symbol：合约交易对
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
    获取全部ticker信息
    productType: umcbl(USDT专业合约) dmcbl(混合合约) sumcbl(USDT专业合约模拟盘)  sdmcbl(混合合约模拟盘)
    :return:
    '''
    def tickers(self,productType):
        params = {}
        if productType:
            params['productType'] = productType
        return self._request_with_params(GET, MIX_MARKET_V1_URL + '/tickers', params)

    '''
    获取实时成交
    symbol：合约交易对
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
    获取 k 线信息
    params
    period: 60, 300, 900, 1800, 3600,14400,43200, 86400, 604800
    startTime: 开始时间
    endTime: 结束时间
    :return:
    '''
    def candles(self, symbol, granularity, startTime='', endTime=''):
        params = {}
        if symbol and granularity:
            params["symbol"] = symbol
            params["granularity"] = granularity
            params["startTime"] = startTime
            params["endTime"] = endTime
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/candles', params)
        else:
            return "pls check args"

    '''
    币种指数价格
    symbol：合约交易对
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
    下一次结算时间
    symbol：合约交易对
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
    合约标记价格
    symbol：合约交易对
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
    历史资金费率
    symbol：合约交易对
    pageSize: 查询条数
    pageNo: 查询页数
    nextPage: 是否查询下一页
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
    当前资金费率
    symbol：合约交易对
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
    获取平台总持仓量
    symbol：合约交易对
    :return:
    '''
    def open_interest(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_MARKET_V1_URL + '/open-interest', params)
        else:
            return "pls check args"
