package plan

type PlacePlanReq struct {
	Symbol                string `json:"symbol"`
	MarginCoin            string `json:"marginCoin"`
	Size                  string `json:"size"`
	ExecutePrice          string `json:"executePrice"`
	TriggerPrice          string `json:"triggerPrice"`
	Side                  string `json:"side"`
	OrderType             string `json:"orderType"`
	TriggerType           string `json:"triggerType"`
	ClientOid             string `json:"clientOid"`
	PresetTakeProfitPrice string `json:"presetTakeProfitPrice"`
	PresetStopLossPrice   string `json:"presetStopLossPrice"`
}
