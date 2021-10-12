package order

type FillsReq struct {
	Symbol  string `json:"symbol"`
	OrderId string `json:"orderId"`
	After   string `json:"after"`
	Before  string `json:"before"`
	Limit   string `json:"limit"`
}
