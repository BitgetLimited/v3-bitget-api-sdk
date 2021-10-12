package plan

type ModifyPlanReq struct {
	Symbol       string `json:"symbol"`
	MarginCoin   string `json:"marginCoin"`
	OrderId      string `json:"orderId"`
	ExecutePrice string `json:"executePrice"`
	TriggerPrice string `json:"triggerPrice"`
	TriggerType  string `json:"triggerType"`
	OrderType    string `json:"orderType"`
}
