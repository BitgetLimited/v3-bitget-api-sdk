#!/usr/bin/python

from ..client import Client
from ..consts import *


class PlanApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    Plan Entrusted Order
    triggerPrice: Trigger Price
    executePrice: Execution price
    triggerType: Trigger Type fill_price market_price 
    marginCoin: Deposit currency
    size: It is quantity when the price is limited. The market price is the limit. The sales is the quantity
    side：open_long open_short close_long close_short
    orderType: limit(fixed price)  market(market price)
    timeInForceValue: normal(Ordinary price limit order)   postOnly(It is only a maker. The market price is not allowed to use this)  ioc(Close immediately and cancel the remaining)  fok(Complete transaction or immediate cancellation)
    presetTakeProfitPrice: Default stop profit price
    presetStopLossPrice： Preset stop loss price
    :return:
    '''

    def place_plan(self, symbol, marginCoin, size, side, orderType, triggerPrice, triggerType, executePrice='',
                   clientOrderId='', timeInForceValue='normal', presetTakeProfitPrice='', presetStopLossPrice=''):
        params = {}
        if symbol and marginCoin and side and orderType and triggerPrice and triggerType:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["triggerPrice"] = triggerPrice
            params["executePrice"] = executePrice
            params["triggerType"] = triggerType
            params["size"] = size
            params["side"] = side
            params["orderType"] = orderType
            params["timeInForceValue"] = timeInForceValue
            params["clientOrderId"] = clientOrderId
            params["presetTakeProfitPrice"] = presetTakeProfitPrice
            params["presetStopLossPrice"] = presetStopLossPrice
            return self._request_with_params(POST, MIX_PLAN_V1_URL + '/placePlan', params)
        else:
            return "pls check args "

    '''
    Modify Plan Delegation
    triggerPrice: Trigger Price
    executePrice: Execution price
    triggerType: Trigger Type fill_price market_price 
    marginCoin: Deposit currency
    orderType: limit(fixed price)  market(market price)
    :return:
    '''

    def modify_plan(self, symbol, marginCoin, orderId, orderType, triggerPrice, triggerType, executePrice=''):
        params = {}
        if symbol and marginCoin and orderType and orderId and triggerType:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["orderId"] = orderId
            params["triggerPrice"] = triggerPrice
            params["executePrice"] = executePrice
            params["triggerType"] = triggerType
            params["orderType"] = orderType
            return self._request_with_params(POST, MIX_PLAN_V1_URL + '/modifyPlan', params)
        else:
            return "pls check args "

    '''
    Modify the preset profit and loss stop of plan entrustment
    orderId：orderId
    triggerType: Trigger Type 
    marginCoin: Deposit currency
    planType: Plan delegation type normal_ Plan general plan_ Plan profit stop plan loss_ Plan stop loss plan
    presetTakeProfitPrice: Default stop profit price
    presetStopLossPrice： Preset stop loss price
    :return:
    '''

    def modify_plan_preset(self, symbol, marginCoin, orderId, planType='normal_plan', presetTakeProfitPrice='',
                           presetStopLossPrice=''):
        params = {}
        if symbol and marginCoin and orderId and planType:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["planType"] = planType
            params["orderId"] = orderId
            params["presetTakeProfitPrice"] = presetTakeProfitPrice
            params["presetStopLossPrice"] = presetStopLossPrice
            return self._request_with_params(POST, MIX_PLAN_V1_URL + '/modifyPlanPreset', params)
        else:
            return "pls check args "

    '''
    Modify the preset profit and loss stop of plan entrustment
    orderId：orderId
    triggerPrice: Trigger Price
    marginCoin: Deposit currency
    :return:
    '''

    def modify_tpsl_plan(self, symbol, marginCoin, orderId, triggerPrice):
        params = {}
        if symbol and marginCoin and orderId and triggerPrice:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["orderId"] = orderId
            params["triggerPrice"] = triggerPrice
            return self._request_with_params(POST, MIX_PLAN_V1_URL + '/modifyTPSLPlan', params)
        else:
            return "pls check args "

    '''
    Stop profit and stop loss Order
    At present, only the market price trigger type is transaction price when placing an order with profit stop and loss stop
    symbol: Trading pair name
    marginCoin: Deposit currency
    orderId: orderId
    planType: Order type prof it_ Plan profit stop plan loss_ Plan stop loss plan
    holdSide: Long long short short short position in position direction
    :return:
    '''

    def place_tpsl(self, symbol, marginCoin, triggerPrice, planType, holdSide):
        params = {}
        if symbol and marginCoin and planType and holdSide and triggerPrice:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["planType"] = planType
            params["holdSide"] = holdSide
            params["triggerPrice"] = triggerPrice
            return self._request_with_params(POST, MIX_PLAN_V1_URL + '/placeTPSL', params)
        else:
            return "pls check args "

    '''
    place trail stop order
    symbol
    marginCoin
    triggerPrice
    triggerType
    side
    size
    rangeRate: 
    reduceOnly: only one-way mode
    :return:
    '''
    def place_trail_stop(self, params=None):
        if params is None:
            params = {}
        return self._request_with_params(POST, MIX_PLAN_V1_URL + '/placeTrailStop', params)

    '''
    place positions tpsl order
    symbol
    marginCoin
    triggerPrice
    triggerType
    side
    size
    rangeRate: 
    reduceOnly: only one-way mode
    :return:
    '''
    def place_positions_tpsl(self, params=None):
        if params is None:
            params = {}
        return self._request_with_params(POST, MIX_PLAN_V1_URL + '/placePositionsTPSL', params)


    '''
    cancel all trigger order
    :return:
    '''
    def cancel_all_plan(self, params=None):
        if params is None:
            params = {}
        return self._request_with_params(POST, MIX_PLAN_V1_URL + '/cancelAllPlan', params)

    '''
    Planned entrustment (profit and loss stop) cancellation
    symbol: Trading pair name
    marginCoin: Deposit currency
    orderId: orderId 
    planType: Order type normal_ Plan plan entrustment prof it_ Plan profit stop plan loss_ Plan stop loss plan
    :return:
    '''

    def cancel_plan(self, symbol, marginCoin, orderId, planType):
        params = {}
        if symbol and marginCoin and planType and orderId:
            params["symbol"] = symbol
            params["marginCoin"] = marginCoin
            params["planType"] = planType
            params["orderId"] = orderId
            return self._request_with_params(POST, MIX_PLAN_V1_URL + '/cancelPlan', params)
        else:
            return "pls check args "

    '''
    Get the current plan delegation
    isPlan: Query plan delegation plan delegation profile_ Loss Stop Profit Stop Loss
    :return:
    '''

    def current_plan(self, symbol, isPlan='plan'):
        params = {}
        if symbol:
            params["symbol"] = symbol
            params["isPlan"] = isPlan
            return self._request_with_params(GET, MIX_PLAN_V1_URL + '/currentPlan', params)
        else:
            return "pls check args "

    '''
    Get historical plan delegation
    isPre： Whether to query the previous page
    isPlan: Query plan delegation plan delegation profile_ Loss Stop Profit Stop Loss
    :return:
    '''

    def history_plan(self, symbol, startTime, endTime, pageSize, lastEndId='', isPre=False, isPlan='plan'):
        params = {}
        if symbol:
            params["symbol"] = symbol
            params["startTime"] = startTime
            params["endTime"] = endTime
            params["pageSize"] = pageSize
            params["lastEndId"] = lastEndId
            params["isPre"] = isPre
            params["isPlan"] = isPlan
            return self._request_with_params(GET, MIX_PLAN_V1_URL + '/historyPlan', params)
        else:
            return "pls check args "
