package plan

type SpotQueryPlanReq struct {
	Symbol    string `json:"symbol"`
	StartTime string `json:"startTime"`
	EndTime   string `json:"endTime"`
	PageSize  string `json:"pageSize"`
	LastEndId string `json:"lastEndId"`
	IsPre     string `json:"isPre"`
}
