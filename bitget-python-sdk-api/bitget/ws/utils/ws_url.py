#!/usr/bin/python

# ws url
CONTRACT_WS_URL = '	wss://ws.bitget.com/spot/v1/stream'

# 订阅类型
SUBSCRIBE = 'subscribe'
UNSUBSCRIBE = 'unsubscribe'
LOGIN = 'login'

# 合约 订阅频道 不需要登录
# 行情
SWAP_TICKER = 'swap/ticker'
# k线
SWAP_CANDLES_1M = 'swap/candle60s'
SWAP_CANDLES_5M = 'swap/candle300s'
SWAP_CANDLES_15M = 'swap/candle900s'
SWAP_CANDLES_30M = 'swap/candle1800s'
SWAP_CANDLES_1H = 'swap/candle3600s'
SWAP_CANDLES_4H = 'swap/candle14400s'
SWAP_CANDLES_12H = 'swap/candle43200s'
SWAP_CANDLES_1D = 'swap/candle86400s'
SWAP_CANDLES_1W = 'swap/candle604800s'
# 交易信息频道
SWAP_TRADE = 'swap/trade'
# 资金费率
SWAP_FUNDING_RATE = 'swap/funding_rate'
# 限价范围频道
SWAP_PRICE_RANGE = 'swap/price_range'
# 深度
SWAP_DEPTH = 'swap/depth'
# 标记价格频道
SWAP_MARK_PRICE = 'swap/mark_price'

# 合约 订阅频道 需要登录
# 账户信息
SWAP_ACCOUNT = 'swap/account'
# 持仓信息
SWAP_POSITION = 'swap/position'
# 订单信息
SWAP_ORDER = 'swap/order'


# method 方式
GET = 'GET'
REQUEST_PATH = '/user/verify'

