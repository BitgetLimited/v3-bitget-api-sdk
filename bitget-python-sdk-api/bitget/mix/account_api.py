#!/usr/bin/python

from ..client import Client
from ..consts import *


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    获取用户 账户信息
    symbol: 合约交易对
    marginCoin: 保证金币种
    :return:
    '''
    def account(self, symbol, marginCoin):
        params = {}
        if symbol and marginCoin:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            return self._request_with_params(GET, MIX_ACCOUNT_V1_URL + '/account', params)
        else:
            return "pls check args"

    '''
    调整杠杆
    symbol: 合约交易对
    marginCoin: 保证金币种
    leverage: 杠杆倍数
    holdSide: 持仓方向 long 多仓 short 空仓  全仓时可以不传
    :return:
    '''
    def leverage(self, symbol, marginCoin, leverage, holdSide=''):
        params = {}
        if symbol and marginCoin:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["leverage"] = leverage
            params["holdSide"] = holdSide
            return self._request_with_params(POST, MIX_ACCOUNT_V1_URL + '/setLeverage', params)
        else:
            return "pls check args"

    '''
    调整保证金
    symbol: 合约交易对
    marginCoin: 保证金币种
    amount: 保证金金额  正数 增加 负数减少
    holdSide: 持仓方向 long 多仓 short 空仓  全仓时可以不传
    :return:
    '''
    def margin(self, symbol, marginCoin, amount, holdSide=''):
        params = {}
        if symbol and marginCoin:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["amount"] = amount
            params["holdSide"] = holdSide
            return self._request_with_params(POST, MIX_ACCOUNT_V1_URL + '/setMargin', params)
        else:
            return "pls check args"

    '''
    调整保证金模式
    symbol: 合约交易对
    marginCoin: 保证金币种
    marginMode: fixed 逐仓  crossed 全仓
    :return:
    '''
    def margin_mode(self, symbol, marginCoin, marginMode):
        params = {}
        if symbol and marginCoin:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["marginMode"] = marginMode
            return self._request_with_params(POST, MIX_ACCOUNT_V1_URL + '/setMarginMode', params)
        else:
            return "pls check args"

    '''
    设置持仓模式
    symbol: 合约交易对
    marginCoin: 保证金币种
    holdMode: 持仓模式 single_hold 单项持仓  double_hold双向持仓  默认双向
    :return:
    '''
    def position_mode(self, symbol, marginCoin, holdMode):
        params = {}
        if symbol and marginCoin and holdMode:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["holdMode"] = holdMode
            return self._request_with_params(POST, MIX_ACCOUNT_V1_URL + '/setPositionMode', params)
        else:
            return "pls check args"

    '''
    查询可开张数
    symbol: 合约交易对
    marginCoin: 保证金币种
    openPrice： 开仓价格
    openAmount: 开仓额度
    leverage: 杠杆倍数 默认20
    :return:
    '''
    def open_count(self, symbol, marginCoin, openPrice, openAmount, leverage=20):
        params = {}
        if symbol and marginCoin and openPrice and openAmount:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["openPrice"] = openPrice
            params["openAmount"] = openAmount
            params["leverage"] = leverage
            return self._request_with_params(POST, MIX_ACCOUNT_V1_URL + '/open-count', params)
        else:
            return "pls check args"

    '''
    获取账户信息列表
    productType: umcbl(USDT专业合约) dmcbl(混合合约) sumcbl(USDT专业合约模拟盘)  sdmcbl(混合合约模拟盘)
    :return:
    '''
    def accounts(self, productType):
        params = {}
        if productType:
            params['productType'] = productType
            return self._request_with_params(GET, MIX_ACCOUNT_V1_URL + '/accounts', params)
        else:
            return "pls check args"

    '''
    获取账户流水信息列表
    :return:
    '''
    def accountBill(self, symbol,marginCoin,startTime,endTime,lastEndId = '',pageSize=20,next=False):
        params = {}
        if symbol and marginCoin and startTime and endTime:
            params['symbol'] = symbol
            params['marginCoin'] = marginCoin
            params['startTime'] = startTime
            params['endTime'] = endTime
            params['lastEndId'] = lastEndId
            params['pageSize'] = pageSize
            params['next'] = next
            return self._request_with_params(GET, MIX_ACCOUNT_V1_URL + '/accountBill', params)
        else:
            return "pls check args"
