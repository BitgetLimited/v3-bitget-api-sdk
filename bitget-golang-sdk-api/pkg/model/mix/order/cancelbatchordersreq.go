package order

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Batch cancellation request
 */
type CancelBatchOrdersReq struct {
	/**
	 * Order Id list
	 */
	OrderIds []string `json:"orderIds"`
	/**
	 * Currency pair
	 */
	Symbol string `json:"symbol"`
	/**
	 * Deposit currency
	 */
	MarginCoin string `json:"marginCoin"`
}
