#!/usr/bin/python

from ..client import Client
from ..consts import *


class TraceApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    Dealers close positions
    symbol： Trading pair name
    trackingNo: Tracking order No
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
    The trader obtains the current order
    symbol: Trading pair name
    productType: Umcbl (USDT professional contract) dmcbl (mixed contract) sumcbl (USDT professional contract simulation disk) sdmcbl (mixed contract simulation disk)
    pageNo： Start at 1
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
    The trader obtains the current order
    symbol: Trading pair name
    startTime: start time
    endTime: end time
    pageSize: Number of queries
    pageNo: Number of query pages
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
    Summary of traders' profit sharing
    :return:
    '''

    def summary(self):
        return self._request_without_params(GET, MIX_TRACE_V1_URL + '/summary')

    '''
    Summary of traders' profit sharing (by settlement currency)
    :return:
    '''

    def profit_settle_margin_coin(self):
        return self._request_without_params(GET, MIX_TRACE_V1_URL + '/profitSettleTokenIdGroup')

    '''
    Summary of traders' profit sharing (by date)
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
    Historical profit distribution details of traders
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
    Details of traders to be distributed
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
    Followers obtain information on opening and closing orders
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

    '''
    get trader copytrader symbol
    '''

    def trader_symbols(self):
        return self._request_without_params(GET, MIX_TRACE_V1_URL + '/traderSymbols')

    '''
    set trader copytrader symbol
   '''

    def set_trder_symbol(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(POST, MIX_TRACE_V1_URL + '/setUpCopySymbols', params)
        else:
            return "pls check args "

    '''
      trader modify tpsl order
    '''

    def trader_modify_tpsl_order(self, symbol, trackingNo, stopProfitPrice, stopLossPrice):
        params = {}
        if symbol and trackingNo:
            params["symbol"] = symbol
            params["trackingNo"] = trackingNo
            params["stopProfitPrice"] = stopProfitPrice
            params["stopLossPrice"] = stopLossPrice
            return self._request_with_params(POST, MIX_TRACE_V1_URL + '/modifyTPSL', params)
        else:
            return "pls check args "

    '''
      followerOrder
    '''

    def followerOrder(self, symbol, productType, pageSize=100, pageNo=1):
        params = {}
        if symbol and productType:
            params["symbol"] = symbol
            params["productType"] = productType
            params["pageSize"] = pageSize
            params["pageNo"] = pageNo
            return self._request_with_params(GET, MIX_TRACE_V1_URL + '/followerOrder', params)
        else:
            return "pls check args "
