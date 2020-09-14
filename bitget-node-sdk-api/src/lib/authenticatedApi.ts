import axios, { AxiosRequestConfig, AxiosInstance } from 'axios'
import getSigner, { BitgetApiHeader } from './util'

/**
 * /api/swap/v3/account/account
 * 单个账户余额信息
 */
export interface BitgetAccountInfo {
  /**
   * 账户权益
   */
  equity: string
  /**
   * 逐仓账户余额
   */
  fixed_balance: string
  /**
   * 账户余额
   */
  total_avail_balance: string
  /**
   * 已用保证金
   */
  margin: string
  /**
   * 已实现盈亏
   */
  realized_pnl: string
  /**
   * 未实现盈亏
   */
  unrealized_pnl: string
  symbol: string
  /**
   * 开仓冻结保证金
   */
  margin_frozen: string
  timestamp: string
  /**
   * 仓位模式 fixed逐仓模式 crossed全仓模式
   */
  margin_mode: string
  forwardContractFlag: boolean
}

/**
 * /api/swap/v3/account/settings
 * 单个账户的配置信息，杠杆及仓位模式
 */
export interface BitgetAccountSettingInfo {
  /**
   * 多仓杠杆
   */
  long_leverage: string
  margin_mode: string
  /**
   * 空仓杠杆
   */
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
  /**
   * 变动数量
   */
  amount: string
  /**
   * 变动类型
   */
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
  /**
   * 调整保证金订单号
   */
  orderNo: string
}

/**
 * /api/swap/v3/account/modifyAutoAppendMargin
 * 开关自动追加保证金结果
 */
export interface BitgetAutoAppendMarginResult {
  result: boolean
  /**
   * 设置后状态 0-关闭 1-开启
   */
  append_type: number
}

/**
 * 合约委托请求实体
 * 请求参数
 */
export interface BitgetOrderRequest extends NodeJS.Dict<string | number> {
  symbol?: string
  /**
   * 自定义订单号(不超过50个字符，且不能是特殊字符，如火星字符等)
   */
  client_oid?: string
  size: number
  /**
   * 委托类型 1:开多 2:开空 3:平多 4:平空
   */
  type: number
  /**
   * 委托价格类型 0:限价还是1:市价
   */
  match_price: number
  price: string
  /**
   * 委托时效类型 0:普通，1：只做maker;2:全部成交或立即取消;3:立即成交并取消剩余
   */
  order_type: number
  /**
   * 跟单号
   */
  trace_no?: string
}

/**
 * /api/swap/v3/order/placeOrder
 * 合约委托结果
 */
export interface BitgetOrderResult {
  client_oid: string
  /**
   * 委托成功单号
   */
  order_id: string
  result?: boolean
  /**
   * 委托失败错误码
   */
  error_code?: string
  /**
   * 委托失败信息
   */
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
  /**
   * 取消失败错误码
   */
  err_code: string
  /**
   * 取消失败原因
   */
  err_msg: string
}

/**
 * 批量撤单结果
 */
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
  /**
   * 委托数量
   */
  size: string
  timestamp: string
  client_oid: string
  /**
   * 创建时间
   */
  createTime: string
  /**
   * 成交数量
   */
  filled_qty: string
  fee: string
  order_id: string
  /**
   * 委托价格
   */
  price: string
  /**
   * 成交均价
   */
  price_avg: string
  /**
   * 订单状态( -1:撤销成功 0:等待成交 1:部分成交 2:完全成交)
   */
  status: string
  /**
   * 委托类型 1:开多 2:开空 3:平多 4:平空 5:减仓平多 6:减仓平空 7:协议平多 8:协议平空 9:爆仓平多 10:爆仓平空
   */
  type: string
  /**
   * 委托时效类型
   * 0：普通委托 1：只做Maker（Post only） 2：全部成交或立即取消（FOK） 3：立即成交并取消剩余（IOC）
   */
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
  /**
   * 流动性方向，T：taker M：maker
   */
  exec_type: string
  /**
   * 订单方向（1：开多；2：开空；3：平多；4：平空；5：强制平多；6：强制平空；11：协议平多；12：协议平空；13：爆仓平多查询；14：爆仓平空查询
   */
  side: string
}

