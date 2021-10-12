package plan

type PlaceTPSLReq struct {
	Symbol       string `json:"symbol"`
	MarginCoin   string `json:"marginCoin"`
	PlanType     string `json:"planType"`
	TriggerPrice string `json:"triggerPrice"`
	HoldSide     string `json:"holdSide"`
}
