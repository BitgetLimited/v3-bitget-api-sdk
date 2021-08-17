#!/usr/bin/python

from ..client import Client
from ..consts import *


class PlanApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    '''
    计划委托下单
    triggerPrice: 触发价格
    executePrice: 执行价格
    triggerType: 触发类型 fill_price market_price 
    marginCoin: 保证金币种
    size: 限价时 为 数量  市价买 为额度 卖为数量
    side：open_long open_short close_long close_short
    orderType: limit(限价)  market(市价)
    timeInForceValue:normal(普通限价订单)   postOnly(只做maker,市价不允许使用这个)  ioc(立即成交并取消剩余)  fok(全部成交或立即取消)
    presetTakeProfitPrice: 预设止盈价格
    presetStopLossPrice： 预设止损价格
    :return:
    '''
    def place_plan(self, symbol, marginCoin, size, side, orderType, triggerPrice, triggerType, executePrice='', clientOrderId='', timeInForceValue='normal', presetTakeProfitPrice='', presetStopLossPrice=''):
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
    修改计划委托
    triggerPrice: 触发价格
    executePrice: 执行价格
    triggerType: 触发类型 fill_price market_price 
    marginCoin: 保证金币种
    orderType: limit(限价)  market(市价)
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
    修改计划委托预设止盈止损
    orderId：订单号
    triggerType: 触发类型 
    marginCoin: 保证金币种
    planType: 计划委托类型 normal_plan 普通计划 profit_plan止盈计划 loss_plan止损计划
    presetTakeProfitPrice: 预设止盈价格
    presetStopLossPrice： 预设止损价格
    :return:
    '''
    def modify_plan_preset(self, symbol, marginCoin, orderId, planType='normal_plan', presetTakeProfitPrice='', presetStopLossPrice=''):
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
    修改计划委托预设止盈止损
    orderId：订单号
    triggerPrice: 触发价格
    marginCoin: 保证金币种
    :return:
    '''
    def modify_tpsl_plan(self, symbol, marginCoin, orderId, triggerPrice ):
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
    止盈止损下单
    目前止盈止损下单  只支持市价 触发类型为成交价格
    symbol: 交易对名称
    marginCoin: 保证金币种
    orderId: 订单id 
    planType: 订单类型   profit_plan 止盈计划  loss_plan止损计划
    holdSide: 持仓方向 long 多仓  short 空仓
    :return:
    '''
    def place_tpsl(self, symbol, marginCoin, triggerPrice, planType, holdSide ):
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
    计划委托(止盈止损)撤单
    symbol: 交易对名称
    marginCoin: 保证金币种
    orderId: 订单id 
    planType: 订单类型  normal_plan 计划委托  profit_plan 止盈计划  loss_plan止损计划
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
    获取当前计划委托
    isPlan: 是否查询计划委托  plan计划委托   profit_loss止盈止损
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
    获取历史计划委托
    isPre： 是否查询上一页
    isPlan: 是否查询计划委托  plan计划委托   profit_loss止盈止损
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
