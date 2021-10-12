package order

type OrderInfoReq struct {
	Symbol        string `json:"symbol"`
	OrderId       string `json:"orderId"`
	ClientOrderId string `json:"clientOrderId"`
}
