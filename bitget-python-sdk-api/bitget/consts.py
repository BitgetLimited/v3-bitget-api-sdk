
# http header
CONTENT_TYPE = 'Content-Type'
OK_ACCESS_KEY = 'ACCESS-KEY'
OK_ACCESS_SIGN = 'ACCESS-SIGN'
OK_ACCESS_TIMESTAMP = 'ACCESS-TIMESTAMP'
OK_ACCESS_PASSPHRASE = 'ACCESS-PASSPHRASE'
APPLICATION_JSON = 'application/json'

# header key
ACEEPT = 'Accept'
COOKIE = 'Cookie'
LOCALE = 'locale='

# method
GET = "GET"
POST = "POST"
DELETE = "DELETE"

# Base Url
API_URL = 'https://capi.bitget.com'

# ws Url
CONTRACT_WS_URL = 'wss://ws.bitgetapi.com/spot/v1/stream'

# ########################################
# ##############【swap url】###############
# ########################################
# time
SERVER_TIMESTAMP_URL = '/api/swap/v3/market/time'
# future
FUTURE_ACCOUNTS = '/api/swap/v3/account/accounts'
# 获取所有合约的信息
SWAP_INSTRUMENTS = '/api/swap/v3/market/contracts'
# 获取全部ticker信息
SWAP_TICKETS = '/api/swap/v3/market/tickers'
# ticker信息
SWAP_SOMEONE_TICKER = '/api/swap/v3/market/ticker'
#  合约行情
API_SWAP_V3_ROOT = '/api/swap/v3/market'
# 合约账户
API_SWAP_V3_ACCOUNT = '/api/swap/v3/account'
# 合约订单
API_OPTION_ORDER = '/api/swap/v3/order'
# 合约仓位
API_CONTRACT_ROOT = '/api/swap/v3/position'
# 合约跟单
API_TRACE = '/api/swap/v3/trace'


# ########################################
# ##############【spot url】###############
# ########################################

SPOT_PUBLIC_V1_URL = '/api/spot/v1/public'
SPOT_MARKET_V1_URL = '/api/spot/v1/market'
SPOT_ACCOUNT_V1_URL = '/api/spot/v1/account'
SPOT_ORDER_V1_URL = '/api/spot/v1/trade'

# ########################################
# ##############【mix url】################
# ########################################

MIX_MARKET_V1_URL = '/api/mix/v1/market'
MIX_ACCOUNT_V1_URL = '/api/mix/v1/account'
MIX_POSITION_V1_URL = '/api/mix/v1/position'
MIX_ORDER_V1_URL = '/api/mix/v1/order'
MIX_PLAN_V1_URL = '/api/mix/v1/plan'
MIX_TRACE_V1_URL = '/api/mix/v1/trace'

SUBSCRIBE = 'subscribe'
UNSUBSCRIBE = 'unsubscribe'
LOGIN = 'login'

GET = 'GET'
REQUEST_PATH = '/user/verify'