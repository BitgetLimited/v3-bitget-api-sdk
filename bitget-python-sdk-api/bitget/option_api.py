from .client import Client
from .consts import *


class OptionAPI(Client):

    def __init__(self, api_key, api_secret_key, passphrase,use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time,first)


    def take_order(self, symbol,client_oid, size, type, order_type, match_price,price='' ):
        '''
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param client_oid: String	是	自定义订单号(不超过50个字符，且不能是特殊字符，如火星字符等)
        :param size: String	是	下单数量（不能为0，不能为负数）
        :param type: String	是	1:开多 2:开空 3:平多 4:平空
        :param order_type: String	是	0:普通，1：只做maker;2:全部成交或立即取消;3:立即成交并取消剩余
        :param match_price: String	是	0:限价还是1:市价
        :param price: String	否	委托价格（有精度限制，精度（tick_size）和步长（priceEndStep）取“合约信息接口”，限价必填）
        :return:
        '''
        params = {}
        if symbol and client_oid and size and type and order_type and match_price:
            params['symbol'] = symbol
            params['client_oid'] = client_oid
            params['size'] = size
            params['type'] = type
            params['order_type'] = order_type
            params['match_price'] = match_price
            if price:
                params['price'] = price
            return self._request_with_params(POST, API_OPTION_ORDER + "/placeOrder", params)
        else:
            return "pls check args "


    def take_orders(self, symbol, order_data):
        '''
        批量下单
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param order_data: String	是	JSON类型的字符串
               例：'[{"price":5,"size":2,"type":1,"match_price":1,"order_type":1,"client_oid":"abc"}]'
               字段参考【合约下单】接口，且最多只能批量处理20笔订单
        :return:
        '''
        params = {'symbol': symbol, 'order_data': order_data}
        return self._request_with_params(POST, API_OPTION_ORDER + "/batchOrders", params)


    def revoke_order(self, symbol, order_id):
        '''
        取消订单
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param order_id: String	是	订单号
        :return:
        '''
        if order_id and symbol:
            params = {}
            params["symbol"] = symbol
            params["orderId"] = order_id
            return self._request_with_params(POST, API_OPTION_ORDER + "/cancel_order", params)
        else:
            return "pls check args"


    def revoke_orders(self, symbol, ids=''):
        '''
        批量撤单
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param ids: List	是	订单号的集合
        :return:
        '''
        params = {}
        if ids:
            params["symbol"] = symbol
            params["ids"] = ids
            return self._request_with_params(POST, API_OPTION_ORDER + "/cancel_batch_orders", params)
        else:
            return "pls check args"


    def take_plan_order(self,symbol,size,type,side,match_type,execute_price,trigger_price,client_oid='',holdSide):
        '''
        计划委托下单
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param size: String	是	下单张数（不能为0，不能为负数）
        :param type: String	是	类型 1开仓 2平仓
        :param side: String	是	方向 1多仓 2空仓     //标注废弃
        :param holdSide: String	是	持仓方向 1多仓 2空仓
        :param match_type: String	是	0:限价还是1:市价
        :param execute_price: String	是	执行价格
        :param trigger_price: String	是	触发价格
        :param client_oid: String	否	客户端请求标识(不超过50个字符，且不能是特殊字符，如火星字符等)
        :return:
        '''
        params = {}
        if symbol and size and type and side and match_type and execute_price and trigger_price and holdSide:
            params['symbol'] = symbol
            params['size'] = size
            params['type'] = type
            params['side'] = side
            params['holdSide'] = holdSide
            params['match_type'] = match_type
            params['execute_price'] = execute_price
            params['trigger_price'] = trigger_price
            params['client_oid'] = client_oid
            return self._request_with_params(POST, API_OPTION_ORDER + "/plan_order", params)
        else:
            return "pls check args "




    def take_cancel_plan(self,symbol,orderId):
        '''
        计划委托撤单
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param orderId: String	是	订单号
        :return:
        '''
        params = {}
        if symbol and orderId:
            params['symbol'] = symbol
            params['orderId'] = orderId
            return self._request_with_params(POST, API_OPTION_ORDER + "/cancel_plan", params)
        else:
            return "pls check args "



    def get_currentPlan(self,symbol,side,pageIndex,pageSize,startTime='',endTime='',delegateType):
        '''
        查询当前计划委托
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param side: String	是	方向 1开多 2开空 3平多 4平空  //标注废弃
        :param delegateType: String	是	方向 1开多 2开空 3平多 4平空
        :param pageIndex: String	是	当前页
        :param pageSize: String	是	每页数量:实际查询会多查5条,且最多1000条
        :param startTime: String	否	查询开始时间(时间戳)
        :param endTime: String	否	查询结束时间(时间戳)
        :return:
        '''
        params = {}
        if symbol and side and pageIndex and pageSize and delegateType:
            params["symbol"] = symbol
            params["side"] = side
            params["delegateType"] = delegateType
            params["pageIndex"] = pageIndex
            params["pageSize"] = pageSize
            params["startTime"] = startTime
            params["endTime"] = endTime
            return self._request_with_params(GET, API_OPTION_ORDER + "/currentPlan", params, cursor=True)
        else:
            return "pls check args"



    def get_historyPlan(self,symbol,side,pageIndex,pageSize,startTime='',endTime='',delegateType):
        '''
        查询计划历史委托
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param side: String	是	方向 1开多 2开空 3平多 4平空   //标注废弃
        :param delegateType: String	是	方向 1开多 2开空 3平多 4平空
        :param pageIndex: String	是	当前页
        :param pageSize: String	是	每页数量:实际查询会多查5条,且最多1000条
        :param startTime: String	否	查询开始时间(时间戳)
        :param endTime: String	否	查询结束时间(时间戳)
        :return:
        '''
        params = {}
        if symbol and side and pageIndex and pageSize and delegateType:
            params["symbol"] = symbol
            params["side"] = side
            params["delegateType"] = delegateType
            params["pageIndex"] = pageIndex
            params["pageSize"] = pageSize
            params["startTime"] = startTime
            params["endTime"] = endTime
            return self._request_with_params(GET, API_OPTION_ORDER + "/historyPlan", params, cursor=True)
        else:
            return "pls check args"




    def get_order_info(self, symbol, orderId):
        '''
        获取单订单信息
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param orderId: String	是	订单号
        :return:
        '''
        if symbol and orderId:
            params = {}
            return self._request_with_params(GET, API_OPTION_ORDER + "/detail?symbol={symbol}&orderId={orderId}".format(symbol=symbol,orderId=orderId),params)
        else:
            return "pls check args"


    def get_order_history(self,symbol,pageIndex,pageSize,createDate):
        '''
        获取订单历史列表
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param pageIndex: String	是	 页码数，默认是第1页
        :param pageSize: String	是	 每页条数
        :param createDate:  int	是	天数必须小于或等于90
        :return:
        '''
         params = {}
         if symbol and pageIndex and pageSize and createDate:
             params["symbol"] = symbol
             params["pageIndex"] = pageIndex
             params["pageSize"] = pageSize
             params["createDate"] = createDate
             return self._request_with_params(GET,API_OPTION_ORDER+"/history",params,cursor=True)
         else:
             return "pls check args"

    def get_order_current(self,symbol):
          '''
          获取订单历史列表
          method : GET
          参数名	参数类型	是否必须	描述
          :param symbol: String	是	合约code
          :return:
          '''
          params={}
          if symbol:
             params["symbol"]=symbol
             return self._request_with_params(GET,API_OPTION_ORDER+"/current",params)
          else:
             return "pls check args"


    def get_fills(self, symbol, orderId):
        '''
        查询成交明细
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约code
        :param orderId: String	是	订单号
        :return:
        '''
        params = {}
        if symbol and orderId:
            params['symbol'] = symbol
            params["orderId"]=orderId
            return self._request_with_params(GET, API_OPTION_ORDER + "/fills", params, cursor=True)
        else:
            return "pls check args"
