package plan

type ModifyTPSLPlanReq struct {
	Symbol       string `json:"symbol"`
	MarginCoin   string `json:"marginCoin"`
	OrderId      string `json:"orderId"`
	TriggerPrice string `json:"triggerPrice"`
}
