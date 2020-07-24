import BitgetApi from '../src'
import { describe, test, expect } from '@jest/globals'

describe('MarketApiTest', () => {
  const bitgetPublicApi = BitgetApi.PublicApi.setUp('http://192.168.33.2:27832/', {})

  const symbol = 'cmt_btcusdt'

  test('/api/swap/v3/market/time', () => {
    expect.assertions(1)
    return bitgetPublicApi.getTime().then((data) => {
      // 期望系统时间和本地时间差距小于1s
      expect(Math.abs(data.data.timestamp - Date.now())).toBeLessThan(1000)
    })
  })

  test('/api/swap/v3/market/contracts', () => {
    expect.assertions(1)
    return bitgetPublicApi.getContractsApi().then((data) => {
      // 期望包含btcusd合约信息
      expect(data.data.find((c) => c.symbol === symbol)).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/depth', () => {
    expect.assertions(2)
    return bitgetPublicApi.getDepthApi(symbol, '100').then((data) => {
      // 期望两边都有深度
      expect(data.data.asks.length > 0).toBeTruthy()
      expect(data.data.bids.length > 0).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/tickers', () => {
    expect.assertions(1)
    return bitgetPublicApi.getTickersApi().then((data) => {
      // 期望包含所btcusd的ticker信息
      expect(data.data.find((t) => t.symbol === symbol)).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/ticker', () => {
    expect.assertions(1)
    return bitgetPublicApi.getTicker(symbol).then((data) => {
      // 期望包含最新价字段
      expect(data.data.last).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/trades', () => {
    expect.assertions(1)
    return bitgetPublicApi.getTrades(symbol, 100).then((data) => {
      // 期望能取到准确数量的
      expect(data.data.length).toBeLessThanOrEqual(100)
    })
  })

  test('/api/swap/v3/market/candles', () => {
    expect.assertions(1)
    return bitgetPublicApi
      .getCandles(symbol, '2020-06-28T10:00:12.000Z', '2020-06-28T16:00:12.000Z', '60')
      .then((data) => {
        expect(data.data).toBeTruthy()
      })
  })

  test('/api/swap/v3/market/index', () => {
    expect.assertions(1)
    return bitgetPublicApi.getIndex(symbol).then((data) => {
      // 期望包含指数价格字段
      expect(data.data.index).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/open_interest', () => {
    expect.assertions(1)
    return bitgetPublicApi.getOpenInterestApi(symbol).then((data) => {
      // 期望包含持仓数量字段
      expect(data.data.amount).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/price_limit', () => {
    expect.assertions(1)
    return bitgetPublicApi.getPriceLimitApi(symbol).then((data) => {
      // 期望包含最高价限制
      expect(data.data.highest).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/funding_time', () => {
    expect.assertions(1)
    return bitgetPublicApi.getFundingTimeApi(symbol).then((data) => {
      // 期望包含下一结算时间字段
      expect(data.data.funding_time).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/historical_funding_rate', () => {
    expect.assertions(1)
    return bitgetPublicApi.getHistoricalFundingRateApi(symbol, '1', '2', '50').then((data) => {
      expect(data.data.length > 0).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/mark_price', () => {
    expect.assertions(1)
    return bitgetPublicApi.getMarkPriceApi(symbol).then((data) => {
      expect(data.data.mark_price).toBeTruthy()
    })
  })

  test('/api/swap/v3/market/open_count', () => {
    expect.assertions(1)
    return bitgetPublicApi.calOpenCount(symbol, '9999.9393', '20', '9000').then((data) => {
      expect(data.data).toBeTruthy()
    })
  })
})
