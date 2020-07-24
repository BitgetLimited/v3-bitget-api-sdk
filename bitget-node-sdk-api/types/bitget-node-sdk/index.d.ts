import { AxiosRequestConfig } from 'axios'

/**
 * /api/swap/v3/market/time
 * 系统时间
 */
export interface BitgetSystemTime {
  epoch: string
  iso: string
  timestamp: number
}

/**
 * /api/swap/v3/market/contracts
 * 合约基本信息
 */
export interface BitgetContractInfo {
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
export interface BitgetDepthInfo {
  asks: string[][]
  bids: string[][]
}

/**
 * /api/swap/v3/market/tickers
 * ticker基本信息
 */
export interface BitgetTickerInfo {
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
export interface BitgetTradeInfo {
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
export interface BitgetIndexInfo {
  symbol: string
  index: string
  timestamp: string
}

/**
 * /api/swap/v3/market/open_interest
 * 平台持仓量信息
 */
export interface BitgetOpenInterestInfo {
  symbol: string
  amount: string
  timestamp: string
  forwardContractFlag: boolean
}

/**
 * /api/swap/v3/market/price_limit
 * 限价信息
 */
export interface BitgetPriceLimitInfo {
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
export interface BitgetFundingHistoryInfo {
  symbol: string
  funding_rate: string
  funding_time: string
}

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
 * 设置BitgetAPI 客户端
 * @param apiUri API地址
 * @param httpConfig Axios相关配置，超时时间等
 */
export declare function PublicApiSetUp(
  apiUri?: string,
  httpConfig?: AxiosRequestConfig
): {
  getTime(): Promise<import('axios').AxiosResponse<BitgetSystemTime>>
  getContractsApi(): Promise<import('axios').AxiosResponse<BitgetContractInfo[]>>
  getDepthApi(
    symbol: string,
    limit: string
  ): Promise<import('axios').AxiosResponse<BitgetDepthInfo>>
  getTickersApi(): Promise<import('axios').AxiosResponse<BitgetTickerInfo[]>>
  getTicker(symbol: string): Promise<import('axios').AxiosResponse<BitgetTickerInfo>>
  getTrades(
    symbol: string,
    limit: string | number
  ): Promise<import('axios').AxiosResponse<BitgetTradeInfo[]>>
  getCandles(
    symbol: string,
    start: string,
    end: string,
    granularity: string
  ): Promise<import('axios').AxiosResponse<any>>
  getIndex(symbol: string): Promise<import('axios').AxiosResponse<BitgetIndexInfo>>
  getOpenInterestApi(symbol: string): Promise<import('axios').AxiosResponse<BitgetOpenInterestInfo>>
  getPriceLimitApi(symbol: string): Promise<import('axios').AxiosResponse<BitgetPriceLimitInfo>>
  getFundingTimeApi(
    symbol: string
  ): Promise<
    import('axios').AxiosResponse<{
      funding_time: string
    }>
  >
  getHistoricalFundingRateApi(
    symbol: string,
    from: string,
    to: string,
    limit: string
  ): Promise<import('axios').AxiosResponse<BitgetFundingHistoryInfo[]>>
  getMarkPriceApi(
    symbol: string
  ): Promise<
    import('axios').AxiosResponse<{
      mark_price: string
    }>
  >
  calOpenCount(
    symbol: string,
    amount: string,
    leverage: string,
    openPrice: string
  ): Promise<import('axios').AxiosResponse<string>>
}

/**
 * 需要授权的API
 * @param apiUri API地址
 * @param httpConfig Axios相关配置，超时时间等
 * @param apiKey 公钥
 * @param secretKey 私钥
 * @param passphrase 口令
 */
export declare function AuthenticatedApiSetUp(
  apiUri?: string,
  httpConfig?: AxiosRequestConfig,
  apiKey?: string,
  secretKey?: string,
  passphrase?: string
): {
  account(): {
    accounts(): Promise<import('axios').AxiosResponse<BitgetAccountInfo[]>>
    getAccount(symbol: string): Promise<import('axios').AxiosResponse<BitgetAccountInfo>>
    settings(symbol: string): Promise<import('axios').AxiosResponse<BitgetAccountSettingInfo>>
    leverage(
      symbol: string,
      leverage: number,
      side: number
    ): Promise<import('axios').AxiosResponse<BitgetAccountSettingInfo>>
    getLedger(
      symbol: string,
      from: number,
      to: number,
      limit: number,
      startTime: string,
      endTime: string
    ): Promise<import('axios').AxiosResponse<BitgetLedgerInfo[]>>
    ledgerMargin(
      symbol: string,
      from: number,
      to: number,
      limit: number,
      startTime: string,
      endTime: string
    ): Promise<import('axios').AxiosResponse<BitgetLedgerInfo[]>>
    adjustMargin(
      symbol: string,
      amount: string,
      positionType: number,
      type: number
    ): Promise<import('axios').AxiosResponse<BitgetAdjustMarginResult>>
    modifyAutoAppendMargin(
      symbol: string,
      side: number,
      appendType: number
    ): Promise<import('axios').AxiosResponse<BitgetAutoAppendMarginResult>>
  }
  order(): {
    postOrder(order: BitgetOrderRequest): Promise<import('axios').AxiosResponse<BitgetOrderResult>>
    batchOrders(
      symbol: string,
      orderData: BitgetOrderRequest[]
    ): Promise<import('axios').AxiosResponse<BitgetBatchOrderResult>>
    cancelOrder(
      symbol: string,
      orderId: string
    ): Promise<import('axios').AxiosResponse<BitgetCancelOrderResult>>
    cancelBathOrders(
      symbol: string,
      ids: string[]
    ): Promise<import('axios').AxiosResponse<BitgetCancelBatchOrderResult>>
    getOrderDetail(
      symbol: string,
      orderId: string
    ): Promise<import('axios').AxiosResponse<BitgetOrderDetail>>
    getOrders(
      symbol: string,
      status: number,
      from: number,
      to: number,
      limit: number
    ): Promise<import('axios').AxiosResponse<BitgetOrderDetail[]>>
    getFills(
      symbol: string,
      orderId: string
    ): Promise<import('axios').AxiosResponse<BitgetOrderFillInfo[]>>
    planOrder(
      planOrder: BitgetPlanOrderRequest
    ): Promise<import('axios').AxiosResponse<BitgetPlanOrderResult>>
    cancelPlan(
      symbol: string,
      orderId: string
    ): Promise<import('axios').AxiosResponse<BitgetOrderResult>>
    currentPlan(
      symbol: string,
      side: number,
      pageIndex: number,
      pageSize: number,
      startTime: string,
      endTime: string
    ): Promise<import('axios').AxiosResponse<BitgetPlanOrderPage>>
    historyPlan(
      symbol: string,
      side: number,
      pageIndex: number,
      pageSize: number,
      startTime: string,
      endTime: string
    ): Promise<import('axios').AxiosResponse<BitgetPlanOrderPage>>
  }
  position(): {
    getAllPosition(): Promise<import('axios').AxiosResponse<BitgetPositionPage[]>>
    getSinglePosition(symbol: string): Promise<import('axios').AxiosResponse<BitgetPositionPage>>
    getHolds(symbol: string): Promise<import('axios').AxiosResponse<BitgetPositionHoldInfo>>
    virtualCapital(
      symbol: string,
      ftype: string,
      limit: number,
      gt?: number | undefined,
      lt?: number | undefined
    ): Promise<import('axios').AxiosResponse<BitgetVirtualRecordInfo[]>>
  }
}
