import BitgetApi from '../build'
import { test, describe, expect } from '@jest/globals'

describe('test after build', () => {
  const api = new BitgetApi.PublicApi('http://192.168.33.2:27832/', {})

  const symbol = 'cmt_btcusdt'

  test('/api/swap/v3/market/time', () => {
    expect.assertions(1)
    return api.getTime().then((data) => {
      expect(data.data.timestamp).toBeTruthy()
    })
  })
})
