
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
API_URL = 'http://192.168.33.2:21890'


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


# ########################################
# ##############【spot url】###############
# ########################################

SPOT_PUBLIC_V1_URL = '/api/spot/v1/public'
SPOT_MARKET_V1_URL = '/api/spot/v1/market'
SPOT_ACCOUNT_V1_URL = '/api/spot/v1/account'
SPOT_ORDER_V1_URL = '/api/spot/v1/trade'


