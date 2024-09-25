package config

import "bitget/constants"

const (
	BaseUrl = "https://api.bitget.com"
	WsUrl   = "wss://ws.bitget.com/mix/v1/stream"
	TimeoutSecond = 30
	SignType      = constants.SHA256
)
var(
	ApiKey        = ""
	SecretKey     = ""
	PASSPHRASE    = ""
)
