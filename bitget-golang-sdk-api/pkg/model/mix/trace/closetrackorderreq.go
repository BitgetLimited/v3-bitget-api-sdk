package trace

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Dealer closing request
 */
type CloseTrackOrderReq struct {
	/**
	 * The tracking order number comes from the trackingNo of the current interface with the order
	 */
	TrackingNo string `json:"trackingNo"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
}
