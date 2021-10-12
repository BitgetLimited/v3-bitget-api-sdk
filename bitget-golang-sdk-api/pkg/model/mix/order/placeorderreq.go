package order

type PlaceOrderReq struct {
	Symbol                string `json:"symbol"`
	MarginCoin            string `json:"marginCoin"`
	Side                  string `json:"side"`
	ClientOid             string `json:"clientOid"`
	Size                  string `json:"size"`
	OrderType             string `json:"orderType"`
	Price                 string `json:"price"`
	TimeInForceValue      string `json:"timeInForceValue"`
	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`
	PresetStopLossPrice   string `json:"presetStopLossPrice"`
}
