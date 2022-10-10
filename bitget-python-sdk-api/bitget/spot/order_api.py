#!/usr/bin/python
from ..client import Client
from ..consts import *


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    place an order
    price: Mandatory in case of price limit
    quantity: It is quantity when the price is limited. The market price is the limit. The sales is the quantity
    side：buy sell
    orderType: limit(fixed price)  market(market price)
    force:normal(Ordinary price limit order)   postOnly(It is only a maker. The market price is not allowed to use this)  ioc(Close immediately and cancel the remaining)  fok(Complete transaction or immediate cancellation)
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
    Place orders in batches
    '''
    def batch_orders(self, symbol, order_data):
        params = {'symbol': symbol, 'orderList': order_data}
        return self._request_with_params(POST, SPOT_ORDER_V1_URL + "/batch-orders", params)

    '''
    cancel the order
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
    Batch cancellation
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
    Get order information
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
    Get the current order
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
    Get Historical Delegation
    after: The orderId is passed in. The data before the orderId desc
    before: Pass in the data after the orderId asc
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
    Obtain transaction details
    after: Only the data before the fillId can be passed in
    before: Only data passing in the fillId after this fillId is supported
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