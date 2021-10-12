package account

type SetLeveragerReq struct {
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
	Leverage   string `json:"leverage"`
	HoldSide   string `json:"holdSide"`
}
