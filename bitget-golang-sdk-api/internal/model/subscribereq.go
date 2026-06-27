package model

type SubscribeReq struct {
	InstType string `json:"instType"`
	Channel  string `json:"channel"`
	InstId   string `json:"instId"`
	Coin     string `json:"coin"`
}
