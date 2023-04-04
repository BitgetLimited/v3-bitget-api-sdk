package constants

const (
	/*
	  http headers
	*/
	ContentType        = "Content-Type"
	BgAccessKey        = "ACCESS-KEY"
	BgAccessSign       = "ACCESS-SIGN"
	BgAccessTimestamp  = "ACCESS-TIMESTAMP"
	BgAccessPassphrase = "ACCESS-PASSPHRASE"
	ApplicationJson    = "application/json"

	EN_US  = "en_US"
	ZH_CN  = "zh_CN"
	LOCALE = "locale="

	/*
	  http methods
	*/
	GET    = "GET"
	POST   = "POST"
	DELETE = "DELETE"

	/*
	 others
	*/
	ResultDataJsonString = "resultDataJsonString"
	ResultPageJsonString = "resultPageJsonString"

	/**
	 * SPOT URL
	 */
	SpotPublic  = "/api/spot/v1/public"
	SpotMarket  = "/api/spot/v1/market"
	SpotAccount = "/api/spot/v1/account"
	SpotTrade   = "/api/spot/v1/trade"
	SpotPlan    = "/api/spot/v1/plan"

	/**
	 * MIX URL
	 */
	MixPlan     = "/api/mix/v1/plan"
	MixMarket   = "/api/mix/v1/market"
	MixAccount  = "/api/mix/v1/account"
	MixOrder    = "/api/mix/v1/order"
	MixPosition = "/api/mix/v1/position"
	MixTrace    = "/api/mix/v1/trace"

	/**
	 * broker url
	 */
	BrokerAccount = "/api/broker/v1/account"

	/**
	websocket
	*/
	WsAuthMethod        = "GET"
	WsAuthPath          = "/user/verify"
	WsOpLogin           = "login"
	WsOpUnsubscribe     = "unsubscribe"
	WsOpSubscribe       = "subscribe"
	TimerIntervalSecond = 5
	ReconnectWaitSecond = 60
)
