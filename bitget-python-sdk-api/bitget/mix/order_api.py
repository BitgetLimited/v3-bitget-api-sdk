#!/usr/bin/python

from ..client import Client
from ..consts import *


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    下单
    price: 限价时 为 必填  
    marginCoin: 保证金币种
    size: 限价时 为 数量  市价买 为额度 卖为数量
    side：open_long open_short close_long close_short
    orderType: limit(限价)  market(市价)
    timeInForceValue:normal(普通限价订单)   postOnly(只做maker,市价不允许使用这个)  ioc(立即成交并取消剩余)  fok(全部成交或立即取消)
    presetTakeProfitPrice: 预设止盈价格
    presetStopLossPrice： 预设止损价格
    :return:
    '''
    def place_order(self, symbol, marginCoin, size, side, orderType, price='', clientOrderId='', timeInForceValue='normal', presetTakeProfitPrice='', presetStopLossPrice=''):
        params = {}
        if symbol and marginCoin and side and orderType and marginCoin:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["price"] = price
            params["size"] = size
            params["side"] = side
            params["orderType"] = orderType
            params["timeInForceValue"] = timeInForceValue
            params["clientOid"] = clientOrderId
            params["presetTakeProfitPrice"] = presetTakeProfitPrice
            params["presetStopLossPrice"] = presetStopLossPrice
            return self._request_with_params(POST, MIX_ORDER_V1_URL + '/placeOrder', params)
        else:
            return "pls check args "

    '''
    批量下单
    price: 限价时 为 必填  
    marginCoin: 保证金币种
    order_data: 
    size: 限价时 为 数量  市价买 为额度 卖为数量
    side：open_long open_short close_long close_short
    orderType: limit(限价)  market(市价)
    timeInForceValue:normal(普通限价订单)   postOnly(只做maker,市价不允许使用这个)  ioc(立即成交并取消剩余)  fok(全部成交或立即取消)
    presetTakeProfitPrice: 预设止盈价格
    presetStopLossPrice： 预设止损价格
    :return:
    '''
    def batch_orders(self, symbol, marginCoin, order_data):
        params = {'symbol': symbol, 'marginCoin': marginCoin, 'orderDataList': order_data}
        return self._request_with_params(POST, MIX_ORDER_V1_URL + '/batch-orders', params)

    '''
    撤单
    :return:
    '''
    def cancel_orders(self, symbol, marginCoin, orderId):
        params = {}
        if symbol and orderId:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["orderId"] = orderId
            return self._request_with_params(POST, MIX_ORDER_V1_URL + '/cancel-order', params)
        else:
            return "pls check args "

    '''
    批量撤单
    orderIds: List 
    :return:
    '''
    def cancel_batch_orders(self, symbol, marginCoin, orderIds):
        if symbol and orderIds:
            params = {'symbol': symbol, 'marginCoin':marginCoin, 'orderIds': orderIds}
            return self._request_with_params(POST, MIX_ORDER_V1_URL + '/cancel-batch-orders', params)
        else:
            return "pls check args "

    '''
    获取订单信息
    :return:
    '''
    def detail(self, symbol, orderId):
        params = {}
        if symbol and orderId:
            params["symbol"] = symbol
            params["orderId"] = orderId
            return self._request_with_params(GET, MIX_ORDER_V1_URL + '/detail', params)
        else:
            return "pls check args "

    '''
    获取当前委托单
    :return:
    '''
    def current(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, MIX_ORDER_V1_URL + '/current', params)
        else:
            return "pls check args "

    '''
    获取历史委托
    isPre： 是否查询上一页
    :return:
    '''
    def history(self, symbol, startTime, endTime, pageSize, lastEndId='', isPre=False):
        params = {}
        if symbol:
            params["symbol"] = symbol
            params["startTime"] = startTime
            params["endTime"] = endTime
            params["pageSize"] = pageSize
            params["lastEndId"] = lastEndId
            params["isPre"] = isPre
            return self._request_with_params(GET, MIX_ORDER_V1_URL + '/history', params)
        else:
            return "pls check args "

    '''
    获取成交明细
    :return:
    '''
    def fills(self, symbol='', orderId=''):
        params = {}
        if symbol and orderId:
            params["symbol"] = symbol
            params["orderId"] = orderId
            return self._request_with_params(GET, MIX_ORDER_V1_URL + '/fills', params)
        else:
            return "pls check args "