package order

type CancelOrderReq struct {
	Symbol  string `json:"symbol"`
	OrderId string `json:"orderId"`
}