/**
 * /api/swap/v3/order/plan_order
 * 计划委托请求实体
 */
export interface BitgetPlanOrderRequest extends NodeJS.Dict<any> {
  /**
   * 执行价格
   */
  execute_price: string
  /**
   * 触发价格
   */
  trigger_price: string
  /**
   * 0:限价还是1:市价
   */
  match_type: string
  /**
   * 方向 1多仓 2空仓
   */
  side: string
  /**
   * 类型 1开仓 2平仓
   */
  type: string
  /**
   * 委托数量
   */
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
  /**
   * 执行数量
   */
  execute_count: string
  /**
   * 委托数量
   */
  delegate_count: string
  create_time: string
  update_time: string
  /**
   * 方向 1开多 2开空 3平多 4平空
   */
  direction: number
  /**
   * 方向描述
   */
  direction_desc: string
  trigger_price: string
  execute_price: string
  order_id: string
  order_type: number
  symbol: string
  /**
   * 1未执行状态 2已委托 3执行失败状态 4用户取消状态
   */
  status: number
  status_desc: string
  /**
   * 计划委托时的成交价
   */
  create_trade_price: string
}

/**
 * /api/swap/v3/order/currentPlan
 * 计划委托分页数据
 */
export interface BitgetPlanOrderPage {
  /**
   * 是否还有下一页
   */
  nextPage: boolean
  list: BitgetPlanOrderInfo[]
}

/**
 * /api/swap/v3/position/allPosition
 * 仓位信息
 */
export interface BitgetPositionInfo {
  /**
   * 预估爆仓价
   */
  liquidation_price: string
  /**
   * 持仓数量
   */
  position: string
  /**
   * 可平数量
   */
  avail_position: string
  /**
   * 平均开仓价
   */
  avg_cost: string
  symbol: string
  leverage: string
  /**
   * 已实现盈亏
   */
  realized_pnl: string
  /**
   * 方向 1-多 2-空
   */
  side: string
  timestamp: string
  /**
   * 已用保证金
   */
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
  /**
   * 虚拟币id
   */
  fcoinid: number
  /**
   * 数量
   */
  famount: number
  /**
   * 手续费
   */
  ffees: string
  /**
   * btc费用
   */
  fbtcfees: string
  /**
   * 类型(1充值,2提现)
   */
  ftype: number
  /**
   * 状态（1-等待提现，2-正在处理，3-提现成功，4-用户撤销
   */
  fstatus: number
  /**
   * 提现地址tag
   */
  ftag: string
  fip: string
  /**
   * 是否为API提币
   */
  fisfromapi: string
  /**
   * 交易ID
   */
  funiquenumber: string
  /**
   * 提现地址
   */
  fwithdrawaddress: string
  /**
   * 充值地址
   */
  frechargeaddress: string
  /**
   * 创建时间
   */
  fcreatetime: string
  /**
   * 更新时间
   */
  fupdatetime: string
}

class AuthenticatedApi {
  axiosInstance: AxiosInstance
  protected signer: (
    httpMethod: string,
    url: string,
    qsOrBody: NodeJS.Dict<any> | null,
    locale?: string
  ) => BitgetApiHeader

  /**
   * 构造平台账户授权的API实例
   * @param apiUri
   * @param httpConfig
   * @param apiKey 公钥
   * @param secretKey 私钥
   * @param passphrase 口令
   */
  constructor(
    apiUri = 'https://capi.bitget.com',
    httpConfig: AxiosRequestConfig = { timeout: 3000 },
    apiKey: string = '',
    secretKey: string = '',
    passphrase: string = ''
  ) {
    this.axiosInstance = axios.create({
      baseURL: apiUri,
      ...httpConfig
    })

    this.axiosInstance.interceptors.request.use((data) => {
      // tslint:disable-next-line:no-console
      console.log(data.data || data.params)
      return data
    })

    this.axiosInstance.interceptors.response.use(
      (data) => {
        return data
      },
      (err) => {
        // tslint:disable-next-line:no-console
        console.error(err.response.data)
        throw err
      }
    )

    this.signer = getSigner(apiKey, secretKey, passphrase)
  }
}

