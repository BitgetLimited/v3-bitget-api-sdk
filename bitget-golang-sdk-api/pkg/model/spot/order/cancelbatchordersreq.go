package order

type CancelBatchOrdersReq struct {
	OrderIds []string `json:"orderIds"`
	Symbol   string   `json:"symbol"`
}
