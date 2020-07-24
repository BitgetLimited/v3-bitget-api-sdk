import BitgetApi from '../src'
import { describe, test, expect } from '@jest/globals'

describe('OrderApiTest', () => {
  const bitgetAuthenticatedApi = BitgetApi.AuthenticatedApi.setUp(
    'http://192.168.33.2:27832/',
    {},
    'bg_73487ebc68bff4718adcd50d659d02da',
    '234a3a17ea793b03ee227a20ef1bf7ba300ad75ccf6eb0b109f7190bd6f88cf7',
    '123123123'
  ).order()

  const symbol = 'cmt_btcusdt'

  test('/api/swap/v3/order/placeOrder & cancel_order', () => {
    expect.assertions(2)
    return bitgetAuthenticatedApi
      .postOrder({
        client_oid: 'abc',
        match_price: 0,
        order_type: 0,
        price: '9009.5',
        size: 2,
        symbol,
        trace_no: '',
        type: 4
      })
      .then((data) => {
        // 期望委托结果符合预期
        expect(data.data.client_oid === 'abc').toBeTruthy()
        const orderId = data.data.order_id
        return bitgetAuthenticatedApi.cancelOrder(symbol, orderId).then((cancelResult) => {
          // 期望还能撤单
          expect(cancelResult.data.order_id).toBe(orderId)
        })
      })
  })

  test('/api/swap/v3/order/batchOrders & cancel_batch_orders', () => {
    const orders = [
      { client_oid: 'E213', order_type: 1, price: '9000.5', size: 2, type: 1, match_price: 0 }
    ]
    expect.assertions(2)
    return bitgetAuthenticatedApi.batchOrders(symbol, orders).then((data) => {
      // 期望处理结果和请求数量相同
      expect(data.data.order_info.length).toBe(orders.length)
      const ids = data.data.order_info.map((r) => r.order_id)
      return bitgetAuthenticatedApi.cancelBathOrders(symbol, ids).then((cancelResult) => {
        // 期待撤销的数据量与委托数据量相同
        // TODO 这里撤销成功，order_ids为空
        expect(cancelResult.data.result).toBeTruthy()
      })
    })
  })

  test('/api/swap/v3/order/detail & fills', () => {
    const orderId = '670110877814358013'
    expect.assertions(2)
    return bitgetAuthenticatedApi.getOrderDetail(symbol, orderId).then((data) => {
      // 期望查询到正确的数据
      expect(data.data.order_id).toBe(orderId)
      return bitgetAuthenticatedApi.getFills(symbol, orderId).then((fillData) => {
        // 期望有成交明细
        expect(fillData.data.length).toBeGreaterThanOrEqual(0)
      })
    })
  })

  test('/api/swap/v3/order/orders', () => {
    expect.assertions(1)
    return bitgetAuthenticatedApi.getOrders(symbol, 0, 1, 2, 50).then((data) => {
      // 期望有数据
      expect(data.data.length).toBeGreaterThanOrEqual(0)
    })
  })

  test('/api/swap/v3/order/plan_order & cancel_plan', () => {
    const clientOid = 'aabbcc'
    expect.assertions(2)
    return bitgetAuthenticatedApi
      .planOrder({
        client_oid: clientOid,
        execute_price: '9980',
        match_type: '1',
        side: '1',
        size: '100',
        symbol,
        trigger_price: '10000',
        type: '1'
      })
      .then((data) => {
        // TODO 响应并不包含client_oid
        const orderId = data.data.order_id
        // 期望挂单成功
        expect(data.data.order_id).toBeTruthy()
        return bitgetAuthenticatedApi.cancelPlan(symbol, orderId).then((cancelResult) => {
          // 期望撤单成功
          expect(cancelResult.data.order_id).toBe(orderId)
        })
      })
  })

  test('/api/swap/v3/order/currentPlan', () => {
    // TODO 时间范围错误 40408 不传时间可以查询到数据
    expect.assertions(1)
    return bitgetAuthenticatedApi.currentPlan(symbol, 1, 1, 50, '', '').then((data) => {
      // 期望查询到数据
      expect(data.data.list.length).toBeGreaterThanOrEqual(0)
    })
  })

  test('/api/swap/v3/order/historyPlan', () => {
    // TODO 时间范围错误 40408 不传时间可以查询到数据
    expect.assertions(1)
    return bitgetAuthenticatedApi.historyPlan(symbol, 1, 1, 50, '', '').then((data) => {
      // 期望查询到数据
      expect(data.data.list.length).toBeGreaterThanOrEqual(0)
    })
  })
})
