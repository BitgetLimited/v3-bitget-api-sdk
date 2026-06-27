package constants

const (
	/*
	 * http headers
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
	 * http methods
	 */
	GET  = "GET"
	POST = "POST"

	/*
	 * websocket
	 */
	WsAuthMethod        = "GET"
	WsAuthPath          = "/user/verify"
	WsOpLogin           = "login"
	WsOpUnsubscribe     = "unsubscribe"
	WsOpSubscribe       = "subscribe"
	TimerIntervalSecond = 5
	ReconnectWaitSecond = 60

	/*
	 * SignType
	 */
	RSA    = "RSA"
	SHA256 = "SHA256"
)
