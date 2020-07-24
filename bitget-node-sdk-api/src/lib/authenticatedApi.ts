import axios, { AxiosRequestConfig, AxiosInstance } from 'axios'
import { stringify } from 'querystring'
import { createHmac } from 'crypto'

/**
 * /api/swap/v3/account/account
 * 单个账户余额信息
 */
export interface BitgetAccountInfo {
  equity: string
  fixed_balance: string
  total_avail_balance: string
  margin: string
  realized_pnl: string
  unrealized_pnl: string
  symbol: string
  margin_frozen: string
  timestamp: string
  margin_mode: string
  forwardContractFlag: boolean
}

/**
 * /api/swap/v3/account/settings
 * 单个账户的配置信息，杠杆及仓位模式
 */
export interface BitgetAccountSettingInfo {
  long_leverage: string
  margin_mode: string
  short_leverage: string
  symbol: string
  forwardContractFlag: boolean
}

/**
 * /api/swap/v3/account/ledger
 * 资产流水
 */
export interface BitgetLedgerInfo {
  ledger_id: string
  amount: string
  type: number
  fee: string
  timestamp: string
  create_time: string
  biz_time: string
  symbol: string
}

/**
 * /api/swap/v3/account/adjustMargin
 * 调整保证金的结果
 */
export interface BitgetAdjustMarginResult {
  result: boolean
  orderNo: string
}

/**
 * /api/swap/v3/account/modifyAutoAppendMargin
 * 开关自动追加保证金结果
 */
export interface BitgetAutoAppendMarginResult {
  result: boolean
  append_type: number
}

/**
 * 合约委托请求实体
 * 请求参数
 */
export interface BitgetOrderRequest extends NodeJS.Dict<string | number> {
  symbol?: string
  client_oid?: string // 自定义订单号(不超过50个字符，且不能是特殊字符，如火星字符等)
  size: number
  type: number // 1:开多 2:开空 3:平多 4:平空
  match_price: number // 0:限价还是1:市价
  price: string
  order_type: number // 0:普通，1：只做maker;2:全部成交或立即取消;3:立即成交并取消剩余
  trace_no?: string // 跟单号
}

/**
 * /api/swap/v3/order/placeOrder
 * 合约委托结果
 */
export interface BitgetOrderResult {
  client_oid: string
  order_id: string
  result?: boolean
  error_code?: string
  error_message?: string
}

/**
 * /api/swap/v3/order/batchOrders
 * 批量下单返回结果
 */
export interface BitgetBatchOrderResult {
  order_info: BitgetOrderResult[]
  result: boolean
}

/**
 * /api/swap/v3/order/cancel_order
 * 取消委托返回结果
 */
export interface BitgetCancelOrderResult {
  order_id: string
  client_oid: string
  symbol: string
  result: boolean
  err_code: string
  err_msg: string
}

export interface BitgetCancelBatchOrderResult {
  result: boolean
  symbol: boolean
  order_ids: string[]
  fail_infos: BitgetCancelOrderResult[]
}

/**
 * /api/swap/v3/order/detail
 * 委托明细
 */
export interface BitgetOrderDetail {
  symbol: string
  size: string
  timestamp: string
  client_oid: string
  createTime: string
  filled_qty: string
  fee: string
  order_id: string
  price: string
  price_avg: string
  status: string
  type: string
  order_type: string
  totalProfits: string
}

/**
 * /api/swap/v3/order/fills
 * 成交明细
 */
export interface BitgetOrderFillInfo {
  trade_id: string
  symbol: string
  order_id: string
  price: string
  order_qty: string
  fee: string
  timestamp: string
  exec_type: string
  side: string
}

/**
 * /api/swap/v3/order/plan_order
 * 计划委托请求实体
 */
export interface BitgetPlanOrderRequest extends NodeJS.Dict<any> {
  execute_price: string
  trigger_price: string
  match_type: string
  side: string
  type: string
  size: string
  symbol: string
  client_oid: string
}

/**
 * /api/swap/v3/order/plan_order
 * 计划委托结果
 */
export interface BitgetPlanOrderResult {
  client_oid: string
  order_id: string
}

/**
 * 计划委托详情
 */
export interface BitgetPlanOrderInfo {
  execute_count: string
  delegate_count: string
  create_time: string
  update_time: string
  direction: number
  direction_desc: string
  trigger_price: string
  execute_price: string
  order_id: string
  order_type: number
  symbol: string
  status: number
  status_desc: string
  create_trade_price: string
}

/**
 * /api/swap/v3/order/currentPlan
 * 计划委托分页数据
 */
export interface BitgetPlanOrderPage {
  nextPage: boolean
  list: BitgetPlanOrderInfo[]
}

/**
 * /api/swap/v3/position/allPosition
 * 仓位信息
 */
export interface BitgetPositionInfo {
  liquidation_price: string
  position: string
  avail_position: string
  avg_cost: string
  symbol: string
  leverage: string
  realized_pnl: string
  side: string
  timestamp: string
  margin: string
}

/**
 * 获取全部仓位时所用数据
 */
export interface BitgetPositionPage {
  margin_mode: string
  holding: BitgetPositionInfo[]
}

/**
 * /api/swap/v3/position/holds
 * 某合约持仓数量
 */
export interface BitgetPositionHoldInfo {
  symbol: string
  amount: string
  timestamp: string
}

/**
 * /api/swap/v3/position/virtualCapital
 * 财务记录
 */
export interface BitgetVirtualRecordInfo {
  fid: number
  fuid: number
  fcoinid: number
  famount: number
  ffees: string
  fbtcfees: string
  ftype: number
  fstatus: number
  ftag: string
  fip: string
  fisfromapi: string
  funiquenumber: string
  fwithdrawaddress: string
  frechargeaddress: string
  fcreatetime: string
  fupdatetime: string
}

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
