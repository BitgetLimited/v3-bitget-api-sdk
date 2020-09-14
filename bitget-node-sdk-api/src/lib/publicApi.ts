import axios, { AxiosRequestConfig, AxiosInstance } from 'axios'

/**
 * /api/swap/v3/market/time
 * 系统时间
 */
interface BitgetSystemTime {
  /**
   * UTC时区Unix时间戳的十进制秒数格式
   */
  epoch: string
  /**
   * ISO8601标准的时间格式
   */
  iso: string
  /**
   * 服务器的时间戳
   */
  timestamp: number
}

/**
 * /api/swap/v3/market/contracts
 * 合约基本信息
 */
interface BitgetContractInfo {
  /**
   * 合约名称
   */
  symbol: string
  /**
   * 合约标的币种
   */
  underlying_index: string
  /**
   * 计价币种
   */
  quote_currency: string
  /**
   * 保证金币种
   */
  coin: string
  /**
   * 合约面值
   */
  contract_val: string
  /**
   * 每日结算时间列表 hh:mm:ss格式
   */
  delivery: string[]
  /**
   * 数量精度 0表示整数 1表示小数点后1位
   */
  size_increment: string
  /**
   * 价格精度 0表示整数 1表示小数点后1位
   */
  tick_size: string
  /**
   * 是否为正向合约
   */
  forwardContractFlag: boolean
  /**
   * 委托价格最小变动量，委托价格必须是(priceEndStep*10^ticker_size)的整数倍。
   * 举例：priceEndStep=5，ticker_size:2，委托价格可以是9000.15或10001.90，不可以是8999.13
   */
  priceEndStep: number
}

/**
 * /api/swap/v3/market/depth
 * 深度信息[价格，数量，委托数量]
 */
interface BitgetDepthInfo {
  /**
   * 卖方深度
   */
  asks: [string, string, number][]
  /**
   * 买方深度
   */
  bids: [string, string, number][]
}

/**
 * /api/swap/v3/market/tickers
 * ticker基本信息
 */
interface BitgetTickerInfo {
  symbol: string
  /**
   * 最新成交价
   */
  last: string
  best_ask: string
  best_bid: string
  high_24h: string
  low_24h: string
  volume_24h: string
  timestamp: string
}

/**
 * /api/swap/v3/market/trades
 * 成交记录数据
 */
interface BitgetTradeInfo {
  trade_id: string
  price: string
  size: string
  /**
   * 成交方向 sell buy
   */
  side: string
  timestamp: string
  symbol: string
}

/**
 * /api/swap/v3/market/index
 * 指数价格信息
 */
interface BitgetIndexInfo {
  symbol: string
  /**
   * 指数价格
   */
  index: string
  timestamp: string
}

/**
 * /api/swap/v3/market/open_interest
 * 平台持仓量信息
 */
interface BitgetOpenInterestInfo {
  symbol: string
  /**
   * 总持仓量
   */
  amount: string
  timestamp: string
  forwardContractFlag: boolean
}

/**
 * /api/swap/v3/market/price_limit
 * 限价信息
 */
interface BitgetPriceLimitInfo {
  symbol: string
  /**
   * 最高买价
   */
  highest: string
  /**
   * 最低卖价
   */
  lowest: string
  timestamp: string
  forwardContractFlag: boolean
}

/**
 * /api/swap/v3/market/historical_funding_rate
 * 历史资金费率
 */
interface BitgetFundingHistoryInfo {
  symbol: string
  /**
   * 结算时资金费率
   */
  funding_rate: string
  /**
   * 结算时间
   */
  funding_time: string
}

export default class PublicApi {
  axiosInstance: AxiosInstance

  /**
   * 构造公共API实例
   * @param apiUri 根据自己的需要选择API地址
   * @param httpConfig axios的相关配置，默认修改了timeout属性为3s
   */
  constructor(
    apiUri = 'https://capi.bitget.com',
    httpConfig: AxiosRequestConfig = { timeout: 3000 }
  ) {
    this.axiosInstance = axios.create({
      baseURL: apiUri,
      ...httpConfig
    })
  }

  /**
   * 获取服务端时间
   * 限速规则：20次/2s
   */
  getTime() {
    return this.axiosInstance.get<BitgetSystemTime>('/api/swap/v3/market/time')
  }

