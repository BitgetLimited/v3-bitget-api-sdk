package account

type SetMarginModeReq struct {
	MarginMode string `json:"marginMode"`
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
}
