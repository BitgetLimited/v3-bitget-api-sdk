#!/usr/bin/python

from ..client import Client
from ..consts import *


class TraceApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    交易员平仓
    symbol： 交易对名称
    trackingNo: 跟踪订单号
    :return:
    '''

    def close_track_order(self, symbol, trackingNo):
        params = {}
        if symbol and trackingNo:
            params["symbol"] = symbol
            params["trackingNo"] = trackingNo
            return self._request_with_params(POST, MIX_TRACE_V1_URL + '/closeTrackOrder', params)
        else:
            return "pls check args "

    '''
    交易员获取当前带单
    symbol: 交易对名称
    productType: umcbl(USDT专业合约) dmcbl(混合合约) sumcbl(USDT专业合约模拟盘)  sdmcbl(混合合约模拟盘)
    pageNo： 从1开始
    :return:
    '''

    def current_track(self, symbol, productType, pageSize=20, pageNo=1):
        params = {}
        if symbol:
            params["symbol"] = symbol
            params["productType"] = productType
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            return self._request_with_params(GET, MIX_TRACE_V1_URL + '/currentTrack', params)
        else:
            return "pls check args "

    '''
    交易员获取当前带单
    symbol: 交易对名称
    startTime: 开始时间
    endTime: 结束时间
    pageSize: 查询条数
    pageNo: 查询页数
    :return:
    '''

    def history_track(self, startTime, endTime, pageSize=100, pageNo=1):
        params = {}
        if startTime and endTime:
            params["startTime"] = startTime
            params["endTime"] = endTime
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            return self._request_with_params(GET, MIX_TRACE_V1_URL + '/historyTrack', params)
        else:
            return "pls check args "

    '''
    交易员分润汇总
    :return:
    '''

    def summary(self):
        return self._request_without_params(GET, MIX_TRACE_V1_URL + '/summary')

    '''
    交易员分润汇总(按结算币种)
    :return:
    '''

    def profit_settle_margin_coin(self):
        return self._request_without_params(GET, MIX_TRACE_V1_URL + '/profitSettleTokenIdGroup')

    '''
    交易员分润汇总(按日期)
    :return:
    '''

    def profit_date_group(self, pageSize, pageNo):
        params = {}
        if pageSize and pageNo:
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            return self._request_with_params(GET, MIX_TRACE_V1_URL + '/profitDateGroupList', params)
        else:
            return "pls check args "

    '''
    交易员历史分润明细
    :return:
    '''

    def profit_date_detail(self, marginCoin, date, pageSize, pageNo):
        params = {}
        if marginCoin and date and pageSize and pageNo:
            params["marginCoin"] = marginCoin
            params["date"] = date
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            return self._request_with_params(GET, MIX_TRACE_V1_URL + '/profitDateList', params)
        else:
            return "pls check args "

    '''
    交易员待分润明细
    :return:
    '''

    def wait_profit_detail(self, pageSize, pageNo):
        params = {}
        if pageSize and pageNo:
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            return self._request_with_params(GET, MIX_TRACE_V1_URL + '/waitProfitDateList', params)
        else:
            return "pls check args "

    '''
    跟随者 获取开仓平仓单信息
    :return:
    '''

    def follower_history_orders(self, page_size, page_no, start_time, end_time):
        params = {}
        if page_size and page_no:
            params["pageSize"] = page_size
            params["pageNo"] = page_no

        if start_time and end_time:
            params["startTime"] = start_time
            params["endTime"] = end_time

        return self._request_with_params(GET, MIX_TRACE_V1_URL + '/followerHistoryOrders', params)
