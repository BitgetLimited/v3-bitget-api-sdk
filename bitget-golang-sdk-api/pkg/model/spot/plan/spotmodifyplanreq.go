package plan

type SpotModifyPlanReq struct {
	OrderId      string `json:"orderId"`
	Size         string `json:"size"`
	ExecutePrice string `json:"executePrice"`
	TriggerPrice string `json:"triggerPrice"`
	OrderType    string `json:"orderType"`
}
