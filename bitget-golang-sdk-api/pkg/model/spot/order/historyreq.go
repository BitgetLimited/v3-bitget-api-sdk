package order

type HistoryReq struct {
	After  string `json:"after"`
	Before string `json:"before"`
	Limit  string `json:"limit"`
	Symbol string `json:"symbol"`
}
