package order

type BatchOrdersReq struct {
	OrderList []SpotOrdersReq `json:"orderList"`
	Symbol    string          `json:"symbol"`
}
type SpotOrdersReq struct {
	Side          string `json:"side"`
	OrderType     string `json:"orderType"`
	Force         string `json:"force"`
	Price         string `json:"price"`
	Quantity      string `json:"quantity"`
	ClientOrderId string `json:"clientOrderId"`
}
