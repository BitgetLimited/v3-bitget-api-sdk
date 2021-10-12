package order

type BatchOrdersReq struct {
	OrderDataList []PlaceOrderBaseParam `json:"orderDataList"`
	Symbol        string                `json:"symbol"`
	MarginCoin    string                `json:"marginCoin"`
}
type PlaceOrderBaseParam struct {
	ClientOid        string `json:"clientOid"`
	Size             string `json:"size"`
	Side             string `json:"side"`
	OrderType        string `json:"orderType"`
	Price            string `json:"price"`
	TimeInForceValue string `json:"timeInForceValue"`
}
