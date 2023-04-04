#!/usr/bin/python
from ..client import Client
from ..consts import *


class PlanApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def placePlan(self, symbol, size, executePrice, triggerPrice, side, orderType, triggerType, timeInForceValue, clientOid='', channelApiCode=''):
        params = {}
        if symbol and side and orderType and timeInForceValue:
            params["symbol"] = symbol
            params["size"] = size
            params["executePrice"] = executePrice
            params["triggerPrice"] = triggerPrice
            params["side"] = side
            params["orderType"] = orderType
            params["triggerType"] = triggerType
            params["timeInForceValue"] = timeInForceValue
            params["clientOid"] = clientOid
            params["channelApiCode"] = channelApiCode
            return self._request_with_params(POST, SPOT_PLAN_V1_URL + '/placePlan', params)
        else:
            return "pls check args "

    def modifyPlan(self, orderId, size='', executePrice='', triggerPrice='', orderType=''):
        params = {}
        if orderId:
            params["orderId"] = orderId
            params["size"] = size
            params["executePrice"] = executePrice
            params["triggerPrice"] = triggerPrice
            params["orderType"] = orderType
            return self._request_with_params(POST, SPOT_PLAN_V1_URL + '/modifyPlan', params)
        else:
            return "pls check args "

    def cancelPlan(self, orderId):
        params = {}
        if orderId:
            params["orderId"] = orderId
            return self._request_with_params(POST, SPOT_PLAN_V1_URL + '/cancelPlan', params)
        else:
            return "pls check args "

    def currentPlan(self, symbol='', pageSize='', lastEndId=''):
        params = {}
        if symbol:
            params["symbol"] = symbol
        if pageSize:
            params["pageSize"] = pageSize
        if lastEndId:
            params["lastEndId"] = lastEndId
        return self._request_with_params(POST, SPOT_PLAN_V1_URL + '/currentPlan', params)

    def historyPlan(self, symbol='', pageSize='', lastEndId='', startTime='', endTime=''):
        params = {}
        if symbol:
            params["symbol"] = symbol
        if pageSize:
            params["pageSize"] = pageSize
        if lastEndId:
            params["lastEndId"] = lastEndId
        if startTime:
            params["startTime"] = startTime
        if endTime:
            params["endTime"] = endTime
        return self._request_with_params(POST, SPOT_PLAN_V1_URL + '/historyPlan', params)
