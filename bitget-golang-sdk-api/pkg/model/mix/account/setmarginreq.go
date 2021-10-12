package account

type SetMarginReq struct {
	HoldSide   string `json:"holdSide"`
	Amount     string `json:"amount"`
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
}
