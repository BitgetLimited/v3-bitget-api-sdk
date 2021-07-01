#!/usr/bin/python
from ..client import Client
from ..consts import *


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    下单
    price: 限价时 为 必填  
    quantity: 限价时 为 数量  市价买 为额度 卖为数量
    side：buy sell
    orderType: limit(限价)  market(市价)
    force:normal(普通限价订单)   postOnly(只做maker,市价不允许使用这个)  ioc(立即成交并取消剩余)  fok(全部成交或立即取消)
    :return:
    '''
    def orders(self, symbol, quantity, side, orderType, force, price='', clientOrderId=''):
        params = {}

        if symbol and quantity and side and orderType and force:
            params["symbol"] = symbol
            params["price"] = price
            params["quantity"] = quantity
            params["side"] = side
            params["orderType"] = orderType
            params["force"] = force
            params["clientOrderId"] = clientOrderId
            return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/orders', params)
        else:
            return "pls check args "

    '''
    批量下单
    '''
    def batch_orders(self, symbol, order_data):
        params = {'symbol': symbol, 'orderList': order_data}
        return self._request_with_params(POST, SPOT_ORDER_V1_URL + "/batch-orders", params)

    '''
    撤单
    :return:
    '''
    def cancel_orders(self, symbol, orderId):
        params = {}
        if symbol and orderId:
            params["symbol"] = symbol
            params["orderId"] = orderId
            return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/cancel-order', params)
        else:
            return "pls check args "

    '''
    批量撤单
    orderIds: List 
    :return:
    '''
    def cancel_batch_orders(self, symbol, orderIds):
        if symbol and orderIds:
            params = {'symbol': symbol, 'orderIds': orderIds}
            return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/cancel-batch-orders', params)
        else:
            return "pls check args "

    '''
    获取订单信息
    :return:
    '''
    def order_info(self, symbol, orderId='', clientOrderId=''):
        params = {}
        if clientOrderId:
            params["clientOrderId"] = clientOrderId
        if symbol:
            params["symbol"] = symbol

        if orderId:
            params["orderId"] = orderId
            return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/orderInfo', params)
        else:
            return "pls check args "

    '''
    获取当前委托单
    :return:
    '''
    def open_order(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/open-orders', params)
        else:
            return "pls check args "

    '''
    获取历史委托
    after: 传入 orderId， 在这 orderId 之前的数据 desc
    before: 传入 orderId 在这 orderId 之后的数据 asc
    :return:
    '''
    def history(self, symbol, after='', before='', limit=100):
        params = {}
        if symbol:
            params["symbol"] = symbol
            params["after"] = after
            params["before"] = before
            params["limit"] = limit
            return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/history', params)
        else:
            return "pls check args "

    '''
    获取成交明细
    after: 只支持传入 fillId， 在这 fillId 之前的数据
    before: 只支持传入 fillId 在这 fillId 之后的数据
    :return:
    '''
    def fills(self, symbol='', orderId='', after='', before='', limit=100):
        params = {}
        if symbol:
            params["symbol"] = symbol
        if orderId:
            params["orderId"] = orderId
        if after:
            params["after"] = after
        if before:
            params["before"] = before
        if limit:
            params["limit"] = limit


        print(params)
        return self._request_with_params(POST, SPOT_ORDER_V1_URL + '/fills', params)