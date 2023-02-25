package trace

type TraderModifyTPSLOrderReq struct {

	/**
	 * The tracking order number comes from the trackingNo of the current interface with the order
	 */
	TrackingNo string `json:"trackingNo"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`

	StopProfitPrice string `json:"stopProfitPrice"`

	StopLossPrice string `json:"stopLossPrice"`

	ClientOid string `json:"clientOid"`
}
