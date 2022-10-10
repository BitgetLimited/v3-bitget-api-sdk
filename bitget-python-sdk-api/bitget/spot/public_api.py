#!/usr/bin/python

from ..client import Client
from ..consts import *


class PublicApi(Client):

    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    Get Timestamp
    :return:
    '''
    def times(self):
        return self._request_without_params(GET, SPOT_PUBLIC_V1_URL + '/time')

    '''
    Get all currencies
    :return:
    '''
    def currencies(self):

        return self._request_without_params(GET, SPOT_PUBLIC_V1_URL + '/currencies')

    '''
    Get all transaction pair information
    :return:
    '''
    def products(self):

        return self._request_without_params(GET, SPOT_PUBLIC_V1_URL+'/products')

    '''
    Obtain single currency pair information according to the transaction pair
    :return:
    '''
    def product(self, symbol):
        params = {}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, SPOT_PUBLIC_V1_URL+'/product', params)
        else:
            return "pls check args"



