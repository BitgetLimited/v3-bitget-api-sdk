package plan

type CancelPlanReq struct {
	Symbol     string `json:"symbol"`
	MarginCoin string `json:"marginCoin"`
	OrderId    string `json:"orderId"`
	PlanType   string `json:"planType"`
}
