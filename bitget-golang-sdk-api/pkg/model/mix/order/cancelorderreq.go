package order

type CancelOrderReq struct {
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
	OrderId    string `json:"orderId"`
}
