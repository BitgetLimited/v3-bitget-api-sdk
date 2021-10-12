package account

type OpenCountReq struct {
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
	OpenPrice  string `json:"openPrice"`
	OpenAmount string `json:"openAmount"`
	Leverage   string `json:"leverage"`
}
