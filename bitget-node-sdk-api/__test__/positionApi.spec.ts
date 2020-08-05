import BitgetApi from '../src'
import { describe, test, expect } from '@jest/globals'

describe('PositionApiTest', () => {
  const bitgetAuthenticatedApi = new BitgetApi.PositionApi(
    'http://192.168.33.2:27832/',
    {},
    'bg_73487ebc68bff4718adcd50d659d02da',
    '234a3a17ea793b03ee227a20ef1bf7ba300ad75ccf6eb0b109f7190bd6f88cf7',
    '123123123'
  )

  const symbol = 'cmt_btcusdt'

  test('/api/swap/v3/position/allPosition', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.getAllPosition().then((data) => {
      // 期望能够获取到数据
      expect(data.data.length).toBeGreaterThanOrEqual(0)
    })
  })

  test('/api/swap/v3/position/singlePosition', () => {
    expect.assertions(2)
    return bitgetAuthenticatedApi.getSinglePosition(symbol).then((data) => {
      // 期望能够获取到数据
      expect(data.data.holding.length).toBeGreaterThanOrEqual(0)
      // 期望仓位模式正确
      expect(data.data.margin_mode).toBe('fixed')
    })
  })

  test('/api/swap/v3/position/holds', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.getHolds(symbol).then((data) => {
      // 期望获取到数据
      expect(data.data.symbol).toBe(symbol)
    })
  })

  test('/api/swap/v3/position/virtualCapital', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.virtualCapital('usdt', '14', 10, 398526).then((data) => {
      // 期望查到数据
      expect(data.data.length).toBeGreaterThanOrEqual(0)
    })
  })
})
