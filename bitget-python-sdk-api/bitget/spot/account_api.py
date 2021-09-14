#!/usr/bin/python

from ..client import Client
from ..consts import *


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    获取用户 所有资产币种信息
    :return:
    '''

    def assets(self):

        return self._request_without_params(GET, SPOT_ACCOUNT_V1_URL + '/assets')

    '''
    获取划转记录
    
    coinId:币种id
    fromType:转出账户类型(EXCHANGE:现货账户,CONTRACT:合约账户,OTC_SGD:OTC账户,USD_MIX:混合合约账户,USDT_MIX:USDT专业合约账户)
    limit:默认100
    after: 传入tradeTime, 在这tradeTime之前的数据
    before: 传入tradeTime,在这tradeTime之后的数据
    '''

    def transfer_records(self, coin_id='', from_type='', after='', before='', limit=100):
        params = {}
        if coin_id:
            params["coinId"] = coin_id
        if from_type:
            params["fromType"] = from_type
        if after:
            params["after"] = after
        if before:
            params["before"] = before
        if limit:
            params["limit"] = limit

        return self._request_with_params(GET, SPOT_ACCOUNT_V1_URL + '/transferRecords', params)

    '''
    获取用户 所有资产币种信息
    
    groupType: deposit(充值), withdraw(提现), transaction(交易), transfer(划转), other(其他)
    bizType：deposit(充值), withdraw(提现), buy(买), sell(卖), transfer-in(转入), transfer-out(转出)
    after: 传入billId， 在这 billId 之前的数据
    before: 传入 billId 在这 billId 之后的数据
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