  /**
   * 获取深度数据
   * 限速规则：20次/2s
   * @param symbol 合约名称
   * @param limit 深度大小(1-200)
   */
  getDepthApi(symbol: string, limit: string) {
    return this.axiosInstance.get<BitgetDepthInfo>('/api/swap/v3/market/depth', {
      params: { symbol, limit }
    })
  }

  /**
   * 获取合约信息
   * 限速规则：20次/2s
   */
  getContractsApi() {
    return this.axiosInstance.get<BitgetContractInfo[]>('/api/swap/v3/market/contracts')
  }

  /**
   * 获取全部ticker信息
   * 限速规则：20次/2s
   */
  getTickersApi() {
    return this.axiosInstance.get<BitgetTickerInfo[]>('/api/swap/v3/market/tickers')
  }

  /**
   * 获取某个ticker信息
   * 限速规则：20次/2s
   * @param symbol 合约名称
   */
  getTicker(symbol: string) {
    return this.axiosInstance.get<BitgetTickerInfo>('/api/swap/v3/market/ticker', {
      params: { symbol }
    })
  }

  /**
   * 获取成交数据
   * 限速规则：20次/2s
   * @param symbol 合约名称
   * @param limit 条数限制(1-100)
   */
  getTrades(symbol: string, limit: string | number) {
    return this.axiosInstance.get<BitgetTradeInfo[]>('/api/swap/v3/market/trades', {
      params: { symbol, limit }
    })
  }

  /**
   * 获取K线数据
   * 限速规则：20次/2s
   * @param symbol 合约名称
   * @param start 开始时间 （UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
   * @param end 结束时间 （UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'）
   * @param granularity 粒度 '60'对应'1分钟' '3600'对应'1小时' 所有支持的粒度请参见API文档
   */
  getCandles(symbol: string, start: string, end: string, granularity: string) {
    return this.axiosInstance.get('/api/swap/v3/market/candles', {
      params: { symbol, start, end, granularity }
    })
  }

  /**
   * 获取币种指数
   * 限速规则：20次/2s
   * @param symbol
   */
  getIndex(symbol: string) {
    return this.axiosInstance.get<BitgetIndexInfo>('/api/swap/v3/market/index', {
      params: { symbol }
    })
  }

  /**
   * 获取平台总持仓量
   * 限速规则：20次/2s
   * @param symbol
   */
  getOpenInterestApi(symbol: string) {
    return this.axiosInstance.get<BitgetOpenInterestInfo>('/api/swap/v3/market/open_interest', {
      params: { symbol }
    })
  }

  /**
   * 获取合约最高限价和最低限价
   * 限速规则：20次/2s
   * @param symbol
   */
  getPriceLimitApi(symbol: string) {
    return this.axiosInstance.get<BitgetPriceLimitInfo>('/api/swap/v3/market/price_limit', {
      params: { symbol }
    })
  }

  /**
   * 获取合约下一次结算时间
   * 限速规则：20次/2s
   * @param symbol
   */
  getFundingTimeApi(symbol: string) {
    return this.axiosInstance.get<{ funding_time: string }>('/api/swap/v3/market/funding_time', {
      params: { symbol }
    })
  }

   /**
     * 获取合约历史资金费率（分页）
     * 限速规则：20次/2s
     * @param symbol
     * @param pageIndex 起始页,默认是第一页
     * @param pageSize 每页条数
     */
  getHistoryFundingRateNewApi(symbol:string,pageIndex:string,pageSize:string){
     return this.axiosInstance.get<BitgetFundingHistoryInfo[]>(
           '/api/swap/v3/market/historyFundRate',
           {
             params: { symbol, pageIndex,pageIndex }
           }
         )
  }

  /**
   * 获取合约标记价格
   * 限速规则：20次/2s
   * @param symbol
   */
  getMarkPriceApi(symbol: string) {
    return this.axiosInstance.get<{ mark_price: string }>('/api/swap/v3/market/mark_price', {
      params: {
        symbol
      }
    })
  }

  /**
   * 获取可开张数
   * 限速规则：20次/2s
   * @param symbol
   * @param amount 总金额
   * @param leverage 杠杆倍数
   * @param openPrice 开仓均价
   */
  calOpenCount(symbol: string, amount: string, leverage: string, openPrice: string) {
    return this.axiosInstance.get<string>('/api/swap/v3/market/open_count', {
      params: { symbol, amount, leverage, openPrice }
    })
  }
}
