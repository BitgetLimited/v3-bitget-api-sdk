package plan

type SpotPlanReq struct {
	Symbol           string `json:"symbol"`
	Size             string `json:"size"`
	ExecutePrice     string `json:"executePrice"`
	TriggerPrice     string `json:"triggerPrice"`
	Side             string `json:"side"`
	OrderType        string `json:"orderType"`
	TriggerType      string `json:"triggerType"`
	TimeInForceValue string `json:"timeInForceValue"`
	ClientOid        string `json:"clientOid"`
	ChannelApiCode   string `json:"channelApiCode"`
}
