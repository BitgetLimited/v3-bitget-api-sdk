package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Get historical delegation list request
 */
type HistoryReq struct {
	/**
	 * The orderId is passed in. The data before the orderId desc
	 */
	After string `json:"after"`
	/**
	 * Pass in the data after the orderId asc
	 */
	Before string `json:"before"`
	/**
	 * Number of returned results Default 100, maximum 500
	 */
	Limit string `json:"limit"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
}
