package order

type ChangeDepthReq struct {
	SymbolId                 string `json:"symbolId"`
	BusinessLine             string `json:"businessLine"`
	SecondBusinessLine       string `json:"secondBusinessLine"`
	RequestTime              string `json:"requestTime"`
	CycleId                  string `json:"cycleId"`
	AskTolerateValue         string `json:"askTolerateValue"`
	AskNegativeTolerateValue string `json:"askNegativeTolerateValue"`
	BidTolerateValue         string `json:"bidTolerateValue"`
	BidNegativeTolerateValue string `json:"bidNegativeTolerateValue"`
	Asks                     string `json:"asks"`
	Bids                     string `json:"bids"`
}
