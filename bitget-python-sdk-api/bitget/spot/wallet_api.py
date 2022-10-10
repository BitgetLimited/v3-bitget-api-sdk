#!/usr/bin/python

from ..client import Client
from ..consts import *


class WalletApi(Client):

    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    inner transfer 
    fromType： spot, mix_usdt, mix_usd
    toType: spot, mix_usdt, mix_usd
    amount: transfer amount
    coin: crypto currency
   :return:
    '''
    def transfer(self, fromType, toType, amount, coin):
        params = {}
        if fromType and toType and amount and coin :
            params["fromType"] = fromType
            params["toType"] = toType
            params["amount"] = amount
            params["coin"] = coin
            return self._request_with_params(POST, SPOT_WALLET_V1_URL + '/transfer', params)
        else:
            return "pls check args "

    '''
    GET deposit address
    coin： btc usdt
    chain: trc20  erc20
    :return:
    '''
    def depositAddress(self, coin, chain):
        params = {}
        if coin:
            params["coin"] = coin
            params["chain"] = chain
            return self._request_with_params(GET, SPOT_WALLET_V1_URL + '/deposit-address', params)
        else:
            return "pls check args "

    '''
    withdrawal
    coin： btc usdt
    address: withdrawal address
    tag: exit? 
    chain: trc20  erc20
    amount: withdrawal amount
    ip: required 
    remark: 
    clientOid:
    :return:
    '''
    def withdrawal(self, coin, address, chain, amount, remark, clientOid=None,tag=None):
        params = {}
        if coin:
            params["coin"] = coin
            params["address"] = address

            params["chain"] = chain
            params["amount"] = amount
            params["remark"] = remark
            if tag:
                params["tag"] = tag
            if clientOid:
                params["clientOid"] = clientOid
            return self._request_with_params(POST, SPOT_WALLET_V1_URL + '/withdrawal', params)
        else:
            return "pls check args "

    '''
    withdrawalInner
    coin： btc usdt
    toUid: 
    amount: withdrawal amount
    ip: required 
    clientOid:
    :return:
    '''
    def withdrawalInner(self, coin, toUid, amount, clientOid):
        params = {}
        if coin:
            params["coin"] = coin
            params["toUid"] = toUid
            params["amount"] = amount
            if clientOid:
                params["clientOid"] = clientOid
            return self._request_with_params(POST, SPOT_WALLET_V1_URL + '/withdrawal-inner', params)
        else:
            return "pls check args "

    '''
    withdrawal list
    :return:
    '''
    def withdrawalList(self, coin, startTime, endTime, pageNo='1', pageSize='20'):
        params = {}
        if coin:
            params["coin"] = coin
            params["startTime"] = startTime
            params["endTime"] = endTime
            params["pageNo"] = pageNo
            params["pageSize"] = pageSize
            return self._request_with_params(GET, SPOT_WALLET_V1_URL + '/withdrawal-list', params)
        else:
            return "pls check args "

    '''
    deposit list
    :return:
    '''
    def depositList(self, coin, startTime, endTime, pageNo='1', pageSize='20'):
        params = {}
        if coin:
            params["coin"] = coin
            params["startTime"] = startTime
            params["endTime"] = endTime
            params["pageNo"] = pageNo
            params["pageSize"] = pageSize
            return self._request_with_params(GET, SPOT_WALLET_V1_URL + '/deposit-list', params)
        else:
            return "pls check args "