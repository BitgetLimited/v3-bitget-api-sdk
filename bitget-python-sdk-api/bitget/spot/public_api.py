#!/usr/bin/python

from ..client import Client
from ..consts import *


class PublicApi(Client):

    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    获取时间戳
    :return:
    '''
    def times(self):
        return self._request_without_params(GET, SPOT_PUBLIC_V1_URL + '/time')

    '''
    获取所有币种
    :return:
    '''
    def currencies(self):

        return self._request_without_params(GET, SPOT_PUBLIC_V1_URL + '/currencies')

    '''
    获取所有交易对信息
    :return:
    '''
    def products(self):

        return self._request_without_params(GET, SPOT_PUBLIC_V1_URL+'/products')

    '''
    根据交易对获取单个币对信息
    :return:
    '''
    def product(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, SPOT_PUBLIC_V1_URL+'/product', params)
        else:
            return "pls check args"



