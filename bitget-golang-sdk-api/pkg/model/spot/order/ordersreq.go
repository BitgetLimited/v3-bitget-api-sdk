package order

type OrdersReq struct {
	Symbol        string `json:"symbol"`
	Side          string `json:"side"`
	OrderType     string `json:"orderType"`
	Force         string `json:"force"`
	Price         string `json:"price"`
	Quantity      string `json:"quantity"`
	ClientOrderId string `json:"clientOrderId"`
}