/**
 * 账户相关API调用
 */
export class AccountApi extends AuthenticatedApi {
  constructor(
    apiUri = 'https://capi.bitget.com',
    httpConfig: AxiosRequestConfig = { timeout: 3000 },
    apiKey: string = '',
    secretKey: string = '',
    passphrase: string = ''
  ) {
    super(...arguments)
  }

  /**
   * 查询所有合约账户信息
   * 限速规则：1次/s
   */
  accounts() {
    const url = '/api/swap/v3/account/accounts'
    const headers = this.signer('GET', url, null)
    return this.axiosInstance.get<BitgetAccountInfo[]>(url, {
      headers
    })
  }

  /**
   * 单个合约账户信息
   * 限速规则：5次/s
   * @param symbol
   */
  getAccount(symbol: string) {
    const url = '/api/swap/v3/account/account'
    const qsOrBody = { symbol }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetAccountInfo>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 获取单个合约的用户配置
   * 限速规则：5次/s
   * @param symbol
   */
  settings(symbol: string) {
    const url = '/api/swap/v3/account/settings'
    const qsOrBody = { symbol }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetAccountSettingInfo>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 调整杠杆
   * 限速规则：5次/s
   * @param symbol
   * @param leverage 要调整的杠杆数(一般为1-100)
   * @param side 持仓方向 1-多仓 2-空仓    //标注废弃
   * @param holdSide   持仓方向 1-多仓 2-空仓
   */
  leverage(symbol: string, leverage: number, side: number,holdSide:number) {
    const url = '/api/swap/v3/account/leverage'
    const qsOrBody = { symbol, leverage, side,holdSide }
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetAccountSettingInfo>(url, qsOrBody, {
      headers
    })
  }

  /**
   * 主账户资产流水(分页)-最多允许查询近三个月的
   * @param symbol
   * @param from
   * @param to
   * @param limit
   * @param startTime 时间区间-起
   * @param endTime 时间区间-止
   */
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
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetLedgerInfo[]>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 列出保证金账户资产流水(分页)-最多允许查询近三个月的
   * @param symbol
   * @param from
   * @param to
   * @param limit
   * @param startTime
   * @param endTime
   */
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
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetLedgerInfo[]>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 调整保证金
   * 限速规则：20次/2s
   * @param symbol
   * @param amount 调整数量
   * @param positionType 仓位 0-多仓 1-空仓
   * @param type 调整方式 1-增加 2-减少
   */
  adjustMargin(symbol: string, amount: string, positionType: number, type: number) {
    const url = '/api/swap/v3/account/adjustMargin'
    const qsOrBody = { symbol, amount, positionType, type }
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetAdjustMarginResult>(url, qsOrBody, {
      headers
    })
  }

  /**
   * 调整自动追加保证金开关
   * 限速规则：5次/s
   * @param symbol
   * @param side 持仓方向 1-多仓 2-空仓   //标注废弃
   * @param holdSide  持仓方向 1-多仓 2-空仓
   * @param appendType 0-关闭 1-打开
   */
  modifyAutoAppendMargin(symbol: string, side: number, appendType: number,holdSide:number) {
    const url = '/api/swap/v3/account/modifyAutoAppendMargin'
    const qsOrBody = { symbol, side, append_type: appendType,number}
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetAutoAppendMarginResult>(url, qsOrBody, {
      headers
    })
  }
}

/**
 * 委托相关API调用
 */
export class OrderApi extends AuthenticatedApi {
  constructor(
    apiUri = 'https://capi.bitget.com',
    httpConfig: AxiosRequestConfig = { timeout: 3000 },
    apiKey: string = '',
    secretKey: string = '',
    passphrase: string = ''
  ) {
    super(...arguments)
  }

  /**
   * 下单
   * 限速规则：10次/s
   * @param order
   */
  postOrder(order: BitgetOrderRequest) {
    const url = '/api/swap/v3/order/placeOrder'
    const headers = this.signer('POST', url, order)
    return this.axiosInstance.post<BitgetOrderResult>(url, order, {
      headers
    })
  }

  /**
   * 批量下单
   * 限速规则：10次/s
   * @param symbol
   * @param orderData
   */
  batchOrders(symbol: string, orderData: BitgetOrderRequest[]) {
    const url = '/api/swap/v3/order/batchOrders'
    const qsOrBody = { symbol, order_data: JSON.stringify(orderData) }
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetBatchOrderResult>(url, qsOrBody, {
      headers
    })
  }

  /**
   * 取消订单
   * 限速规则：10次/s
   * @param symbol
   * @param orderId 委托单号
   */
  cancelOrder(symbol: string, orderId: string) {
    const url = '/api/swap/v3/order/cancel_order'
    const qsOrBody = { symbol, orderId }
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetCancelOrderResult>(url, qsOrBody, {
      headers
    })
  }

  /**
   * 批量撤单
   * 限速规则：10次/s
   * @param symbol
   * @param ids 委托单号的集合
   */
  cancelBathOrders(symbol: string, ids: string[]) {
    const url = '/api/swap/v3/order/cancel_batch_orders'
    const qsOrBody = { symbol, ids }
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetCancelBatchOrderResult>(url, qsOrBody, {
      headers
    })
  }

  /**
   * 获取单订单信息
   * 限速规则：10次/s
   * @param symbol
   * @param orderId 委托单号
   */
  getOrderDetail(symbol: string, orderId: string) {
    const url = '/api/swap/v3/order/detail'
    const qsOrBody = { symbol, orderId }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetOrderDetail>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 获取委托列表(分页)
   * @param symbol
   * @param status 委托状态 -1:已撤单（包含风险触发撤销），0:未成交，1:部分成交，2：完全成交， 3:未成交或部分成交，4：已撤单（包含风险触发撤销）或完全成交 5:所有状态
   * @param from
   * @param to
   * @param limit 每页最多100条，默认100条
   */
  getOrders(symbol: string, status: number, from: number, to: number, limit = 100) {
    const url = '/api/swap/v3/order/orders'
    const qsOrBody = { symbol, status, from, to, limit }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetOrderDetail[]>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 获取订单历史委托(分页)
   * @param symbol   合约名称
   * @param pageIndex  默认是第一页
   * @param pageSize  每页最多100条，默认100条
   * @param createDate   天数必须小于或等于90
   */
   getOrderHistory(symbol:string,pageIndex:number,pageSize:number,createDate:number){
    const url = '/api/swap/v3/order/history'
    const qsOrBody = { symbol,pageIndex,pageSize,createDate }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetOrderDetail[]>(url, {
      headers,
      params: qsOrBody
    })
   }

  /**
   * 获取订单当前委托
   * @param symbol  合约名称
   */
  getOrderCurrent(symbol:string){
      const url = '/api/swap/v3/order/current'
      const qsOrBody = {symbol}
      const headers = this.signer('GET', url, qsOrBody)
      return this.axiosInstance.get<BitgetOrderDetail[]>(url, {
        headers,
        params: qsOrBody
      })
  }

  /**
   * 查询成交明细
   * 限速规则：10次/s
   * @param symbol
   * @param orderId 委托单号
   */
  getFills(symbol: string, orderId: string) {
    const url = '/api/swap/v3/order/fills'
    const qsOrBody = { symbol, orderId }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetOrderFillInfo[]>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 计划委托下单
   * 限速规则：10次/s
   * @param planOrder
   */
  planOrder(planOrder: BitgetPlanOrderRequest) {
    const url = '/api/swap/v3/order/plan_order'
    const headers = this.signer('POST', url, planOrder)
    return this.axiosInstance.post<BitgetPlanOrderResult>(url, planOrder, {
      headers
    })
  }

  /**
   * 取消计划委托
   * @param symbol
   * @param orderId
   */
  cancelPlan(symbol: string, orderId: string) {
    const url = '/api/swap/v3/order/cancel_plan'
    const qsOrBody = { symbol, orderId }
    const headers = this.signer('POST', url, qsOrBody)
    return this.axiosInstance.post<BitgetOrderResult>(url, qsOrBody, {
      headers
    })
  }

  /**
   * 获取当前计划(分页)
   * @param symbol
   * @param side 根据方向获取 1开多 2开空 3平多 4平空   //标注废弃
   * @param delegateType 根据方向获取 1开多 2开空 3平多 4平空
   * @param pageIndex 查询页数
   * @param pageSize 每页条数 最大1000
   * @param startTime 时间范围-起 时间戳
   * @param endTime 时间范围-止 时间戳
   */
  currentPlan(
    symbol: string,
    side: number,
    delegateType: number,
    pageIndex: number,
    pageSize: number,
    startTime: string,
    endTime: string
  ) {
    const url = '/api/swap/v3/order/currentPlan'
    const qsOrBody = { symbol, side, pageIndex, pageSize, startTime, endTime,delegateType}
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetPlanOrderPage>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 查询计划历史委托
   * 限速规则：10次/s
   * @param symbol
   * @param side 方向 1开多 2开空 3平多 4平空  //标注废弃
   * @param delegateType 方向 1开多 2开空 3平多 4平空
   * @param pageIndex
   * @param pageSize
   * @param startTime
   * @param endTime
   */
  historyPlan(
    symbol: string,
    side: number,
    delegateType: number,
    pageIndex: number,
    pageSize: number,
    startTime: string,
    endTime: string
  ) {
    const url = '/api/swap/v3/order/historyPlan'
    const qsOrBody = { symbol, side, pageIndex, pageSize, startTime, endTime,delegateType}
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetPlanOrderPage>(url, {
      headers,
      params: qsOrBody
    })
  }
}

export class PositionApi extends AuthenticatedApi {
  constructor(
    apiUri = 'https://capi.bitget.com',
    httpConfig: AxiosRequestConfig = { timeout: 3000 },
    apiKey: string = '',
    secretKey: string = '',
    passphrase: string = ''
  ) {
    super(...arguments)
  }

  /**
   * 获取全部合约仓位信息
   * 限速规则：5次/s
   */
  getAllPosition() {
    const url = '/api/swap/v3/position/allPosition'
    const headers = this.signer('GET', url, null)
    return this.axiosInstance.get<BitgetPositionPage[]>(url, {
      headers
    })
  }

  /**
   * 获取单个合约仓位信息
   * 限速规则：10次/s
   * @param symbol
   */
  getSinglePosition(symbol: string) {
    const url = '/api/swap/v3/position/singlePosition'
    const qsOrBody = { symbol }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetPositionPage>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 获取合约挂单冻结数量
   * 限速规则：10次/s
   * @param symbol
   */
  getHolds(symbol: string) {
    const url = '/api/swap/v3/position/holds'
    const qsOrBody = { symbol }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetPositionHoldInfo>(url, {
      headers,
      params: qsOrBody
    })
  }

  /**
   * 出入金记录
   * @param symbol
   * @param ftype 类型 1-充值 2-提现
   * @param limit
   * @param gt
   * @param lt
   */
  virtualCapital(symbol: string, ftype: string, limit: number, gt?: number, lt?: number) {
    const url = '/api/swap/v3/position/virtualCapital'
    const qsOrBody: NodeJS.Dict<any> = { symbol, ftype, limit }
    if (gt) {
      qsOrBody.gt = gt
    }
    if (lt) {
      qsOrBody.lt = lt
    }
    const headers = this.signer('GET', url, qsOrBody)
    return this.axiosInstance.get<BitgetVirtualRecordInfo[]>(url, {
      headers,
      params: qsOrBody
    })
  }
}
