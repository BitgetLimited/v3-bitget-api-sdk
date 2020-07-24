import axios, { AxiosRequestConfig, AxiosInstance } from 'axios'
import {
  BitgetContractInfo,
  BitgetDepthInfo,
  BitgetFundingHistoryInfo,
  BitgetIndexInfo,
  BitgetOpenInterestInfo,
  BitgetPriceLimitInfo,
  BitgetSystemTime,
  BitgetTickerInfo,
  BitgetTradeInfo
} from 'bitget-node-sdk'

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
