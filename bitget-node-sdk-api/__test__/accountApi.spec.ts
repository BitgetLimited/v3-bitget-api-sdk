import BitgetApi from '../src'
import { describe, test, expect } from '@jest/globals'

describe('AccountApiTest', () => {
  const bitgetAuthenticatedApi = new BitgetApi.AccountApi(
    'http://192.168.33.2:27832/',
    {},
    'bg_73487ebc68bff4718adcd50d659d02da',
    '234a3a17ea793b03ee227a20ef1bf7ba300ad75ccf6eb0b109f7190bd6f88cf7',
    '123123123'
  )

  const symbol = 'cmt_btcusdt'

  test('/api/swap/v3/account/accounts', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.accounts().then((data) => {
      // 期望获取到所有交易对的数据
      expect(data.data.length > 0).toBeTruthy()
    })
  })

  test('/api/swap/v3/account/account', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.getAccount(symbol).then((data) => {
      expect(data.data.symbol === symbol).toBeTruthy()
    })
  })

  test('/api/swap/v3/account/settings', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.settings(symbol).then((data) => {
      expect(data.data.symbol === symbol).toBeTruthy()
    })
  })

  test('/api/swap/v3/account/leverage', () => {
    expect.assertions(1)
    // 40006
    return bitgetAuthenticatedApi.leverage(symbol, 10, 1).then((data) => {
      // 期望更改结果
      expect(data.data.long_leverage === '10').toBeTruthy()
    })
  })

  test('/api/swap/v3/account/ledger', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi
      .getLedger(symbol, 1, 2, 10, '1593532800000', String(Date.now()))
      .then((data) => {
        // 期望可以查到数据
        expect(data.data.length > 0).toBeTruthy()
      })
  })

  test('/api/swap/v3/account/ledgerMargin', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi
      .ledgerMargin(symbol, 1, 2, 10, '1593532800000', String(Date.now()))
      .then((data) => {
        // 期望可以查到数据
        expect(data.data.length > 0).toBeTruthy()
      })
  })

  test('/api/swap/v3/account/adjustMargin', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.adjustMargin(symbol, '10', 0, 2).then((data) => {
      // 期望调整成功
      expect(data.data.result).toBeTruthy()
    })
  })

  test('/api/swap/v3/account/modifyAutoAppendMargin', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.modifyAutoAppendMargin(symbol, 2, 0).then((data) => {
      // 期望修改结果正确
      expect(data.data.append_type === 0).toBeTruthy()
    })
  })
})
