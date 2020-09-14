from .client import Client
from .consts import *


class SwapAPI(Client):

    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)



    def get_settings(self, symbol):
        '''
        获取单个合约的用户配置
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ACCOUNT + '/settings?symbol={symbol}'.format(symbol=symbol))


    def set_leverage(self, symbol, leverage, side,holdSide):
        '''
        调整杠杆
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param leverage: Integer	是	杠杆倍数，可填写1-100之间的整数
        :param side: Integer	是	持仓方向（1-多仓，2-空仓）  //标注废弃
        :param holdSide:Integer 是  持仓方向(1-多仓，2-空仓)
        :return:
        '''
        if symbol and isinstance(leverage,int) and isinstance(side,int) and isinstance(holdSide,int):
            params = {'symbol':symbol,'leverage': leverage, 'side': side,'holdSide':holdSide}
            return self._request_with_params(POST, API_SWAP_V3_ACCOUNT + '/leverage', params)
        else:
            return "pls check args"




    def get_depth(self, symbol, limit, depth=''):
        '''
        获取深度数据
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param limit: Integer	是	深度大小 范围在(1-200)之间
        :param depth:
        :return:
        '''
        params = {}
        if symbol and isinstance(limit,int):
            params["symbol"]=symbol
            params["limit"]=limit
            return self._request_with_params(GET, API_SWAP_V3_ROOT + "/depth",params)
        else:
            return "args error"


    def get_contracts_info(self):
        '''
        获取所有合约的信息
        method : GET
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ROOT + "/contracts")


    def get_tickers(self):
        '''
        获取全部ticker信息
        method : GET
        :return:
        '''
        return self._request_without_params(GET, SWAP_TICKETS)


    def get_specific_ticker(self, symbol):
        '''
        获取某个ticker信息
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        params={}
        if symbol:
            params["symbol"] = symbol
            return self._request_with_params(GET, SWAP_SOMEONE_TICKER, params)
        else:
            return "pls check args"


    def get_trades(self, symbol,limit):
        params = {}
        if symbol and limit:
            params["symbol"] = symbol
            params["limit"] = limit
            return self._request_with_params(GET, API_SWAP_V3_ROOT + '/trades', params, cursor=True)
        else:
            return "pls check args"


    def get_kline(self, symbol, start, end, granularity):
        '''
        获取K线数据
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param start: String	是	开始时间 （UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
        :param end: String	是	结束时间 （UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'）
        :param granularity: String	是	K线的时间单位,粒度,详情请移步：https://bitgetlimited.github.io/apidoc/zh/swap/#k
        :return:
        '''
        params = {}
        if symbol and start and end and granularity:
            params["symbol"] = symbol
            params["start"] = start
            params["end"] = end
            params["granularity"] = granularity
            return self._request_with_params(GET, API_SWAP_V3_ROOT + '/candles', params)
        else:
            return "pls check args"



    def get_index(self, symbol):
        '''
        获取币种指数
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        if symbol:
            return self._request_without_params(GET, API_SWAP_V3_ROOT + '/index?symbol={symbol}'.format(symbol=symbol))




    def get_holds(self, symbol):
        '''
        获取平台总持仓量
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ROOT + '/open_interest?symbol={symbol}'.format(symbol=symbol))


    def get_limit(self, symbol):
        '''
        获取合约最高限价和最低限价
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ROOT + '/price_limit?symbol={symbol}'.format(symbol=symbol))


    def get_frozen_contract(self,symbol):
        '''
        获取合约挂单冻结数量
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        if symbol:
            return self._request_without_params(GET, API_CONTRACT_ROOT + "/holds?symbol={symbol}".format(symbol=symbol))
        else:
            return "pls check args"



    def adjust_margin(self,symbol,amount,positionType,type):
        '''
        调整保证金
        method : POST
        参数名	参数类型	是否必须	描述
        :param symbol: String   合约名称
        :param amount: String	数量
        :param positionType: Integer	方向0多仓 1空仓
        :param type:  Integer	类型1增加 2减少
        :return:
        '''
        params = {}
        if symbol and amount and isinstance(positionType, int) and isinstance(type, int):
            params["symbol"] = symbol
            params["amount"] = amount
            params["positionType"] = positionType
            params["type"] = type
            return self._request_with_params(POST, API_SWAP_V3_ACCOUNT + '/adjustMargin', params)
        else:
            return "pls check args"


    def modify_autoappend_margin(self,symbol,side,append_type,holdSide):
        '''
        自动追加保证金
        method : POST
        参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param side: Integer	是	持仓方向 1多仓 2空仓   标注废弃
        :param holdSide: Integer	是	持仓方向 1多仓 2空仓
        :param append_type: Integer	是	追加保证金类型 0 不自动追加 1 自动追加
        :return:
        '''
        params = {}
        if symbol and isinstance(side, int) and isinstance(append_type, int) and isinstance(holdSide,int) :
            params["symbol"] = symbol
            params["side"] = side
            params["holdSide"] = holdSide
            params["append_type"] = append_type
            return self._request_with_params(POST, API_SWAP_V3_ACCOUNT + '/modifyAutoAppendMargin', params)
        else:
            return "pls check args"



    def get_all_position(self):
        '''
        获取全部合约仓位信息
        method : GET
        :return:
        '''
        return self._request_without_params(GET,API_CONTRACT_ROOT + '/allPosition')



    def get_single_position(self,symbol):
        '''
        获取单个合约仓位信息
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: 	String	是	合约名称
        :return:
        '''
        if symbol:
            return self._request_without_params(GET, API_CONTRACT_ROOT + '/singlePosition?symbol={symbol}'.format(symbol=symbol))
        else:
            return "pls check args"



    def get_funding_time(self, symbol):
        '''
        获取合约下一次结算时间
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ROOT + '/funding_time?symbol={symbol}'.format(symbol=symbol))


    def get_mark_price(self, symbol):
        '''
        获取合约标记价格
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ROOT + '/mark_price?symbol={symbol}'.format(symbol=symbol))

    def getHistoryFundingRate(self,symbol,pageIndex,pageSize):
          '''
          获取合约历史资金费率
          method : GET
          参数名	参数类型	是否必须	描述
          :param symbol: String	是	合约名称
          :param pageIndex: String	是	页码数，默认是第1页
          :param pageSize: String	是	每页的条数
          :return:
          '''
          params = {}
          if symbol and pageIndex and pageSize:
               params["symbol"] = symbol
               params["pageIndex"] = pageIndex
               params["pageSize"] = pageSize
               return self._request_with_params(GET,API_SWAP_V3_ROOT+'/historyFundRate',params)
          else:
               return "pls check args"

    def get_open_count(self, symbol, amount, openPrice , leverage=''):
        '''
        获取可开张数
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :param amount: BigDecimal	是	开仓的总的金额
        :param openPrice: BigDecimal	是	开仓价格
        :param leverage: BigDecimal	否	杠杆默认20倍
        :return:
        '''
        params = {}
        if symbol and amount and openPrice and leverage:
            params["symbol"] = symbol
            params["amount"] = amount
            params["openPrice"] = openPrice
            if leverage:
                params["leverage"] = leverage
            return self._request_with_params(GET, API_SWAP_V3_ROOT + '/open_count', params)
        else:
            return "pls check args"



    def get_accounts(self):
        '''
        查询所有合约账户信息
        method : GET
        :return:
        '''
        return self._request_without_params(GET, API_SWAP_V3_ACCOUNT + "/accounts")



    def get_account(self, symbol):
        '''
        单个合约账户信息
        method : GET
        参数名	参数类型	是否必须	描述
        :param symbol: String	是	合约名称
        :return:
        '''
        return self._request_without_params(GET,API_SWAP_V3_ACCOUNT + '/account?symbol={symbol}'.format(symbol=symbol))

