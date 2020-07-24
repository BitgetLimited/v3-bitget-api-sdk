import axios, { AxiosRequestConfig, AxiosInstance } from 'axios'
import {
  BitgetAccountInfo,
  BitgetAccountSettingInfo,
  BitgetAdjustMarginResult,
  BitgetAutoAppendMarginResult,
  BitgetBatchOrderResult,
  BitgetCancelBatchOrderResult,
  BitgetCancelOrderResult,
  BitgetLedgerInfo,
  BitgetOrderRequest,
  BitgetOrderDetail,
  BitgetOrderFillInfo,
  BitgetOrderResult,
  BitgetPlanOrderRequest,
  BitgetPlanOrderResult,
  BitgetPlanOrderPage,
  BitgetPositionPage,
  BitgetPositionHoldInfo,
  BitgetVirtualRecordInfo
} from 'bitget-node-sdk'
import { stringify } from 'querystring'
import { createHmac } from 'crypto'

/**
 * 需要授权的API
 * @param apiUri API地址
 * @param httpConfig Axios相关配置，超时时间等
 * @param apiKey 公钥
 * @param secretKey 私钥
 * @param passphrase 口令
 */
export function setUp(
  apiUri = 'https://capi.bitget.com',
  httpConfig: AxiosRequestConfig = { timeout: 3000 },
  apiKey: string = '',
  secretKey: string = '',
  passphrase: string = ''
) {
  const axiosInstance: AxiosInstance = axios.create({
    baseURL: apiUri,
    ...httpConfig
  })

  axiosInstance.interceptors.request.use((data) => {
    // tslint:disable-next-line:no-console
    console.log(data.data || data.params)
    return data
  })

  axiosInstance.interceptors.response.use(
    (data) => {
      return data
    },
    (err) => {
      // tslint:disable-next-line:no-console
      console.error(err.response.data)
      throw err
    }
  )

  /**
   * 加密算法
   * @param timestamp
   * @param httpMethod
   * @param url
   * @param qsOrBody
   */
  function encrypt(
    timestamp: number,
    httpMethod: string,
    url: string,
    qsOrBody: NodeJS.Dict<string | number> | null
  ) {
    httpMethod = httpMethod.toUpperCase()
    const qsOrBodyStr = qsOrBody
      ? httpMethod === 'GET'
        ? '?' + stringify(qsOrBody)
        : JSON.stringify(qsOrBody)
      : ''

    const preHash = String(timestamp) + httpMethod + url + qsOrBodyStr

    const mac = createHmac('sha256', secretKey)
    const preHashToMacBuffer = mac.update(preHash).digest()
    return preHashToMacBuffer.toString('base64')
  }

  /**
   * 拼接头部
   * @param httpMethod
   * @param url
   * @param qsOrBody GET请求对应queryString，POST请求对应请求body
   * @param locale 可选的多语言
   */
  function getSignedHeaders(
    httpMethod: string,
    url: string,
    qsOrBody: NodeJS.Dict<any> | null,
    locale = 'zh-CN'
  ) {
    const timestamp = Date.now()

    const signString = encrypt(timestamp, httpMethod, url, qsOrBody)

    return {
      'ACCESS-SIGN': signString,
      'ACCESS-TIMESTAMP': timestamp,
      'ACCESS-KEY': apiKey,
      'ACCESS-PASSPHRASE': passphrase,
      'Content-Type': 'application/json',
      Cookie: 'locale=' + locale,
      locale
    }
  }

  return {
    account() {
      return {
        accounts() {
          const url = '/api/swap/v3/account/accounts'
          const headers = getSignedHeaders('GET', url, null)
          return axiosInstance.get<BitgetAccountInfo[]>(url, {
            headers
          })
        },
        getAccount(symbol: string) {
          const url = '/api/swap/v3/account/account'
          const qsOrBody = { symbol }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetAccountInfo>(url, {
            headers,
            params: qsOrBody
          })
        },
        settings(symbol: string) {
          const url = '/api/swap/v3/account/settings'
          const qsOrBody = { symbol }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetAccountSettingInfo>(url, {
            headers,
            params: qsOrBody
          })
        },
        leverage(symbol: string, leverage: number, side: number) {
          const url = '/api/swap/v3/account/leverage'
          const qsOrBody = { symbol, leverage, side }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetAccountSettingInfo>(url, qsOrBody, {
            headers
          })
        },
        getLedger(
          symbol: string,
          from: number,
          to: number,
          limit: number,
          startTime: string,
          endTime: string
        ) {
          const url = '/api/swap/v3/account/ledger'
          const qsOrBody = { symbol, from, to, limit, startTime, endTime }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetLedgerInfo[]>(url, {
            headers,
            params: qsOrBody
          })
        },
        ledgerMargin(
          symbol: string,
          from: number,
          to: number,
          limit: number,
          startTime: string,
          endTime: string
        ) {
          const url = '/api/swap/v3/account/ledgerMargin'
          const qsOrBody = { symbol, from, to, limit, startTime, endTime }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetLedgerInfo[]>(url, {
            headers,
            params: qsOrBody
          })
        },
        adjustMargin(symbol: string, amount: string, positionType: number, type: number) {
          const url = '/api/swap/v3/account/adjustMargin'
          const qsOrBody = { symbol, amount, positionType, type }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetAdjustMarginResult>(url, qsOrBody, {
            headers
          })
        },
        modifyAutoAppendMargin(symbol: string, side: number, appendType: number) {
          const url = '/api/swap/v3/account/modifyAutoAppendMargin'
          const qsOrBody = { symbol, side, append_type: appendType }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetAutoAppendMarginResult>(url, qsOrBody, {
            headers
          })
        }
      }
    },
    order() {
      return {
        postOrder(order: BitgetOrderRequest) {
          const url = '/api/swap/v3/order/placeOrder'
          const headers = getSignedHeaders('POST', url, order)
          return axiosInstance.post<BitgetOrderResult>(url, order, {
            headers
          })
        },
        batchOrders(symbol: string, orderData: BitgetOrderRequest[]) {
          const url = '/api/swap/v3/order/batchOrders'
          const qsOrBody = { symbol, order_data: JSON.stringify(orderData) }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetBatchOrderResult>(url, qsOrBody, {
            headers
          })
        },
        cancelOrder(symbol: string, orderId: string) {
          const url = '/api/swap/v3/order/cancel_order'
          const qsOrBody = { symbol, orderId }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetCancelOrderResult>(url, qsOrBody, {
            headers
          })
        },
        cancelBathOrders(symbol: string, ids: string[]) {
          const url = '/api/swap/v3/order/cancel_batch_orders'
          const qsOrBody = { symbol, ids }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetCancelBatchOrderResult>(url, qsOrBody, {
            headers
          })
        },
        getOrderDetail(symbol: string, orderId: string) {
          const url = '/api/swap/v3/order/detail'
          const qsOrBody = { symbol, orderId }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetOrderDetail>(url, {
            headers,
            params: qsOrBody
          })
        },
        getOrders(symbol: string, status: number, from: number, to: number, limit: number) {
          const url = '/api/swap/v3/order/orders'
          const qsOrBody = { symbol, status, from, to, limit }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetOrderDetail[]>(url, {
            headers,
            params: qsOrBody
          })
        },
        getFills(symbol: string, orderId: string) {
          const url = '/api/swap/v3/order/fills'
          const qsOrBody = { symbol, orderId }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetOrderFillInfo[]>(url, {
            headers,
            params: qsOrBody
          })
        },
        planOrder(planOrder: BitgetPlanOrderRequest) {
          const url = '/api/swap/v3/order/plan_order'
          const headers = getSignedHeaders('POST', url, planOrder)
          return axiosInstance.post<BitgetPlanOrderResult>(url, planOrder, {
            headers
          })
        },
        cancelPlan(symbol: string, orderId: string) {
          const url = '/api/swap/v3/order/cancel_plan'
          const qsOrBody = { symbol, orderId }
          const headers = getSignedHeaders('POST', url, qsOrBody)
          return axiosInstance.post<BitgetOrderResult>(url, qsOrBody, {
            headers
          })
        },
        currentPlan(
          symbol: string,
          side: number,
          pageIndex: number,
          pageSize: number,
          startTime: string,
          endTime: string
        ) {
          const url = '/api/swap/v3/order/currentPlan'
          const qsOrBody = { symbol, side, pageIndex, pageSize, startTime, endTime }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetPlanOrderPage>(url, {
            headers,
            params: qsOrBody
          })
        },
        historyPlan(
          symbol: string,
          side: number,
          pageIndex: number,
          pageSize: number,
          startTime: string,
          endTime: string
        ) {
          const url = '/api/swap/v3/order/historyPlan'
          const qsOrBody = { symbol, side, pageIndex, pageSize, startTime, endTime }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetPlanOrderPage>(url, {
            headers,
            params: qsOrBody
          })
        }
      }
    },
    position() {
      return {
        getAllPosition() {
          const url = '/api/swap/v3/position/allPosition'
          const headers = getSignedHeaders('GET', url, null)
          return axiosInstance.get<BitgetPositionPage[]>(url, {
            headers
          })
        },
        getSinglePosition(symbol: string) {
          const url = '/api/swap/v3/position/singlePosition'
          const qsOrBody = { symbol }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetPositionPage>(url, {
            headers,
            params: qsOrBody
          })
        },
        getHolds(symbol: string) {
          const url = '/api/swap/v3/position/holds'
          const qsOrBody = { symbol }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetPositionHoldInfo>(url, {
            headers,
            params: qsOrBody
          })
        },
        virtualCapital(symbol: string, ftype: string, limit: number, gt?: number, lt?: number) {
          const url = '/api/swap/v3/position/virtualCapital'
          const qsOrBody: NodeJS.Dict<any> = { symbol, ftype, limit }
          if (gt) {
            qsOrBody.gt = gt
          }
          if (lt) {
            qsOrBody.lt = lt
          }
          const headers = getSignedHeaders('GET', url, qsOrBody)
          return axiosInstance.get<BitgetVirtualRecordInfo[]>(url, {
            headers,
            params: qsOrBody
          })
        }
      }
    }
  }
}
