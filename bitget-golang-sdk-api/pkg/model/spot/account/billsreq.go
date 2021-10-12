package account

type BillsReq struct {
	CoinId    string `json:"coinId"`
	GroupType string `json:"groupType"`
	BizType   string `json:"bizType"`
	After     string `json:"after"`
	Before    string `json:"before"`
	Limit     string `json:"limit"`
}
