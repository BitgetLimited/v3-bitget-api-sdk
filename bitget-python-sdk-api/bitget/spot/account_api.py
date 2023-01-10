#!/usr/bin/python

from ..client import Client
from ..consts import *


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    Obtain all asset currency information of the user
    :return:
    '''
    def assets(self, coin=''):
        params = {}
        if coin:
            params["coin"] = coin
        return self._request_with_params(GET, SPOT_ACCOUNT_V1_URL + '/assets-lite', params)

    '''
    Obtain all asset currency information of the user
    
    groupType: Deposit, withdraw, transaction, transfer, other
    bizType：Dispose, withdraw, buy, sell, transfer in, transfer out
    after: Pass in billId, the data before this billId
    before: Incoming billId data after this billId
    :return:
    '''
    def bills(self, coinId='', groupType='', bizType='', after='', before='', limit=100):
        params = {}

        if coinId:
            params["coinId"] = coinId
        if groupType:
            params["groupType"] = groupType
        if bizType:
            params["bizType"] = bizType
        if after:
            params["after"] = after
        if before:
            params["before"] = before


        params["limit"] = limit
        return self._request_with_params(POST, SPOT_ACCOUNT_V1_URL + '/bills', params)



    '''
    query transfer records
    fromType: exchange(spot)   USD_MIX(coin future) USDT_MIX(usdt future)
    :return:
    '''
    def transfer_records(self, coinId='', fromType='', after='', before='', limit=100):
        params = {}

        if coinId:
            params["coinId"] = coinId
        if fromType:
            params["fromType"] = fromType
        if after:
            params["after"] = after
        if before:
            params["before"] = before

        params["limit"] = limit
        return self._request_with_params(GET, SPOT_ACCOUNT_V1_URL + '/transferRecords', params)