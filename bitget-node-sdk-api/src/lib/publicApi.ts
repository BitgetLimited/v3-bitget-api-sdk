import axios, { AxiosRequestConfig, AxiosInstance } from 'axios'

/**
 * /api/swap/v3/market/time
 * 系统时间
 */
interface BitgetSystemTime {
  epoch: string
  iso: string
  timestamp: number
}

/**
 * /api/swap/v3/market/contracts
 * 合约基本信息
 */
interface BitgetContractInfo {
  symbol: string
  underlying_index: string
  quote_currency: string
  coin: string
  contract_val: string
  listing?: boolean
  delivery: string[]
  size_increment: string
  tick_size: string
  forwardContractFlag: boolean
  priceEndStep: number
}

/**
 * /api/swap/v3/market/depth
 * 深度信息
 */
interface BitgetDepthInfo {
  asks: string[][]
  bids: string[][]
}

/**
 * /api/swap/v3/market/tickers
 * ticker基本信息
 */
interface BitgetTickerInfo {
  symbol: string
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
  index: string
  timestamp: string
}

/**
 * /api/swap/v3/market/open_interest
 * 平台持仓量信息
 */
interface BitgetOpenInterestInfo {
  symbol: string
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
  highest: string
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
  funding_rate: string
  funding_time: string
}

/**
 * 设置BitgetAPI 客户端
 * @param apiUri API地址
 * @param httpConfig Axios相关配置，超时时间等
 */
export function setUp(
  apiUri = 'https://capi.bitget.com',
  httpConfig: AxiosRequestConfig = { timeout: 3000 }
) {
  const axiosInstance: AxiosInstance = axios.create({
    baseURL: apiUri,
    ...httpConfig
  })

  return {
    getTime() {
      return axiosInstance.get<BitgetSystemTime>('/api/swap/v3/market/time')
    },
    getContractsApi() {
      return axiosInstance.get<BitgetContractInfo[]>('/api/swap/v3/market/contracts')
    },
    getDepthApi(symbol: string, limit: string) {
      return axiosInstance.get<BitgetDepthInfo>('/api/swap/v3/market/depth', {
        params: { symbol, limit }
      })
    },
    getTickersApi() {
      return axiosInstance.get<BitgetTickerInfo[]>('/api/swap/v3/market/tickers')
    },
    getTicker(symbol: string) {
      return axiosInstance.get<BitgetTickerInfo>('/api/swap/v3/market/ticker', {
        params: { symbol }
      })
    },
    getTrades(symbol: string, limit: string | number) {
      return axiosInstance.get<BitgetTradeInfo[]>('/api/swap/v3/market/trades', {
        params: { symbol, limit }
      })
    },
    getCandles(symbol: string, start: string, end: string, granularity: string) {
      return axiosInstance.get('/api/swap/v3/market/candles', {
        params: { symbol, start, end, granularity }
      })
    },
    getIndex(symbol: string) {
      return axiosInstance.get<BitgetIndexInfo>('/api/swap/v3/market/index', {
        params: { symbol }
      })
    },
    getOpenInterestApi(symbol: string) {
      return axiosInstance.get<BitgetOpenInterestInfo>('/api/swap/v3/market/open_interest', {
        params: { symbol }
      })
    },
    getPriceLimitApi(symbol: string) {
      return axiosInstance.get<BitgetPriceLimitInfo>('/api/swap/v3/market/price_limit', {
        params: { symbol }
      })
    },
    getFundingTimeApi(symbol: string) {
      return axiosInstance.get<{ funding_time: string }>('/api/swap/v3/market/funding_time', {
        params: { symbol }
      })
    },
    getHistoricalFundingRateApi(symbol: string, from: string, to: string, limit: string) {
      return axiosInstance.get<BitgetFundingHistoryInfo[]>(
        '/api/swap/v3/market/historical_funding_rate',
        {
          params: { symbol, from, to, limit }
        }
      )
    },
    getMarkPriceApi(symbol: string) {
      return axiosInstance.get<{ mark_price: string }>('/api/swap/v3/market/mark_price', {
        params: {
          symbol
        }
      })
    },
    calOpenCount(symbol: string, amount: string, leverage: string, openPrice: string) {
      return axiosInstance.get<string>('/api/swap/v3/market/open_count', {
        params: { symbol, amount, leverage, openPrice }
      })
    }
  }
}
