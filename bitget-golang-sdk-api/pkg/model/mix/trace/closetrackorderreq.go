package trace

type CloseTrackOrderReq struct {
	TrackingNo string `json:"trackingNo"`
	Symbol     string `json:"symbol"`
}
