package account

type SetPositionModeReq struct {
	HoldMode   string `json:"holdMode"`
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
}
